package io.github.itsflicker.slimefunitemexpansion.items.weapons

import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent
import io.github.thebusybiscuit.slimefun4.core.attributes.Rechargeable
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler
import me.mrCookieSlime.Slimefun.Lists.RecipeType
import me.mrCookieSlime.Slimefun.Objects.Category
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack
import org.bukkit.inventory.ItemStack
import taboolib.platform.util.sendLang

class ElectricCrossbow(category: Category, item: SlimefunItemStack, recipeType: RecipeType, recipe: Array<ItemStack?>, private val capacity: Float) :
    SlimefunItem(category, item, recipeType, recipe), Rechargeable {

    override fun getMaxItemCharge(item: ItemStack): Float {
        return capacity
    }

    private val itemUseHandler: ItemUseHandler
        get() = ItemUseHandler { e: PlayerRightClickEvent ->
            val item = e.item
            if (getItemCharge(item) >= COST) removeItemCharge(
                item,
                COST
            ) else {
                val player = e.player
                player.sendLang("item-no-power", "电动弩")
                e.cancel()
            }
        }

    override fun preRegister() {
        super.preRegister()
        addItemHandler(itemUseHandler)
    }

    companion object {
        private const val COST = 5f
    }
}