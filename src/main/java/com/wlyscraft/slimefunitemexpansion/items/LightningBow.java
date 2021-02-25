package com.wlyscraft.slimefunitemexpansion.items;

import io.github.thebusybiscuit.slimefun4.core.handlers.BowShootHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.weapons.SlimefunBow;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import java.util.Random;

public class LightningBow extends SlimefunBow {

    Random r = new Random();

    public LightningBow(Category category, SlimefunItemStack item, ItemStack[] recipe) {
        super(category, item, recipe);
    }

    @Nonnull
    @Override
    public BowShootHandler onShoot() {
        return (e, target) -> {
            if (r.nextInt(100) <= 24) target.getWorld().strikeLightningEffect(target.getLocation());
        };
    }
}
