package com.wlyscraft.slimefunitemexpansion.machines;

import com.wlyscraft.slimefunitemexpansion.items.Items;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;


public class PhytogenicInsolator extends AContainer {
    public PhytogenicInsolator(Category category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
    }

    @Override
    protected void registerDefaultRecipes() {
        registerRecipe(5, new ItemStack[] {Items.JIN_KE_LA, new ItemStack(Material.WHEAT_SEEDS)}, new ItemStack[] {new ItemStack(Material.WHEAT_SEEDS), new ItemStack(Material.WHEAT, 3)});
        registerRecipe(5, new ItemStack[] {Items.JIN_KE_LA, new ItemStack(Material.APPLE)}, new ItemStack[] {new ItemStack(Material.APPLE, 2)});
        registerRecipe(5, new ItemStack[] {Items.JIN_KE_LA, new ItemStack(Material.POTATO)}, new ItemStack[] {new ItemStack(Material.POTATO, 4)});
        registerRecipe(5, new ItemStack[] {Items.JIN_KE_LA, new ItemStack(Material.CARROT)}, new ItemStack[] {new ItemStack(Material.CARROT, 4)});
        registerRecipe(5, new ItemStack[] {Items.JIN_KE_LA, new ItemStack(Material.BEETROOT_SEEDS)}, new ItemStack[] {new ItemStack(Material.BEETROOT_SEEDS), new ItemStack(Material.BEETROOT, 4)});
        registerRecipe(5, new ItemStack[] {Items.JIN_KE_LA, new ItemStack(Material.SWEET_BERRIES)}, new ItemStack[] {new ItemStack(Material.SWEET_BERRIES, 5)});
        registerRecipe(5, new ItemStack[] {Items.JIN_KE_LA, new ItemStack(Material.MELON_SEEDS)}, new ItemStack[] {new ItemStack(Material.MELON_SEEDS), new ItemStack(Material.MELON, 2)});
        registerRecipe(5, new ItemStack[] {Items.JIN_KE_LA, new ItemStack(Material.PUMPKIN_SEEDS)}, new ItemStack[] {new ItemStack(Material.PUMPKIN_SEEDS), new ItemStack(Material.PUMPKIN, 2)});
        registerRecipe(5, new ItemStack[] {Items.JIN_KE_LA, new ItemStack(Material.COCOA_BEANS)}, new ItemStack[] {new ItemStack(Material.COCOA_BEANS, 5)});
    }

    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.GOLDEN_HOE);
    }

    @Nonnull
    @Override
    public String getMachineIdentifier() {
        return "IE_PHYTOGENICINSOLATOR";
    }
}
