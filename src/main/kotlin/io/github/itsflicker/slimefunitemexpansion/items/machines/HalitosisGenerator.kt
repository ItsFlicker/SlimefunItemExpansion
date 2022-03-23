package io.github.itsflicker.slimefunitemexpansion.items.machines

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AGenerator
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineFuel
import org.bukkit.Material
import org.bukkit.inventory.ItemStack

class HalitosisGenerator(itemGroup: ItemGroup, item: SlimefunItemStack, recipeType: RecipeType, recipe: Array<ItemStack?>) :
    AGenerator(itemGroup, item, recipeType, recipe) {

    override fun getProgressBar(): ItemStack {
        return ItemStack(Material.GLASS_BOTTLE)
    }

    override fun registerDefaultFuelTypes() {
        registerFuel(MachineFuel(60, ItemStack(Material.DRAGON_BREATH)))
    }
}