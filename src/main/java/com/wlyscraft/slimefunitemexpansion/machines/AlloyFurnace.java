package com.wlyscraft.slimefunitemexpansion.machines;

import com.wlyscraft.slimefunitemexpansion.items.Items;
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

public class AlloyFurnace extends AContainer implements RecipeDisplayItem {
    public AlloyFurnace(Category category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
    }

    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.FLINT_AND_STEEL);
    }


    @Nonnull
    @Override
    public String getMachineIdentifier() {
        return "IE_ALLOY_FURNACE";
    }


    @Override
    public void registerDefaultRecipes() {
        this.registerRecipe(1, new ItemStack[]{new CustomItem(Material.KNOWLEDGE_BOOK, "§b配方表", "§b1圆石齿轮+1铁锭=1铁齿轮", "§b1沙子+1金粉=1金锭(原版)", "§b1锇锭+1荧石粉=1强化荧石锭", "§b1黑曜石+1硬化玻璃=1强化黑曜石", "§b1强化荧石锭+1强化黑曜石=1锇荧黑曜合金锭")}, new ItemStack[]{new CustomItem(Material.KNOWLEDGE_BOOK, "§b配方表", "§b1圆石齿轮+1铁锭=1铁齿轮", "§b1沙子+1金粉=1金锭(原版)", "§b1锇锭+1荧石粉=1强化荧石锭", "§b1黑曜石+1硬化玻璃=1强化黑曜石", "§b1强化荧石锭+1强化黑曜石=1锇荧黑曜合金锭")});
        this.registerRecipe(8, new ItemStack[]{Items.COBBLESTONE_GEAR, new ItemStack(Material.IRON_INGOT)}, new ItemStack[]{Items.IRON_GEAR});
        this.registerRecipe(8, new ItemStack[]{new ItemStack(Material.SAND), SlimefunItems.GOLD_DUST}, new ItemStack[]{new ItemStack(Material.GOLD_INGOT)});
        this.registerRecipe(10, new ItemStack[]{Items.OSMIUM_INGOT, new ItemStack(Material.GLOWSTONE_DUST)}, new ItemStack[]{Items.ENHANCED_GLOWSTONE});
        this.registerRecipe(12, new ItemStack[]{new ItemStack(Material.OBSIDIAN), SlimefunItems.HARDENED_GLASS}, new ItemStack[]{Items.ENHANCED_OBSIDIAN});
        this.registerRecipe(16, new ItemStack[]{Items.ENHANCED_GLOWSTONE, Items.ENHANCED_OBSIDIAN}, new ItemStack[]{Items.OSGLOGLAS_INGOT});
    }

    public static RecipeType recipeType() {
        return new RecipeType(new NamespacedKey(SlimefunItemExpansion.getInstance(), "alloy_furnace"), Items.ALLOY_FURNACE);
    }

}
