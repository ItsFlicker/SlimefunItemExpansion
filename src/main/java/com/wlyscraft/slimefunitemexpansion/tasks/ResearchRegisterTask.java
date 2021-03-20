package com.wlyscraft.slimefunitemexpansion.tasks;

import com.wlyscraft.slimefunitemexpansion.items.Items;
import com.wlyscraft.slimefunitemexpansion.SlimefunItemExpansion;
import io.github.thebusybiscuit.slimefun4.core.researching.Research;
import org.bukkit.NamespacedKey;

public class ResearchRegisterTask {
    public static void run() {
        new Research(new NamespacedKey(SlimefunItemExpansion.getInstance(), "GEARS_R"),
                100861, "齿轮", 15).addItems(Items.WOODEN_GEAR,
                Items.COBBLESTONE_GEAR, Items.IRON_GEAR).register();

        new Research(new NamespacedKey(SlimefunItemExpansion.getInstance(), "OSMIUM_R"),
                100862, "锇", 12).addItems(Items.OSMIUM_DUST,
                Items.OSMIUM_INGOT).register();

        new Research(new NamespacedKey(SlimefunItemExpansion.getInstance(), "MACHINE_BLOCK_R"),
                100863, "机械外壳", 10).addItems(Items.MACHINE_BLOCK).register();

        new Research(new NamespacedKey(SlimefunItemExpansion.getInstance(), "ALLOY_FURNACE_R"),
                100864, "合金炉", 18).addItems(Items.ALLOY_FURNACE).register();

        new Research(new NamespacedKey(SlimefunItemExpansion.getInstance(), "BASE_COIL_R"),
                100865, "基础线圈", 8).addItems(Items.BASIC_COIL).register();

        new Research(new NamespacedKey(SlimefunItemExpansion.getInstance(), "ADVANCED_COIL_R"),
                100866, "高级线圈", 9).addItems(Items.ADVANCED_COIL).register();

        new Research(new NamespacedKey(SlimefunItemExpansion.getInstance(), "LIGHTNING_WHIP_R"),
                100867, "浑元形意太极拳法", 30).addItems(Items.LIGHTNING_WHIP, Items.MOUSE_TAIL_JUICE).register();

        new Research(new NamespacedKey(SlimefunItemExpansion.getInstance(), "DRILL_R"),
                100868, "手钻", 18).addItems(Items.DURALUMIN_DRILL, Items.SOLDER_DRILL, Items.BILLON_DRILL,
                Items.STEEL_DRILL, Items.DAMASCUS_STEEL_DRILL, Items.REINFORCED_ALLOY_DRILL, Items.CARBONADO_DRILL).register();

        new Research(new NamespacedKey(SlimefunItemExpansion.getInstance(), "FARMING_R"),
                100869, "高级农业技术", 32).addItems(Items.JIN_KE_LA, Items.PHYTOGENIC_INSOLATOR).register();

        new Research(new NamespacedKey(SlimefunItemExpansion.getInstance(), "COBBLESTONE_GENERATOR_R"),
                1008610, "造石机", 25).addItems(Items.COBBLESTONE_GENERATOR, Items.COBBLESTONE_GENERATOR_2).register();

        new Research(new NamespacedKey(SlimefunItemExpansion.getInstance(), "ADVANCED_EXP_R"),
                1008611, "新型经验技术", 30).addItems(Items.COMPRESSED_EXP_BLOCK, Items.COMPRESSED_EXP_BLOCK_2,
                Items.EXP_CONVERTER).register();

        new Research(new NamespacedKey(SlimefunItemExpansion.getInstance(), "SPEED_TORCH_R"),
                1008612, "加速火把", 15).addItems(Items.SPEED_TORCH).register();

        new Research(new NamespacedKey(SlimefunItemExpansion.getInstance(), "COMPRESSED_FREEZER"),
                1008613, "一键冷却剂工厂", 31).addItems(Items.COMPRESSED_FREEZER).register();

        new Research(new NamespacedKey(SlimefunItemExpansion.getInstance(), "ENHANCED_GLOWSTONE_R"),
                1008614, "强化荧石", 5).addItems(Items.ENHANCED_GLOWSTONE).register();

        new Research(new NamespacedKey(SlimefunItemExpansion.getInstance(), "OSGLOGLAS_R"),
                1008615, "锇荧黑曜合金", 12).addItems(Items.OSGLOGLAS_INGOT).register();

        new Research(new NamespacedKey(SlimefunItemExpansion.getInstance(), "NEW_TECH_R"),
                1008616, "新科技,来临力", 19).addItems(Items.BASIC_CONTROL_CIRCUIT,
                Items.ADVANCED_CONTROL_CIRCUIT, Items.ENRICHED_ALLOY, Items.METALLURGIC_INFUSER).register();

        new Research(new NamespacedKey(SlimefunItemExpansion.getInstance(), "NEW_GENERATOR_R"),
                1008617, "恒河里的发电机", 20).addItems(Items.DEATH_GENERATOR,
                Items.TNT_GENERATOR).register();

        new Research(new NamespacedKey(SlimefunItemExpansion.getInstance(), "LAVA_FACTORY_R"),
                1008618, "岩浆工厂", 33).addItems(Items.LAVA_FACTORY).register();

        new Research(new NamespacedKey(SlimefunItemExpansion.getInstance(), "METALLURGIC_INFUSER_R"),
                1008619, "冶金灌注机", 16).addItems(Items.METALLURGIC_INFUSER).register();

        new Research(new NamespacedKey(SlimefunItemExpansion.getInstance(), "ANDURIL_R"),
                1008620, "安都瑞尔之剑", 17).addItems(Items.ANDURIL).register();

        new Research(new NamespacedKey(SlimefunItemExpansion.getInstance(), "ELECTRIC_CROSSBOW_R"),
                1008621, "电动弩", 42).addItems(Items.ELECTRIC_CROSSBOW).register();

        new Research(new NamespacedKey(SlimefunItemExpansion.getInstance(), "LIGHTNING_BOW_R"),
                1008622, "闪电弓", 37).addItems(Items.LIGHTNING_BOW).register();

        new Research(new NamespacedKey(SlimefunItemExpansion.getInstance(), "XIONG_SHI_LAO_FANG_R"),
                1008623, "", 13).addItems(Items.XIONG_SHI_LAO_FANG).register();


    }
}
