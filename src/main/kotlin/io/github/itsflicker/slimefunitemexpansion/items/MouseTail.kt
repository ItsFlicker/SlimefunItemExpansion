package io.github.itsflicker.slimefunitemexpansion.items

import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent
import io.github.thebusybiscuit.slimefun4.api.items.ItemSetting
import io.github.thebusybiscuit.slimefun4.api.items.settings.IntRangeSetting
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable
import io.github.thebusybiscuit.slimefun4.core.attributes.RandomMobDrop
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem
import me.mrCookieSlime.Slimefun.Lists.RecipeType
import me.mrCookieSlime.Slimefun.Objects.Category
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack
import org.bukkit.inventory.ItemStack
import javax.annotation.ParametersAreNonnullByDefault

class MouseTail (category: Category, item: SlimefunItemStack, recipeType: RecipeType, recipe: Array<ItemStack?>) :
    SimpleSlimefunItem<ItemUseHandler>(category, item, recipeType, recipe), NotPlaceable, RandomMobDrop {

    private val dropSetting = ItemSetting(this, "drop-from-silverfish", true)
    private val chance = IntRangeSetting(this, "silverfish-drop-chance", 0, 5, 100)

    override fun getMobDropChance(): Int {
        return chance.value
    }

    val isDroppedFromSilverfish: Boolean
        get() = dropSetting.value

    override fun getItemHandler(): ItemUseHandler {
        return ItemUseHandler { obj: PlayerRightClickEvent -> obj.cancel() }
    }

    init {
        addItemSetting(dropSetting)
        addItemSetting(chance)
    }
}