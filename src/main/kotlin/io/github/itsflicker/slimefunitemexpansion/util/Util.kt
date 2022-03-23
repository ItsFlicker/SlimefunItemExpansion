package io.github.itsflicker.slimefunitemexpansion.util

import io.github.itsflicker.slimefunitemexpansion.SlimefunItemExpansion
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup
import io.github.thebusybiscuit.slimefun4.api.items.ItemHandler
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock
import io.github.thebusybiscuit.slimefun4.implementation.items.multiblocks.MakeshiftSmeltery
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer
import org.bukkit.NamespacedKey
import org.bukkit.inventory.ItemStack

fun String.toKey(): NamespacedKey {
    return NamespacedKey(SlimefunItemExpansion.plugin, this)
}

fun SlimefunItemStack.regItem(
    itemGroup: ItemGroup,
    recipeType: RecipeType,
    recipe: Array<ItemStack?>,
    vararg itemHandlers: ItemHandler = arrayOf(),
    usableInWorkbench: Boolean = false
) {
    val sfi = SlimefunItem(itemGroup, this, recipeType, recipe)
    sfi.isUseableInWorkbench = usableInWorkbench
    if (itemHandlers.isNotEmpty()) {
        sfi.addItemHandler(*itemHandlers)
    }
    sfi.register(SlimefunItemExpansion)
}

fun SlimefunItemStack.regNonPlaceableItem(itemGroup: ItemGroup, rt: RecipeType, recipe: Array<ItemStack?>) {
    UnplaceableBlock(itemGroup, this, rt, recipe).register(SlimefunItemExpansion)
}

private fun registerMachineRecipe(machine: String, seconds: Int, input: Array<ItemStack>, output: Array<ItemStack>) {
    for (item in Slimefun.getRegistry().enabledSlimefunItems) {
        if (item is AContainer && item.machineIdentifier == machine) {
            item.registerRecipe(seconds, input, output)
        }
    }
}

fun addSmelteryRecipe(input: ItemStack, output: ItemStack) {
    val makeshiftSmeltery = SlimefunItems.MAKESHIFT_SMELTERY.item as MakeshiftSmeltery?
    makeshiftSmeltery!!.addRecipe(arrayOf(input), output)
    registerMachineRecipe(
        "ELECTRIC_INGOT_FACTORY",
        8,
        arrayOf(input),
        arrayOf(output)
    )
    registerMachineRecipe(
        "ELECTRIC_INGOT_PULVERIZER",
        3,
        arrayOf(output),
        arrayOf(input)
    )
}
