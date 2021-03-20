package com.wlyscraft.slimefunitemexpansion.machines;

import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public class LavaFactory extends AContainer implements RecipeDisplayItem {
    public LavaFactory(Category category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
    }

    @Override
    public ItemStack getProgressBar() {
        return SlimefunItems.LAVA_CRYSTAL;
    }

    @Nonnull
    @Override
    public String getMachineIdentifier() {
        return "IE_LAVA_FACTORY";
    }

    @Override
    public void registerDefaultRecipes() {
        this.registerRecipe(25, new ItemStack[]{new ItemStack(Material.BUCKET)}, new ItemStack[]{new ItemStack(Material.LAVA_BUCKET)});
    }
}
