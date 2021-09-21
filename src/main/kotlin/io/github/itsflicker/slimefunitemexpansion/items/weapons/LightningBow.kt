package io.github.itsflicker.slimefunitemexpansion.items.weapons

import io.github.thebusybiscuit.slimefun4.core.handlers.BowShootHandler
import io.github.thebusybiscuit.slimefun4.implementation.items.weapons.SlimefunBow
import me.mrCookieSlime.Slimefun.Objects.Category
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack
import org.bukkit.entity.LivingEntity
import org.bukkit.event.entity.EntityDamageByEntityEvent
import org.bukkit.inventory.ItemStack

class LightningBow(category: Category, item: SlimefunItemStack, recipe: Array<ItemStack?>) :
    SlimefunBow(category, item, recipe) {

    override fun onShoot(): BowShootHandler {
        return BowShootHandler { e, target ->
            if (!e.isCancelled) target.world.strikeLightning(target.location)
        }
    }
}