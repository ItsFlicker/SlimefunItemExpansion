package com.wlyscraft.slimefunitemexpansion.machines;

import com.wlyscraft.slimefunitemexpansion.Items;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public class AlloyFurnace extends AContainer implements RecipeDisplayItem {
    public AlloyFurnace(Category category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
    }

    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.FLINT_AND_STEEL);
    }

    @Override
    public int getEnergyConsumption() {
        // (J/s)
        return 16;
    }

    @Override
    public int getSpeed() {
        return 1;
    }

    @Nonnull
    @Override
    public String getMachineIdentifier() {
        return "IE_ALLOY_FURNACE";
    }

    @Override
    public int getCapacity() {
        // (J)
        return 256;
    }

    @Override
    public void registerDefaultRecipes() {
        this.registerRecipe(1, new ItemStack[]{new CustomItem(Material.KNOWLEDGE_BOOK, "§b配方表", "§b1圆石齿轮+1铁锭=1铁齿轮", "§b1沙子+1金粉=1金锭(原版)")}, new ItemStack[]{new CustomItem(Material.KNOWLEDGE_BOOK, "§b配方表", "§b1圆石齿轮+1铁锭=1铁齿轮", "§b1沙子+1金粉=1金锭(原版)")});
        this.registerRecipe(4, new ItemStack[]{Items.COBBLESTONE_GEAR, new ItemStack(Material.IRON_INGOT)}, new ItemStack[]{Items.IRON_GEAR});
        this.registerRecipe(1, new ItemStack[]{new ItemStack(Material.SAND), SlimefunItems.GOLD_DUST}, new ItemStack[]{new ItemStack(Material.GOLD_INGOT)});
    }

}
