package io.github.itsflicker.slimefunitemexpansion.util

import io.github.itsflicker.slimefunitemexpansion.SlimefunItemExpansion
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunPlugin
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock
import io.github.thebusybiscuit.slimefun4.implementation.items.multiblocks.MakeshiftSmeltery
import me.mrCookieSlime.Slimefun.Lists.RecipeType
import me.mrCookieSlime.Slimefun.Objects.Category
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer
import me.mrCookieSlime.Slimefun.Objects.handlers.ItemHandler
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack
import org.bukkit.NamespacedKey
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack
import taboolib.common.platform.function.adaptPlayer

fun String.toKey(): NamespacedKey {
    return NamespacedKey(SlimefunItemExpansion.plugin, this)
}

fun Player.sendActionBar(message: String) {
    adaptPlayer(this).sendActionBar(message)
}

fun SlimefunItemStack.regItem(category: Category, rt: RecipeType, recipe: Array<ItemStack?>) {
    val sfi = SlimefunItem(category, this, rt, recipe)
    sfi.register(SlimefunItemExpansion)
}

fun SlimefunItemStack.regItem(category: Category, rt: RecipeType, recipe: Array<ItemStack?>, vararg ith: ItemHandler) {
    val sfi = SlimefunItem(category, this, rt, recipe)
    for (it: ItemHandler in ith){
        sfi.addItemHandler(it)
    }
    sfi.register(SlimefunItemExpansion)
}

fun SlimefunItemStack.regUsableInWorkbenchItem(category: Category, rt: RecipeType, recipe: Array<ItemStack?>) {
    val sfi = SlimefunItem(category, this, rt, recipe)
    sfi.isUseableInWorkbench = true
    sfi.register(SlimefunItemExpansion)
}

fun SlimefunItemStack.regNonPlaceableItem(category: Category, rt: RecipeType, recipe: Array<ItemStack?>) {
    UnplaceableBlock(category, this, rt, recipe).register(SlimefunItemExpansion)
}

private fun registerMachineRecipe(machine: String, seconds: Int, input: Array<ItemStack>, output: Array<ItemStack>) {
    for (item in SlimefunPlugin.getRegistry().enabledSlimefunItems) {
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
