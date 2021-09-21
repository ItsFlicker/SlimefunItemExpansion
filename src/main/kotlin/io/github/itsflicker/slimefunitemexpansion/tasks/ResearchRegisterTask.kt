package io.github.itsflicker.slimefunitemexpansion.tasks

import io.github.itsflicker.slimefunitemexpansion.items.IEItems
import io.github.itsflicker.slimefunitemexpansion.items.resources.OsmiumDust
import io.github.itsflicker.slimefunitemexpansion.util.toKey
import io.github.thebusybiscuit.slimefun4.core.researching.Research

object ResearchRegisterTask {

    fun run() {
        Research(
            "GEARS_R".toKey(),
            100861, "齿轮", 15
        ).addItems(
            IEItems.WOODEN_GEAR,
            IEItems.COBBLESTONE_GEAR, IEItems.IRON_GEAR
        ).register()
        Research(
            "OSMIUM_R".toKey(),
            100862, "锇", 12
        ).addItems(
            OsmiumDust.OSMIUM_DUST,
            IEItems.OSMIUM_INGOT
        ).register()
        Research(
            "MACHINE_BLOCK_R".toKey(),
            100863, "机械外壳", 10
        ).addItems(IEItems.MACHINE_BLOCK).register()
        Research(
            "ALLOY_FURNACE_R".toKey(),
            100864, "合金炉", 18
        ).addItems(IEItems.ALLOY_FURNACE).register()
        Research(
            "BASE_COIL_R".toKey(),
            100865, "基础线圈", 8
        ).addItems(IEItems.BASIC_COIL).register()
        Research(
            "ADVANCED_COIL_R".toKey(),
            100866, "高级线圈", 9
        ).addItems(IEItems.ADVANCED_COIL).register()
        Research(
            "LIGHTNING_WHIP_R".toKey(),
            100867, "浑元形意太极拳法", 30
        ).addItems(IEItems.LIGHTNING_WHIP, IEItems.MOUSE_TAIL_JUICE).register()
        Research(
            "DRILL_R".toKey(),
            100868, "手钻", 18
        ).addItems(
            IEItems.DURALUMIN_DRILL, IEItems.SOLDER_DRILL, IEItems.BILLON_DRILL,
            IEItems.STEEL_DRILL, IEItems.DAMASCUS_STEEL_DRILL, IEItems.REINFORCED_ALLOY_DRILL, IEItems.CARBONADO_DRILL
        ).register()
        Research(
            "FARMING_R".toKey(),
            100869, "高级农业技术", 32
        ).addItems(IEItems.JIN_KE_LA, IEItems.GROW_CORE).register()
        Research(
            "COBBLESTONE_GENERATOR_R".toKey(),
            1008610, "造石机", 25
        ).addItems(IEItems.COBBLESTONE_GENERATOR, IEItems.COBBLESTONE_GENERATOR_2).register()
//        Research(
//            "ADVANCED_EXP_R".toKey(),
//            1008611, "新型经验技术", 30
//        ).addItems(
//            IEItems.COMPRESSED_EXP_BLOCK, IEItems.COMPRESSED_EXP_BLOCK_2,
//            IEItems.EXP_CONVERTER
//        ).register()
        Research(
            "SPEED_TORCH_R".toKey(),
            1008612, "加速火把", 15
        ).addItems(IEItems.SPEED_TORCH).register()
        Research(
            "COMPRESSED_FREEZER".toKey(),
            1008613, "一键冷却剂工厂", 31
        ).addItems(IEItems.COMPRESSED_FREEZER).register()
        Research(
            "ENHANCED_GLOWSTONE_R".toKey(),
            1008614, "《强化》", 5
        )
            .addItems(IEItems.ENHANCED_GLOWSTONE, IEItems.ENHANCED_OBSIDIAN).register()
        Research(
            "OSGLOGLAS_R".toKey(),
            1008615, "锇荧黑曜合金", 12
        ).addItems(IEItems.OSGLOGLAS_INGOT).register()
        Research(
            "NEW_TECH_R".toKey(),
            1008616, "新科技,来临力", 19
        ).addItems(
            IEItems.BASIC_CONTROL_CIRCUIT,
            IEItems.ADVANCED_CONTROL_CIRCUIT, IEItems.ENRICHED_ALLOY, IEItems.METALLURGIC_INFUSER
        ).register()
        Research(
            "NEW_GENERATOR_R".toKey(),
            1008617, "恒河里的发电机", 20
        ).addItems(
            IEItems.DEATH_GENERATOR,
            IEItems.TNT_GENERATOR,
            IEItems.HALITOSIS_GENERATOR
        ).register()
        Research(
            "LAVA_FACTORY_R".toKey(),
            1008618, "岩浆工厂", 33
        ).addItems(IEItems.LAVA_FACTORY).register()
        Research(
            "METALLURGIC_INFUSER_R".toKey(),
            1008619, "冶金灌注机", 16
        ).addItems(IEItems.METALLURGIC_INFUSER).register()
        Research(
            "ANDURIL_R".toKey(),
            1008620, "安都瑞尔之剑", 17
        ).addItems(IEItems.ANDURIL).register()
        Research(
            "ELECTRIC_CROSSBOW_R".toKey(),
            1008621, "电动弩", 42
        ).addItems(IEItems.ELECTRIC_CROSSBOW).register()
        Research(
            "LIGHTNING_BOW_R".toKey(),
            1008622, "闪电弓", 37
        ).addItems(IEItems.LIGHTNING_BOW).register()
        Research(
            "XIONG_SHI_LAO_FANG_R".toKey(),
            1008623, "就没有我治不好的玩家", 13
        ).addItems(IEItems.XIONG_SHI_LAO_FANG).register()
        Research(
            "OTHER_MATERIAL_R".toKey(),
            1008624, "杂项材料", 12
        ).addItems(IEItems.ARTIFICIAL_DRAGON_BREATH, IEItems.ORIGINAL_MOB_MATERIAL, IEItems.VILLAGER_BOOK).register()
        Research(
            "OTHER_MATERIAL_R".toKey(),
            1008625, "特离谱", 24
        ).addItems(IEItems.WBP_BOOTS, IEItems.HUMAN_SADDLE).register()
        Research(
            "OTHER_MATERIAL_R".toKey(),
            1008626, "杂项工具/武器", 22
        ).addItems(IEItems.SLIMECHUNK_CHECKER, IEItems.REINFORCED_SHIELD, IEItems.ELECTRIC_CUTTER).register()
    }
}