package com.wlyscraft.slimefunitemexpansion.machines;

import com.wlyscraft.slimefunitemexpansion.Items;
import com.wlyscraft.slimefunitemexpansion.SlimefunItemExpansion;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public class MetallurgicInfuser extends AContainer implements RecipeDisplayItem {

    public MetallurgicInfuser(Category category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
    }

    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.CROSSBOW);
    }

    @Nonnull
    @Override
    public String getMachineIdentifier() {
        return "IE_METALLURGIC_INFUSER";
    }

    @Override
    public void registerDefaultRecipes() {
        this.registerRecipe(1, new ItemStack[]{new CustomItem(Material.KNOWLEDGE_BOOK, "§b配方表", "§b1铁锭+1红石粉=1富集合金", "§b1锇锭+1红石粉=1基础控制电路", "§b1铁锭+1压缩碳=1钢锭")}, new ItemStack[]{new CustomItem(Material.KNOWLEDGE_BOOK, "§b配方表", "§b1铁锭+1红石粉=1富集合金", "§b1锇锭+1红石粉=1基础控制电路", "§b1铁锭+1压缩碳=1钢锭")});
        this.registerRecipe(8, new ItemStack[]{new ItemStack(Material.IRON_INGOT), new ItemStack(Material.REDSTONE)}, new ItemStack[]{Items.ENRICHED_ALLOY});
        this.registerRecipe(8, new ItemStack[]{Items.OSMIUM_INGOT, new ItemStack(Material.REDSTONE)}, new ItemStack[]{Items.BASIC_CONTROL_CIRCUIT});
        this.registerRecipe(8, new ItemStack[]{new ItemStack(Material.IRON_INGOT), SlimefunItems.CARBON}, new ItemStack[]{SlimefunItems.STEEL_INGOT});
    }

    public static RecipeType recipeType() {
        return new RecipeType(new NamespacedKey(SlimefunItemExpansion.getInstance(), "metallurgic_infuser"), Items.METALLURGIC_INFUSER);
    }
}
