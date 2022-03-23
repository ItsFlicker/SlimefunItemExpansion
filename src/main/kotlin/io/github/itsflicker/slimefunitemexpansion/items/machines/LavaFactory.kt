package io.github.itsflicker.slimefunitemexpansion.items.machines

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer
import org.bukkit.Material
import org.bukkit.inventory.ItemStack

class LavaFactory(itemGroup: ItemGroup, item: SlimefunItemStack, recipeType: RecipeType, recipe: Array<ItemStack?>) :
    AContainer(itemGroup, item, recipeType, recipe), RecipeDisplayItem {

    override fun getProgressBar(): ItemStack {
        return SlimefunItems.LAVA_CRYSTAL
    }

    override fun getMachineIdentifier(): String {
        return "IE_LAVA_FACTORY"
    }

    public override fun registerDefaultRecipes() {
        this.registerRecipe(30, arrayOf(ItemStack(Material.BUCKET)), arrayOf(ItemStack(Material.LAVA_BUCKET)))
    }
}