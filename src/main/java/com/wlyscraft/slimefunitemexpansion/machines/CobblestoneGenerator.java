package com.wlyscraft.slimefunitemexpansion.machines;

import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public class CobblestoneGenerator extends AContainer {
    public CobblestoneGenerator(Category category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
    }


    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.STONE_PICKAXE);
    }


    @Nonnull
    @Override
    public String getMachineIdentifier() {
        return "IE_COBBLESTONE_GENERATOR";
    }


    @Override
    public void registerDefaultRecipes() {
        this.registerRecipe(5, new ItemStack[]{}, new ItemStack[]{new ItemStack(Material.COBBLESTONE)});
    }

}
