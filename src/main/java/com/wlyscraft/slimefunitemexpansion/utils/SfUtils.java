package com.wlyscraft.slimefunitemexpansion.utils;

import com.wlyscraft.slimefunitemexpansion.SlimefunItemExpansion;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunPlugin;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import io.github.thebusybiscuit.slimefun4.implementation.items.multiblocks.MakeshiftSmeltery;
import io.github.thebusybiscuit.slimefun4.implementation.items.multiblocks.Smeltery;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.mrCookieSlime.Slimefun.Objects.handlers.ItemHandler;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public class SfUtils {
    public static void sendMessage(@Nonnull Player player, String message) {
        player.sendMessage("§a SlimefunItemExpansion §7> §r"+message);
    }
    public static void registerItem(SlimefunItemStack sis, Category category, RecipeType rt, ItemStack[] recipe) {
        SlimefunItem sfi = new SlimefunItem(category, sis, rt, recipe);
        sfi.register(SlimefunItemExpansion.getInstance());
    }

    public static void registerItem(SlimefunItemStack sis, Category category, RecipeType rt, ItemStack[] recipe, @Nonnull ItemHandler... ith) {
        SlimefunItem sfi = new SlimefunItem(category, sis, rt, recipe);
        for (ItemHandler ih : ith){
            sfi.addItemHandler(ih);
        }
        sfi.register(SlimefunItemExpansion.getInstance());
    }

    public static void registerNonPlaceableItem(@Nonnull SlimefunItemStack sis, @Nonnull Category category, @Nonnull RecipeType rt,
                                                @Nonnull ItemStack[] recipe) {
        new UnplaceableBlock(category, sis, rt, recipe).register(SlimefunItemExpansion.getInstance());
    }

    public static void registerNonPlaceableItem(@Nonnull SlimefunItemStack sis, @Nonnull Category category, @Nonnull RecipeType rt,
                                                @Nonnull ItemStack[] recipe, @Nonnull ItemHandler... ith) {
        UnplaceableBlock sfi = new UnplaceableBlock(category, sis, rt, recipe);
        for (ItemHandler ih : ith){
            sfi.addItemHandler(ih);
        }
        sfi.register(SlimefunItemExpansion.getInstance());
    }

    public static void addSmelteryRecipe(ItemStack input, ItemStack output) {
        MakeshiftSmeltery makeshiftSmeltery = (MakeshiftSmeltery) SlimefunItems.MAKESHIFT_SMELTERY.getItem();
        makeshiftSmeltery.addRecipe(new ItemStack[] { input }, output);
        registerMachineRecipe("ELECTRIC_INGOT_FACTORY", 8, new ItemStack[] { input }, new ItemStack[] { output });
        registerMachineRecipe("ELECTRIC_INGOT_PULVERIZER", 3, new ItemStack[] { output }, new ItemStack[] { input });

    }

    private static void registerMachineRecipe(String machine, int seconds, ItemStack[] input, ItemStack[] output) {
        for (SlimefunItem item : SlimefunPlugin.getRegistry().getEnabledSlimefunItems()) {
            if (item instanceof AContainer) {
                AContainer container = (AContainer) item;

                if (container.getMachineIdentifier().equals(machine)) {
                    container.registerRecipe(seconds, input, output);
                }
            }
        }
    }
}
