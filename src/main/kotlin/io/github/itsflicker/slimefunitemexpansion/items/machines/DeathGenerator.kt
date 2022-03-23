package io.github.itsflicker.slimefunitemexpansion.items.machines

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AGenerator
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineFuel
import org.bukkit.Material
import org.bukkit.inventory.ItemStack

class DeathGenerator(itemGroup: ItemGroup, item: SlimefunItemStack, recipeType: RecipeType, recipe: Array<ItemStack?>) :
    AGenerator(itemGroup, item, recipeType, recipe) {

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