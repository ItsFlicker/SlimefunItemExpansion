package io.github.itsflicker.slimefunitemexpansion.items.machines

import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems
import me.mrCookieSlime.Slimefun.Lists.RecipeType
import me.mrCookieSlime.Slimefun.Objects.Category
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack
import org.bukkit.Material
import org.bukkit.inventory.ItemStack

class CompressedFreezer(category: Category, item: SlimefunItemStack, recipeType: RecipeType, recipe: Array<ItemStack?>) :
    AContainer(category, item, recipeType, recipe), RecipeDisplayItem {

    override fun registerDefaultRecipes() {
        registerRecipe(
            20,
            arrayOf(ItemStack(Material.WATER_BUCKET)),
            arrayOf(ItemStack(Material.BUCKET), ItemStack(SlimefunItems.REACTOR_COOLANT_CELL))
        )
    }

    override fun getDisplayRecipes(): List<ItemStack> {
        val displayRecipes: MutableList<ItemStack> = ArrayList(recipes.size * 2)
        for (recipe in recipes) {
            displayRecipes.add(recipe.input[0])
            displayRecipes.add(recipe.output[recipe.output.size - 1])
        }
        return displayRecipes
    }

    override fun getProgressBar(): ItemStack {
        return ItemStack(Material.NETHERITE_PICKAXE)
    }

    override fun getMachineIdentifier(): String {
        return "IE_COMPRESSED_FREEZER"
    }
}