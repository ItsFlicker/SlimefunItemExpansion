package io.github.itsflicker.slimefunitemexpansion.items.tools

import io.github.thebusybiscuit.slimefun4.core.attributes.Rechargeable
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler
import io.github.thebusybiscuit.slimefun4.core.handlers.ToolUseHandler
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunPlugin
import me.mrCookieSlime.Slimefun.Lists.RecipeType
import me.mrCookieSlime.Slimefun.Objects.Category
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack
import me.mrCookieSlime.Slimefun.cscorelib2.protection.ProtectableAction
import org.bukkit.Material
import org.bukkit.inventory.ItemStack
import taboolib.platform.util.sendLang

class ElectricCutter(category: Category, item: SlimefunItemStack, recipeType: RecipeType, recipe: Array<ItemStack?>, private val capacity: Float) :
    SlimefunItem(category, item, recipeType, recipe), Rechargeable {

    override fun getMaxItemCharge(item: ItemStack): Float {
        return capacity
    }

    private val itemUseHandler: ItemUseHandler
        get() = ItemUseHandler { e ->
            val item = e.item
            val player = e.player
            if (!e.clickedBlock.isPresent) {
                return@ItemUseHandler
            }
            val b = e.clickedBlock.get()
            if (!SlimefunPlugin.getProtectionManager().hasPermission(e.player, b.location, ProtectableAction.BREAK_BLOCK)) {
                return@ItemUseHandler
            }
            if (getItemCharge(item) >= COST && b.type == Material.OBSIDIAN) {
                removeItemCharge(item, COST)
                b.breakNaturally(ItemStack(Material.DIAMOND_PICKAXE))
            } else {
                player.sendLang("item-no-power", "电动切割器")
            }
            e.cancel()
        }

    private val toolUseHandler: ToolUseHandler
        get() {
            return ToolUseHandler { e, _, _, _ ->
                e.isCancelled = true
            }
        }

    override fun preRegister() {
        addItemHandler(itemUseHandler, toolUseHandler)
    }

    companion object {

        private const val COST: Float = 2F
    }
}