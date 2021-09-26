package io.github.itsflicker.slimefunitemexpansion.tasks

import io.github.itsflicker.slimefunitemexpansion.SlimefunItemExpansion
import io.github.itsflicker.slimefunitemexpansion.items.IEItems
import io.github.itsflicker.slimefunitemexpansion.items.machines.*
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems
import me.mrCookieSlime.Slimefun.Lists.RecipeType
import org.bukkit.Material
import org.bukkit.inventory.ItemStack

object MachineRegisterTask {

    fun run() {
        AlloyFurnace(IEItems.IE_MACHINES_STUFF, IEItems.ALLOY_FURNACE, RecipeType.ENHANCED_CRAFTING_TABLE, arrayOf(
            ItemStack(Material.NETHER_BRICKS), IEItems.BASIC_CONTROL_CIRCUIT, ItemStack(Material.NETHER_BRICKS),
            null, IEItems.MACHINE_BLOCK, null,
            ItemStack(Material.NETHER_BRICKS), SlimefunItems.ELECTRIC_FURNACE, ItemStack(Material.NETHER_BRICKS)
        )).setCapacity(128)
            .setEnergyConsumption(8)
            .setProcessingSpeed(1)
            .register(SlimefunItemExpansion)

        CobblestoneGenerator(IEItems.IE_MACHINES_STUFF, IEItems.COBBLESTONE_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, arrayOf(
            ItemStack(Material.GLASS), IEItems.BASIC_CONTROL_CIRCUIT, ItemStack(Material.GLASS),
            ItemStack(Material.WATER_BUCKET), IEItems.MACHINE_BLOCK, ItemStack(Material.LAVA_BUCKET),
            IEItems.BASIC_COIL, SlimefunItems.ELECTRIC_PRESS, IEItems.BASIC_COIL
        )).setCapacity(256)
            .setEnergyConsumption(9)
            .setProcessingSpeed(1)
            .register(SlimefunItemExpansion)

        CobblestoneGenerator(IEItems.IE_MACHINES_STUFF, IEItems.COBBLESTONE_GENERATOR_2, RecipeType.ENHANCED_CRAFTING_TABLE, arrayOf(
            SlimefunItems.REINFORCED_ALLOY_INGOT, IEItems.ADVANCED_CONTROL_CIRCUIT, SlimefunItems.REINFORCED_ALLOY_INGOT,
            IEItems.OSGLOGLAS_INGOT, IEItems.COBBLESTONE_GENERATOR, IEItems.OSGLOGLAS_INGOT,
            SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.REINFORCED_ALLOY_INGOT
        )).setCapacity(256)
            .setEnergyConsumption(15)
            .setProcessingSpeed(2)
            .register(SlimefunItemExpansion)

        CompressedFreezer(IEItems.IE_MACHINES_STUFF, IEItems.COMPRESSED_FREEZER, RecipeType.ENHANCED_CRAFTING_TABLE, arrayOf(
            SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.FREEZER_2, SlimefunItems.REINFORCED_ALLOY_INGOT,
            SlimefunItems.FREEZER_2, IEItems.MACHINE_BLOCK, SlimefunItems.FREEZER_2,
            SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.FREEZER_2, SlimefunItems.REINFORCED_ALLOY_INGOT
        )).setCapacity(512)
            .setEnergyConsumption(60)
            .setProcessingSpeed(4)
            .register(SlimefunItemExpansion)

        MetallurgicInfuser(IEItems.IE_MACHINES_STUFF, IEItems.METALLURGIC_INFUSER, RecipeType.ENHANCED_CRAFTING_TABLE, arrayOf(
            ItemStack(Material.IRON_INGOT), SlimefunItems.ELECTRO_MAGNET, ItemStack(Material.IRON_INGOT),
            ItemStack(Material.REDSTONE), IEItems.MACHINE_BLOCK, ItemStack(Material.REDSTONE),
            ItemStack(Material.PISTON), ItemStack(Material.FURNACE), ItemStack(Material.PISTON)
        )).setCapacity(128)
            .setEnergyConsumption(8)
            .setProcessingSpeed(1)
            .register(SlimefunItemExpansion)

        DeathGenerator(IEItems.IE_MACHINES_STUFF, IEItems.DEATH_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, arrayOf(
            ItemStack(Material.ROTTEN_FLESH), ItemStack(Material.ROTTEN_FLESH), ItemStack(Material.ROTTEN_FLESH),
            ItemStack(Material.ROTTEN_FLESH), ItemStack(Material.SPIDER_EYE), ItemStack(Material.ROTTEN_FLESH),
            IEItems.ADVANCED_COIL, SlimefunItems.COAL_GENERATOR, IEItems.ADVANCED_COIL
        )).setCapacity(64)
            .setEnergyProduction(10)
            .register(SlimefunItemExpansion)

        TNTGenerator(IEItems.IE_MACHINES_STUFF, IEItems.TNT_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, arrayOf(
            ItemStack(Material.GUNPOWDER), ItemStack(Material.GUNPOWDER), ItemStack(Material.GUNPOWDER),
            ItemStack(Material.GUNPOWDER), ItemStack(Material.TNT), ItemStack(Material.GUNPOWDER),
            IEItems.ADVANCED_COIL, SlimefunItems.COAL_GENERATOR, IEItems.ADVANCED_COIL
        )).setCapacity(128)
            .setEnergyProduction(12)
            .register(SlimefunItemExpansion)

        HalitosisGenerator(IEItems.IE_MACHINES_STUFF, IEItems.HALITOSIS_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, arrayOf(
            ItemStack(Material.PURPUR_BLOCK), ItemStack(Material.PURPUR_BLOCK), ItemStack(Material.PURPUR_BLOCK),
            ItemStack(Material.PURPUR_BLOCK), ItemStack(Material.END_ROD), ItemStack(Material.PURPUR_BLOCK),
            IEItems.ADVANCED_COIL, SlimefunItems.COAL_GENERATOR, IEItems.ADVANCED_COIL
        )).setCapacity(128)
            .setEnergyProduction(20)
            .register(SlimefunItemExpansion)

        LavaFactory(IEItems.IE_MACHINES_STUFF, IEItems.LAVA_FACTORY, RecipeType.ENHANCED_CRAFTING_TABLE, arrayOf(
            IEItems.OSGLOGLAS_INGOT, IEItems.ADVANCED_CONTROL_CIRCUIT, IEItems.OSGLOGLAS_INGOT,
            SlimefunItems.LAVA_CRYSTAL, IEItems.MACHINE_BLOCK, SlimefunItems.LAVA_CRYSTAL,
            SlimefunItems.HEATING_COIL, SlimefunItems.LAVA_CRYSTAL, SlimefunItems.HEATING_COIL
        )).setCapacity(512)
            .setEnergyConsumption(40)
            .setProcessingSpeed(1)
            .register(SlimefunItemExpansion)
    }
}