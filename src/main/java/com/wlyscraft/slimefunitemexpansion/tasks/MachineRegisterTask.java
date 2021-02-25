package com.wlyscraft.slimefunitemexpansion.tasks;

import com.wlyscraft.slimefunitemexpansion.Items;
import com.wlyscraft.slimefunitemexpansion.SlimefunItemExpansion;
import com.wlyscraft.slimefunitemexpansion.machines.*;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class MachineRegisterTask {
    public static void run() {
        new AlloyFurnace(Items.IE_MACHINES_STUFF, Items.ALLOY_FURNACE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.NETHER_BRICKS), Items.BASIC_CONTROL_CIRCUIT, new ItemStack(Material.NETHER_BRICKS),
                null, Items.MACHINE_BLOCK, null,
                new ItemStack(Material.NETHER_BRICKS), SlimefunItems.ELECTRIC_FURNACE, new ItemStack(Material.NETHER_BRICKS)})
                .setCapacity(128)
                .setEnergyConsumption(8)
                .setProcessingSpeed(1)
                .register(SlimefunItemExpansion.getInstance());

        new CobblestoneGenerator(Items.IE_MACHINES_STUFF, Items.COBBLESTONE_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.GLASS), Items.BASIC_CONTROL_CIRCUIT, new ItemStack(Material.GLASS),
                new ItemStack(Material.WATER_BUCKET), Items.MACHINE_BLOCK, new ItemStack(Material.LAVA_BUCKET),
                Items.BASIC_COIL, SlimefunItems.ELECTRIC_PRESS, Items.BASIC_COIL})
                .setCapacity(256)
                .setEnergyConsumption(9)
                .setProcessingSpeed(1)
                .register(SlimefunItemExpansion.getInstance());

        new CobblestoneGenerator(Items.IE_MACHINES_STUFF, Items.COBBLESTONE_GENERATOR_2, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.REINFORCED_ALLOY_INGOT, Items.ADVANCED_CONTROL_CIRCUIT, SlimefunItems.REINFORCED_ALLOY_INGOT,
                Items.OSGLOGLAS_INGOT, Items.COBBLESTONE_GENERATOR, Items.OSGLOGLAS_INGOT,
                SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.REINFORCED_ALLOY_INGOT})
                .setCapacity(256)
                .setEnergyConsumption(15)
                .setProcessingSpeed(2)
                .register(SlimefunItemExpansion.getInstance());

        new CompressedFreezer(Items.IE_MACHINES_STUFF, Items.COMPRESSED_FREEZER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.FREEZER_2, SlimefunItems.REINFORCED_ALLOY_INGOT,
                SlimefunItems.FREEZER_2, Items.MACHINE_BLOCK, SlimefunItems.FREEZER_2,
                SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.FREEZER_2, SlimefunItems.REINFORCED_ALLOY_INGOT})
                .setCapacity(512)
                .setEnergyConsumption(60)
                .setProcessingSpeed(4)
                .register(SlimefunItemExpansion.getInstance());

        new PhytogenicInsolator(Items.IE_MACHINES_STUFF, Items.PHYTOGENIC_INSOLATOR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                null, Items.OSGLOGLAS_INGOT, null,
                SlimefunItems.POWER_CRYSTAL, Items.MACHINE_BLOCK, SlimefunItems.POWER_CRYSTAL,
                new ItemStack(Material.DIRT), Items.ADVANCED_CONTROL_CIRCUIT, new ItemStack(Material.DIRT)})
                .setCapacity(256)
                .setEnergyConsumption(25)
                .setProcessingSpeed(1)
                .register(SlimefunItemExpansion.getInstance());

        new MetallurgicInfuser(Items.IE_MACHINES_STUFF, Items.METALLURGIC_INFUSER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.IRON_INGOT), SlimefunItems.ELECTRO_MAGNET, new ItemStack(Material.IRON_INGOT),
                new ItemStack(Material.REDSTONE), Items.MACHINE_BLOCK, new ItemStack(Material.REDSTONE),
                new ItemStack(Material.PISTON), new ItemStack(Material.FURNACE), new ItemStack(Material.PISTON)})
                .setCapacity(128)
                .setEnergyConsumption(8)
                .setProcessingSpeed(1)
                .register(SlimefunItemExpansion.getInstance());

        new DeathGenerator(Items.IE_MACHINES_STUFF, Items.DEATH_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.ROTTEN_FLESH), new ItemStack(Material.ROTTEN_FLESH), new ItemStack(Material.ROTTEN_FLESH),
                new ItemStack(Material.ROTTEN_FLESH), new ItemStack(Material.SPIDER_EYE), new ItemStack(Material.ROTTEN_FLESH),
                Items.ADVANCED_COIL, SlimefunItems.COAL_GENERATOR, Items.ADVANCED_COIL})
                .setCapacity(64)
                .setEnergyProduction(10)
                .register(SlimefunItemExpansion.getInstance());

        new TNTGenerator(Items.IE_MACHINES_STUFF, Items.TNT_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.GUNPOWDER), new ItemStack(Material.GUNPOWDER), new ItemStack(Material.GUNPOWDER),
                new ItemStack(Material.GUNPOWDER), new ItemStack(Material.TNT), new ItemStack(Material.GUNPOWDER),
                Items.ADVANCED_COIL, SlimefunItems.COAL_GENERATOR, Items.ADVANCED_COIL})
                .setCapacity(128)
                .setEnergyProduction(12)
                .register(SlimefunItemExpansion.getInstance());

        new LavaFactory(Items.IE_MACHINES_STUFF, Items.LAVA_FACTORY, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                Items.OSGLOGLAS_INGOT, Items.ADVANCED_CONTROL_CIRCUIT, Items.OSGLOGLAS_INGOT,
                SlimefunItems.LAVA_CRYSTAL, Items.MACHINE_BLOCK, SlimefunItems.LAVA_CRYSTAL,
                SlimefunItems.HARDENED_METAL_INGOT, SlimefunItems.LAVA_CRYSTAL, SlimefunItems.HARDENED_METAL_INGOT})
                .setCapacity(512)
                .setEnergyConsumption(40)
                .setProcessingSpeed(1)
                .register(SlimefunItemExpansion.getInstance());
    }
}
