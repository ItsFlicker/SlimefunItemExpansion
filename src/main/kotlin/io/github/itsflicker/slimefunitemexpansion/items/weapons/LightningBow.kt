package io.github.itsflicker.slimefunitemexpansion.items.weapons

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack
import io.github.thebusybiscuit.slimefun4.core.handlers.BowShootHandler
import io.github.thebusybiscuit.slimefun4.implementation.items.weapons.SlimefunBow
import org.bukkit.inventory.ItemStack

class LightningBow(itemGroup: ItemGroup, item: SlimefunItemStack, recipe: Array<ItemStack?>) :
    SlimefunBow(itemGroup, item, recipe) {

    override fun onShoot(): BowShootHandler {
        return BowShootHandler { e, target ->
            if (!e.isCancelled) target.world.strikeLightning(target.location)
        }
    }
}