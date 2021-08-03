package io.github.itsflicker.slimefunitemexpansion.items.tools

import io.github.thebusybiscuit.slimefun4.core.attributes.Rechargeable
import io.github.thebusybiscuit.slimefun4.core.handlers.ToolUseHandler
import me.mrCookieSlime.Slimefun.Lists.RecipeType
import me.mrCookieSlime.Slimefun.Objects.Category
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack
import org.bukkit.event.block.BlockBreakEvent
import org.bukkit.inventory.ItemStack
import taboolib.platform.util.sendLang

class Drill(category: Category, item: SlimefunItemStack, recipeType: RecipeType, recipe: Array<ItemStack?>, private val capacity: Float) :
    SlimefunItem(category, item, recipeType, recipe), Rechargeable {

    override fun getMaxItemCharge(item: ItemStack): Float {
        return capacity
    }

    private val toolUseHandler: ToolUseHandler
        get() = ToolUseHandler { e, tool, _, _ ->
            if (getItemCharge(tool) >= COST) {
                removeItemCharge(tool, COST)
            } else {
                val player = e.player
                player.sendLang("item-no-power", "手钻")
                e.isCancelled = true
            }
        }

    override fun preRegister() {
        addItemHandler(toolUseHandler)
    }

    companion object {

        private const val COST = 0.1F
    }
}