package com.wlyscraft.slimefunitemexpansion.resources;

import com.wlyscraft.slimefunitemexpansion.items.IEItems;
import com.wlyscraft.slimefunitemexpansion.SlimefunItemExpansion;
import io.github.thebusybiscuit.slimefun4.api.geo.GEOResource;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.World;
import org.bukkit.block.Biome;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public class OsmiumDust extends SlimefunItem implements GEOResource {
    public static final SlimefunItemStack OSMIUM_DUST = new SlimefunItemStack("OSMIUM_DUST", Material.SUGAR, "§6锇粉");

    public OsmiumDust(Category category) {
        super(category, OSMIUM_DUST, RecipeType.GEO_MINER, new ItemStack[0]);
        register();
    }

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
        return OSMIUM_DUST;
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
