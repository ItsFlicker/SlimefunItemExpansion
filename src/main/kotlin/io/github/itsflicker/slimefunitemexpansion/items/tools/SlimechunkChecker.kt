package io.github.itsflicker.slimefunitemexpansion.items.tools

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType
import io.github.thebusybiscuit.slimefun4.core.attributes.Rechargeable
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler
import org.bukkit.inventory.ItemStack
import taboolib.platform.util.sendLang

class SlimechunkChecker(itemGroup: ItemGroup, item: SlimefunItemStack, recipeType: RecipeType, recipe: Array<ItemStack?>, private val capacity: Float) :
    SlimefunItem(itemGroup, item, recipeType, recipe), Rechargeable {

    override fun getMaxItemCharge(item: ItemStack): Float {
        return capacity
    }

    private val itemUseHandler: ItemUseHandler
        get() = ItemUseHandler { e ->
            val item = e.item
            val player = e.player
            if (getItemCharge(item) >= COST) {
                removeItemCharge(item, COST)
                if (player.location.chunk.isSlimeChunk) player.sendLang("item-slimechunk-true")
                else player.sendLang("item-slimechunk-false")
            } else {
                player.sendLang("item-no-power", "史莱姆区块检测器")
            }
            e.cancel()
        }

    override fun preRegister() {
        addItemHandler(itemUseHandler)
    }

    companion object {

        private const val COST = 100F
    }
}