package com.wlyscraft.slimefunitemexpansion.resources;

import com.wlyscraft.slimefunitemexpansion.Items;
import com.wlyscraft.slimefunitemexpansion.SlimefunItemExpansion;
import io.github.thebusybiscuit.slimefun4.api.geo.GEOResource;
import org.bukkit.NamespacedKey;
import org.bukkit.World;
import org.bukkit.block.Biome;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public class OsmiumResource implements GEOResource {
    @Override
    public int getDefaultSupply(@Nonnull World.Environment environment, @Nonnull Biome biome) {
        if(environment == World.Environment.NORMAL) return 4;
        else return 0;
    }

    @Override
    public int getMaxDeviation() {
        // 浮动值
        return 3;
    }

    @Nonnull
    @Override
    public String getName() {
        return "锇粉";
    }

    @Nonnull
    @Override
    public ItemStack getItem() {
        return Items.OSMIUM_DUST;
    }

    @Override
    public boolean isObtainableFromGEOMiner() {
        return true;
    }

    @Nonnull
    @Override
    public NamespacedKey getKey() {
        return new NamespacedKey(SlimefunItemExpansion.getInstance(), "IE_OSMIUM_DUST_RESOURCE");
    }
}
