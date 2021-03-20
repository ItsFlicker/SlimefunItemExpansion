package com.wlyscraft.slimefunitemexpansion.items.weapons;

import io.github.thebusybiscuit.slimefun4.core.handlers.BowShootHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.weapons.SlimefunBow;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public class LightningBow extends SlimefunBow {

    public LightningBow(Category category, SlimefunItemStack item, ItemStack[] recipe) {
        super(category, item, recipe);
    }

    @Nonnull
    @Override
    public BowShootHandler onShoot() {
        return (e, target) -> {
            if (!e.isCancelled()) target.getWorld().strikeLightning(target.getLocation());
        };
    }
}
