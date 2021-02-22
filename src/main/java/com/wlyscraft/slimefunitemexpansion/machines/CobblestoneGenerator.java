package com.wlyscraft.slimefunitemexpansion.machines;

import com.wlyscraft.slimefunitemexpansion.Items;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
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

    @Override
    public int getEnergyConsumption() {
        // (J/s)
        return 20;
    }

    @Override
    public int getSpeed() {
        return 1;
    }

    @Nonnull
    @Override
    public String getMachineIdentifier() {
        return "IE_COBBLESTONE_GENERATOR";
    }

    @Override
    public int getCapacity() {
        // (J)
        return 256;
    }

    @Override
    public void registerDefaultRecipes() {
        this.registerRecipe(2, new ItemStack[]{}, new ItemStack[]{new ItemStack(Material.COBBLESTONE)});
    }

}
