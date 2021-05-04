package com.wlyscraft.slimefunitemexpansion.tasks;

import com.wlyscraft.slimefunitemexpansion.items.IEItems;
import com.wlyscraft.slimefunitemexpansion.SlimefunItemExpansion;
import com.wlyscraft.slimefunitemexpansion.machines.*;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class MachineRegisterTask {
    public static void run() {
        new AlloyFurnace(IEItems.IE_MACHINES_STUFF, IEItems.ALLOY_FURNACE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.NETHER_BRICKS), IEItems.BASIC_CONTROL_CIRCUIT, new ItemStack(Material.NETHER_BRICKS),
                null, IEItems.MACHINE_BLOCK, null,
                new ItemStack(Material.NETHER_BRICKS), SlimefunItems.ELECTRIC_FURNACE, new ItemStack(Material.NETHER_BRICKS)})
                .setCapacity(128)
                .setEnergyConsumption(8)
                .setProcessingSpeed(1)
                .register(SlimefunItemExpansion.getInstance());

        new CobblestoneGenerator(IEItems.IE_MACHINES_STUFF, IEItems.COBBLESTONE_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.GLASS), IEItems.BASIC_CONTROL_CIRCUIT, new ItemStack(Material.GLASS),
                new ItemStack(Material.WATER_BUCKET), IEItems.MACHINE_BLOCK, new ItemStack(Material.LAVA_BUCKET),
                IEItems.BASIC_COIL, SlimefunItems.ELECTRIC_PRESS, IEItems.BASIC_COIL})
                .setCapacity(256)
                .setEnergyConsumption(9)
                .setProcessingSpeed(1)
                .register(SlimefunItemExpansion.getInstance());

        new CobblestoneGenerator(IEItems.IE_MACHINES_STUFF, IEItems.COBBLESTONE_GENERATOR_2, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.REINFORCED_ALLOY_INGOT, IEItems.ADVANCED_CONTROL_CIRCUIT, SlimefunItems.REINFORCED_ALLOY_INGOT,
                IEItems.OSGLOGLAS_INGOT, IEItems.COBBLESTONE_GENERATOR, IEItems.OSGLOGLAS_INGOT,
                SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.REINFORCED_ALLOY_INGOT})
                .setCapacity(256)
                .setEnergyConsumption(15)
                .setProcessingSpeed(2)
                .register(SlimefunItemExpansion.getInstance());

        new CompressedFreezer(IEItems.IE_MACHINES_STUFF, IEItems.COMPRESSED_FREEZER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.FREEZER_2, SlimefunItems.REINFORCED_ALLOY_INGOT,
                SlimefunItems.FREEZER_2, IEItems.MACHINE_BLOCK, SlimefunItems.FREEZER_2,
                SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.FREEZER_2, SlimefunItems.REINFORCED_ALLOY_INGOT})
                .setCapacity(512)
                .setEnergyConsumption(60)
                .setProcessingSpeed(4)
                .register(SlimefunItemExpansion.getInstance());

        new MetallurgicInfuser(IEItems.IE_MACHINES_STUFF, IEItems.METALLURGIC_INFUSER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.IRON_INGOT), SlimefunItems.ELECTRO_MAGNET, new ItemStack(Material.IRON_INGOT),
                new ItemStack(Material.REDSTONE), IEItems.MACHINE_BLOCK, new ItemStack(Material.REDSTONE),
                new ItemStack(Material.PISTON), new ItemStack(Material.FURNACE), new ItemStack(Material.PISTON)})
                .setCapacity(128)
                .setEnergyConsumption(8)
                .setProcessingSpeed(1)
                .register(SlimefunItemExpansion.getInstance());

        new DeathGenerator(IEItems.IE_MACHINES_STUFF, IEItems.DEATH_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.ROTTEN_FLESH), new ItemStack(Material.ROTTEN_FLESH), new ItemStack(Material.ROTTEN_FLESH),
                new ItemStack(Material.ROTTEN_FLESH), new ItemStack(Material.SPIDER_EYE), new ItemStack(Material.ROTTEN_FLESH),
                IEItems.ADVANCED_COIL, SlimefunItems.COAL_GENERATOR, IEItems.ADVANCED_COIL})
                .setCapacity(64)
                .setEnergyProduction(10)
                .register(SlimefunItemExpansion.getInstance());

        new TNTGenerator(IEItems.IE_MACHINES_STUFF, IEItems.TNT_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.GUNPOWDER), new ItemStack(Material.GUNPOWDER), new ItemStack(Material.GUNPOWDER),
                new ItemStack(Material.GUNPOWDER), new ItemStack(Material.TNT), new ItemStack(Material.GUNPOWDER),
                IEItems.ADVANCED_COIL, SlimefunItems.COAL_GENERATOR, IEItems.ADVANCED_COIL})
                .setCapacity(128)
                .setEnergyProduction(12)
                .register(SlimefunItemExpansion.getInstance());

        new LavaFactory(IEItems.IE_MACHINES_STUFF, IEItems.LAVA_FACTORY, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                IEItems.OSGLOGLAS_INGOT, IEItems.ADVANCED_CONTROL_CIRCUIT, IEItems.OSGLOGLAS_INGOT,
                SlimefunItems.LAVA_CRYSTAL, IEItems.MACHINE_BLOCK, SlimefunItems.LAVA_CRYSTAL,
                SlimefunItems.HARDENED_METAL_INGOT, SlimefunItems.LAVA_CRYSTAL, SlimefunItems.HARDENED_METAL_INGOT})
                .setCapacity(512)
                .setEnergyConsumption(40)
                .setProcessingSpeed(1)
                .register(SlimefunItemExpansion.getInstance());

    }
}
