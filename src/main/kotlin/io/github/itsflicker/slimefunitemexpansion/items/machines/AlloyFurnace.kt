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

class AlloyFurnace(category: Category, item: SlimefunItemStack, recipeType: RecipeType, recipe: Array<ItemStack?>) :
    AContainer(category, item, recipeType, recipe), RecipeDisplayItem {

    override fun getProgressBar(): ItemStack {
        return ItemStack(Material.FLINT_AND_STEEL)
    }

    override fun getMachineIdentifier(): String {
        return "IE_ALLOY_FURNACE"
    }

    public override fun registerDefaultRecipes() {
        this.registerRecipe(
            1,
            arrayOf<ItemStack>(
                CustomItem(
                    Material.KNOWLEDGE_BOOK,
                    "§b配方表",
                    "§b1圆石齿轮+1铁锭=1铁齿轮",
                    "§b1沙子+1金粉=1金锭(原版)",
                    "§b1锇锭+1荧石粉=1强化荧石锭",
                    "§b1黑曜石+1压缩经验方块=1强化黑曜石",
                    "§b1强化荧石锭+1强化黑曜石=1锇荧黑曜合金锭"
                )
            ),
            arrayOf(
                ItemStack(Material.AIR)
            )
        )
        this.registerRecipe(
            8,
            arrayOf(IEItems.COBBLESTONE_GEAR, ItemStack(Material.IRON_INGOT)),
            arrayOf<ItemStack>(IEItems.IRON_GEAR)
        )
        this.registerRecipe(
            8,
            arrayOf(ItemStack(Material.SAND), SlimefunItems.GOLD_DUST),
            arrayOf(ItemStack(Material.GOLD_INGOT))
        )
        this.registerRecipe(
            10,
            arrayOf(IEItems.OSMIUM_INGOT, ItemStack(Material.GLOWSTONE_DUST)),
            arrayOf<ItemStack>(IEItems.ENHANCED_GLOWSTONE)
        )
        this.registerRecipe(
            12,
            arrayOf(ItemStack(Material.OBSIDIAN), SlimefunItems.HARDENED_GLASS),
            arrayOf<ItemStack>(IEItems.ENHANCED_OBSIDIAN)
        )
        this.registerRecipe(
            16,
            arrayOf<ItemStack>(IEItems.ENHANCED_GLOWSTONE, IEItems.ENHANCED_OBSIDIAN),
            arrayOf<ItemStack>(IEItems.OSGLOGLAS_INGOT)
        )
    }

    companion object {

        val recipeType by lazy {
            RecipeType("alloy_furnace".toKey(), IEItems.ALLOY_FURNACE)
        }
    }
}