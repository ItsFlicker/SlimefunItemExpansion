package com.wlyscraft.slimefunitemexpansion.machines;

import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AGenerator;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineFuel;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public class DeathGenerator extends AGenerator {
    public DeathGenerator(Category category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
    }

    @Nonnull
    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.BONE_BLOCK);
    }

    @Override
    protected void registerDefaultFuelTypes() {
        this.registerFuel(new MachineFuel(1, new ItemStack(Material.ROTTEN_FLESH)));
        this.registerFuel(new MachineFuel(1, new ItemStack(Material.BONE)));
        this.registerFuel(new MachineFuel(3, new ItemStack(Material.BONE_BLOCK)));
        this.registerFuel(new MachineFuel(45, new ItemStack(Material.WITHER_SKELETON_SKULL)));
    }
}
