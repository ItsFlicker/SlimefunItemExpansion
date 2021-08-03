package io.github.itsflicker.slimefunitemexpansion.items.machines

import me.mrCookieSlime.Slimefun.Lists.RecipeType
import me.mrCookieSlime.Slimefun.Objects.Category
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AGenerator
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineFuel
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack
import org.bukkit.Material
import org.bukkit.inventory.ItemStack

class DeathGenerator(category: Category, item: SlimefunItemStack, recipeType: RecipeType, recipe: Array<ItemStack?>) :
    AGenerator(category, item, recipeType, recipe) {

    override fun getProgressBar(): ItemStack {
        return ItemStack(Material.BONE_BLOCK)
    }

    override fun registerDefaultFuelTypes() {
        registerFuel(MachineFuel(1, ItemStack(Material.ROTTEN_FLESH)))
        registerFuel(MachineFuel(1, ItemStack(Material.BONE)))
        registerFuel(MachineFuel(3, ItemStack(Material.BONE_BLOCK)))
        registerFuel(MachineFuel(45, ItemStack(Material.WITHER_SKELETON_SKULL)))
    }
}