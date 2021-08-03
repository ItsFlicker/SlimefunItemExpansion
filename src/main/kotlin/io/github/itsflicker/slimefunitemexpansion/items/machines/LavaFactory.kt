package io.github.itsflicker.slimefunitemexpansion.items.machines

import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems
import me.mrCookieSlime.Slimefun.Lists.RecipeType
import me.mrCookieSlime.Slimefun.Objects.Category
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack
import org.bukkit.Material
import org.bukkit.inventory.ItemStack

class LavaFactory(category: Category, item: SlimefunItemStack, recipeType: RecipeType, recipe: Array<ItemStack?>) :
    AContainer(category, item, recipeType, recipe), RecipeDisplayItem {

    override fun getProgressBar(): ItemStack {
        return SlimefunItems.LAVA_CRYSTAL
    }

    override fun getMachineIdentifier(): String {
        return "IE_LAVA_FACTORY"
    }

    public override fun registerDefaultRecipes() {
        this.registerRecipe(25, arrayOf(ItemStack(Material.BUCKET)), arrayOf(ItemStack(Material.LAVA_BUCKET)))
    }
}