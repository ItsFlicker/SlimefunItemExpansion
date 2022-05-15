package io.github.itsflicker.slimefunitemexpansion.items

import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup
import io.github.thebusybiscuit.slimefun4.api.items.ItemSetting
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack
import io.github.thebusybiscuit.slimefun4.api.items.settings.IntRangeSetting
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable
import io.github.thebusybiscuit.slimefun4.core.attributes.RandomMobDrop
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem
import org.bukkit.inventory.ItemStack

class HopeFlower(itemGroup: ItemGroup, item: SlimefunItemStack, recipeType: RecipeType, recipe: Array<ItemStack?>) :
    SimpleSlimefunItem<ItemUseHandler>(itemGroup, item, recipeType, recipe), NotPlaceable, RandomMobDrop {

    private val dropSetting = ItemSetting(this, "drop-from-villagers", true)
    private val chance: ItemSetting<Int> = IntRangeSetting(this, "villagers-drop-chance", 0, 5, 100)

    override fun getMobDropChance(): Int {
        return chance.value
    }

    val isDroppedFromPlayers: Boolean
        get() = dropSetting.value

    override fun getItemHandler(): ItemUseHandler {
        return ItemUseHandler { obj: PlayerRightClickEvent -> obj.cancel() }
    }

    init {
        addItemSetting(dropSetting)
        addItemSetting(chance)
    }
}