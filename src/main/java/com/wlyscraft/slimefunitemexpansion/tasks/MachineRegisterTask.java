package com.wlyscraft.slimefunitemexpansion.tasks;

import com.wlyscraft.slimefunitemexpansion.Items;
import com.wlyscraft.slimefunitemexpansion.SlimefunItemExpansion;
import com.wlyscraft.slimefunitemexpansion.machines.AlloyFurnace;
import com.wlyscraft.slimefunitemexpansion.machines.CobblestoneGenerator;
import com.wlyscraft.slimefunitemexpansion.machines.CompressedFreezer;
import com.wlyscraft.slimefunitemexpansion.machines.PhytogenicInsolator;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class MachineRegisterTask {
    public static void run() {
        new AlloyFurnace(Items.IE_MACHINES_STUFF, Items.ALLOY_FURNACE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.NETHER_BRICKS), SlimefunItems.BASIC_CIRCUIT_BOARD, new ItemStack(Material.NETHER_BRICKS),
                null, Items.MACHINE_BLOCK, null,
                new ItemStack(Material.NETHER_BRICKS), SlimefunItems.ELECTRIC_FURNACE, new ItemStack(Material.NETHER_BRICKS)}).register(SlimefunItemExpansion.getInstance());

        new CobblestoneGenerator(Items.IE_MACHINES_STUFF, Items.COBBLESTONE_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.GLASS), SlimefunItems.BASIC_CIRCUIT_BOARD, new ItemStack(Material.GLASS),
                new ItemStack(Material.WATER_BUCKET), Items.MACHINE_BLOCK, new ItemStack(Material.LAVA_BUCKET),
                Items.ADVANCED_COIL, SlimefunItems.ELECTRIC_PRESS, Items.ADVANCED_COIL
        }).register(SlimefunItemExpansion.getInstance());

        new CompressedFreezer(Items.IE_MACHINES_STUFF, Items.COMPRESSED_FREEZER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.FREEZER_2, SlimefunItems.REINFORCED_ALLOY_INGOT,
                SlimefunItems.FREEZER_2, Items.MACHINE_BLOCK, SlimefunItems.FREEZER_2,
                SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.FREEZER_2, SlimefunItems.REINFORCED_ALLOY_INGOT
        }).register(SlimefunItemExpansion.getInstance());

        new PhytogenicInsolator(Items.IE_MACHINES_STUFF, Items.PHYTOGENIC_INSOLATOR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                null, SlimefunItems.REINFORCED_PLATE, null,
                SlimefunItems.POWER_CRYSTAL, Items.MACHINE_BLOCK, SlimefunItems.POWER_CRYSTAL,
                new ItemStack(Material.DIRT), SlimefunItems.ADVANCED_CIRCUIT_BOARD, new ItemStack(Material.DIRT)
        }).register(SlimefunItemExpansion.getInstance());
    }
}
