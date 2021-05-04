package com.wlyscraft.slimefunitemexpansion.tasks;

import com.wlyscraft.slimefunitemexpansion.items.IEItems;
import com.wlyscraft.slimefunitemexpansion.SlimefunItemExpansion;
import com.wlyscraft.slimefunitemexpansion.resources.OsmiumDust;
import io.github.thebusybiscuit.slimefun4.core.researching.Research;
import org.bukkit.NamespacedKey;

public class ResearchRegisterTask {
    public static void run() {
        new Research(new NamespacedKey(SlimefunItemExpansion.getInstance(), "GEARS_R"),
                100861, "齿轮", 15).addItems(IEItems.WOODEN_GEAR,
                IEItems.COBBLESTONE_GEAR, IEItems.IRON_GEAR).register();

        new Research(new NamespacedKey(SlimefunItemExpansion.getInstance(), "OSMIUM_R"),
                100862, "锇", 12).addItems(OsmiumDust.OSMIUM_DUST,
                IEItems.OSMIUM_INGOT).register();

        new Research(new NamespacedKey(SlimefunItemExpansion.getInstance(), "MACHINE_BLOCK_R"),
                100863, "机械外壳", 10).addItems(IEItems.MACHINE_BLOCK).register();

        new Research(new NamespacedKey(SlimefunItemExpansion.getInstance(), "ALLOY_FURNACE_R"),
                100864, "合金炉", 18).addItems(IEItems.ALLOY_FURNACE).register();

        new Research(new NamespacedKey(SlimefunItemExpansion.getInstance(), "BASE_COIL_R"),
                100865, "基础线圈", 8).addItems(IEItems.BASIC_COIL).register();

        new Research(new NamespacedKey(SlimefunItemExpansion.getInstance(), "ADVANCED_COIL_R"),
                100866, "高级线圈", 9).addItems(IEItems.ADVANCED_COIL).register();

        new Research(new NamespacedKey(SlimefunItemExpansion.getInstance(), "LIGHTNING_WHIP_R"),
                100867, "浑元形意太极拳法", 30).addItems(IEItems.LIGHTNING_WHIP, IEItems.MOUSE_TAIL_JUICE).register();

        new Research(new NamespacedKey(SlimefunItemExpansion.getInstance(), "DRILL_R"),
                100868, "手钻", 18).addItems(IEItems.DURALUMIN_DRILL, IEItems.SOLDER_DRILL, IEItems.BILLON_DRILL,
                IEItems.STEEL_DRILL, IEItems.DAMASCUS_STEEL_DRILL, IEItems.REINFORCED_ALLOY_DRILL, IEItems.CARBONADO_DRILL).register();

        new Research(new NamespacedKey(SlimefunItemExpansion.getInstance(), "FARMING_R"),
                100869, "高级农业技术", 32).addItems(IEItems.JIN_KE_LA, IEItems.GROW_CORE).register();

        new Research(new NamespacedKey(SlimefunItemExpansion.getInstance(), "COBBLESTONE_GENERATOR_R"),
                1008610, "造石机", 25).addItems(IEItems.COBBLESTONE_GENERATOR, IEItems.COBBLESTONE_GENERATOR_2).register();

        new Research(new NamespacedKey(SlimefunItemExpansion.getInstance(), "ADVANCED_EXP_R"),
                1008611, "新型经验技术", 30).addItems(IEItems.COMPRESSED_EXP_BLOCK, IEItems.COMPRESSED_EXP_BLOCK_2,
                IEItems.EXP_CONVERTER).register();

        new Research(new NamespacedKey(SlimefunItemExpansion.getInstance(), "SPEED_TORCH_R"),
                1008612, "加速火把", 15).addItems(IEItems.SPEED_TORCH).register();

        new Research(new NamespacedKey(SlimefunItemExpansion.getInstance(), "COMPRESSED_FREEZER"),
                1008613, "一键冷却剂工厂", 31).addItems(IEItems.COMPRESSED_FREEZER).register();

        new Research(new NamespacedKey(SlimefunItemExpansion.getInstance(), "ENHANCED_GLOWSTONE_R"),
                1008614, "《强化》", 5)
                .addItems(IEItems.ENHANCED_GLOWSTONE, IEItems.ENHANCED_OBSIDIAN).register();

        new Research(new NamespacedKey(SlimefunItemExpansion.getInstance(), "OSGLOGLAS_R"),
                1008615, "锇荧黑曜合金", 12).addItems(IEItems.OSGLOGLAS_INGOT).register();

        new Research(new NamespacedKey(SlimefunItemExpansion.getInstance(), "NEW_TECH_R"),
                1008616, "新科技,来临力", 19).addItems(IEItems.BASIC_CONTROL_CIRCUIT,
                IEItems.ADVANCED_CONTROL_CIRCUIT, IEItems.ENRICHED_ALLOY, IEItems.METALLURGIC_INFUSER).register();

        new Research(new NamespacedKey(SlimefunItemExpansion.getInstance(), "NEW_GENERATOR_R"),
                1008617, "恒河里的发电机", 20).addItems(IEItems.DEATH_GENERATOR,
                IEItems.TNT_GENERATOR).register();

        new Research(new NamespacedKey(SlimefunItemExpansion.getInstance(), "LAVA_FACTORY_R"),
                1008618, "岩浆工厂", 33).addItems(IEItems.LAVA_FACTORY).register();

        new Research(new NamespacedKey(SlimefunItemExpansion.getInstance(), "METALLURGIC_INFUSER_R"),
                1008619, "冶金灌注机", 16).addItems(IEItems.METALLURGIC_INFUSER).register();

        new Research(new NamespacedKey(SlimefunItemExpansion.getInstance(), "ANDURIL_R"),
                1008620, "安都瑞尔之剑", 17).addItems(IEItems.ANDURIL).register();

        new Research(new NamespacedKey(SlimefunItemExpansion.getInstance(), "ELECTRIC_CROSSBOW_R"),
                1008621, "电动弩", 42).addItems(IEItems.ELECTRIC_CROSSBOW).register();

        new Research(new NamespacedKey(SlimefunItemExpansion.getInstance(), "LIGHTNING_BOW_R"),
                1008622, "闪电弓", 37).addItems(IEItems.LIGHTNING_BOW).register();

        new Research(new NamespacedKey(SlimefunItemExpansion.getInstance(), "XIONG_SHI_LAO_FANG_R"),
                1008623, "就没有我治不好的玩家", 13).addItems(IEItems.XIONG_SHI_LAO_FANG).register();

        new Research(new NamespacedKey(SlimefunItemExpansion.getInstance(), "OTHER_MATERIAL_R"),
                1008624, "杂项材料", 12)
                .addItems(IEItems.MANMADE_DRAGON_BREATH, IEItems.ORIGINAL_MOB_MATERIAL, IEItems.VILLAGER_BOOK).register();

        new Research(new NamespacedKey(SlimefunItemExpansion.getInstance(), "OTHER_MATERIAL_R"),
                1008625, "特离谱", 24)
                .addItems(IEItems.WBP_BOOTS, IEItems.HUMAN_SADDLE).register();

        new Research(new NamespacedKey(SlimefunItemExpansion.getInstance(), "OTHER_MATERIAL_R"),
                1008626, "杂项工具/武器", 22)
                .addItems(IEItems.SLIMECHUNK_CHECKER, IEItems.REINFORCED_SHIELD, IEItems.ELECTRIC_CUTTER).register();
    }
}
