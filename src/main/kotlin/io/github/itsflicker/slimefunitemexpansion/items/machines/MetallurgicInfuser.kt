package io.github.itsflicker.slimefunitemexpansion.items.machines

import io.github.itsflicker.slimefunitemexpansion.items.IEItems
import io.github.itsflicker.slimefunitemexpansion.util.toKey
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems
import me.mrCookieSlime.Slimefun.Lists.RecipeType
import me.mrCookieSlime.Slimefun.Objects.Category
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem
import org.bukkit.Material
import org.bukkit.inventory.ItemStack

class MetallurgicInfuser(category: Category, item: SlimefunItemStack, recipeType: RecipeType, recipe: Array<ItemStack?>) :
    AContainer(category, item, recipeType, recipe), RecipeDisplayItem {

    override fun getProgressBar(): ItemStack {
        return ItemStack(Material.CROSSBOW)
    }

    override fun getMachineIdentifier(): String {
        return "IE_METALLURGIC_INFUSER"
    }

    override fun registerDefaultRecipes() {
        this.registerRecipe(
            1,
            arrayOf<ItemStack>(
                CustomItem(
                    Material.KNOWLEDGE_BOOK,
                    "§b配方表",
                    "§b1铁锭+1红石粉=1富集合金",
                    "§b1锇锭+1红石粉=1基础控制电路",
                    "§b1铁锭+1碳=1钢锭"
                )
            ),
            arrayOf(
                ItemStack(Material.AIR)
            )
        )
        this.registerRecipe(
            8,
            arrayOf(ItemStack(Material.IRON_INGOT), ItemStack(Material.REDSTONE)),
            arrayOf<ItemStack>(IEItems.ENRICHED_ALLOY)
        )
        this.registerRecipe(
            8,
            arrayOf(IEItems.OSMIUM_INGOT, ItemStack(Material.REDSTONE)),
            arrayOf<ItemStack>(IEItems.BASIC_CONTROL_CIRCUIT)
        )
        this.registerRecipe(
            5,
            arrayOf(ItemStack(Material.IRON_INGOT), SlimefunItems.CARBON),
            arrayOf<ItemStack>(SlimefunItems.STEEL_INGOT)
        )
    }

    companion object {

        val recipeType by lazy {
            RecipeType("metallurgic_infuser".toKey(), IEItems.METALLURGIC_INFUSER)
        }
    }
}