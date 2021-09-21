package io.github.itsflicker.slimefunitemexpansion.items.machines

import me.mrCookieSlime.Slimefun.Lists.RecipeType
import me.mrCookieSlime.Slimefun.Objects.Category
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AGenerator
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineFuel
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack
import org.bukkit.Material
import org.bukkit.inventory.ItemStack

class HalitosisGenerator(category: Category, item: SlimefunItemStack, recipeType: RecipeType, recipe: Array<ItemStack?>) :
    AGenerator(category, item, recipeType, recipe) {

    override fun getProgressBar(): ItemStack {
        return ItemStack(Material.GLASS_BOTTLE)
    }

    override fun registerDefaultFuelTypes() {
        registerFuel(MachineFuel(60, ItemStack(Material.DRAGON_BREATH)))
    }
}