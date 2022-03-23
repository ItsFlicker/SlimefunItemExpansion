package io.github.itsflicker.slimefunitemexpansion.items

import io.github.itsflicker.slimefunitemexpansion.util.toKey
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack
import io.github.thebusybiscuit.slimefun4.utils.HeadTexture
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils
import org.bukkit.Color
import org.bukkit.Material
import org.bukkit.attribute.Attribute
import org.bukkit.attribute.AttributeModifier
import org.bukkit.enchantments.Enchantment
import org.bukkit.inventory.EquipmentSlot
import org.bukkit.inventory.meta.ItemMeta
import org.bukkit.potion.PotionEffect
import org.bukkit.potion.PotionEffectType
import taboolib.common.LifeCycle
import taboolib.common.platform.SkipTo
import taboolib.library.xseries.XMaterial
import taboolib.platform.util.buildItem
import taboolib.platform.util.modifyMeta
import java.util.*

@SkipTo(LifeCycle.LOAD)
object IEItems {

    //  机械
    //  用电器
    val MACHINE_BLOCK = SlimefunItemStack(
        "IE_MACHINE_BLOCK",
        SlimefunUtils.getCustomHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmRkZDRhMTJkYTFjYzJjOWY5ZDZjZDQ5ZmM3NzhlM2ExMWYzNzU3ZGU2ZGQzMTJkNzBhMGQ0Nzg4NTE4OWMwIn19fQ=="),
        "§e钢制机壳"
    )
    val ALLOY_FURNACE = SlimefunItemStack(
        "IE_ALLOY_FURNACE",
        SlimefunUtils.getCustomHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOWZiYjZlZWE1NzU0N2IyNTg4YmFmOGFmNjQ5ZDkxMTZmZjA4Y2FjNTZkZDIxNDBiM2M0OTU3Nzc5OWJhZDdjIn19fQ=="),
        "§4合金炉",
        "",
        LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
        LoreBuilder.speed(1f),
        LoreBuilder.powerBuffer(256),
        LoreBuilder.powerPerSecond(16)
    )
    val COMPRESSED_FREEZER = SlimefunItemStack(
        "IE_COMPRESSED_FREEZER",
        SlimefunUtils.getCustomHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2VmNjVjZDUwYjg4NWI3MDVlNTU4ZTk1ODM2YTEyNDc3YWNjOGJhMzZlYWU1ODhiMjI1Njk0OTZjNzA0MzY4MCJ9fX0="),
        "§b四合一冰箱",
        "§e将水桶直接转换为反应堆冷却剂!",
        "",
        LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
        LoreBuilder.speed(4f),
        LoreBuilder.powerBuffer(512),
        LoreBuilder.powerPerSecond(120)
    )
    val COBBLESTONE_GENERATOR = SlimefunItemStack(
        "IE_COBBLESTONE_GENERATOR",
        SlimefunUtils.getCustomHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjVjOTc2MjcyOWQ0OGQwYTE2ZmU4OTU3M2JkZDJmYWY1MDE5NmZlYTE1ZDQ5YjVhNmJmZWE0ODliZTcxIn19fQ=="),
        "§e造石机",
        "",
        LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
        LoreBuilder.speed(1f),
        LoreBuilder.powerBuffer(256),
        LoreBuilder.powerPerSecond(18)
    )
    val COBBLESTONE_GENERATOR_2 = SlimefunItemStack(
        "IE_COBBLESTONE_GENERATOR_2",
        SlimefunUtils.getCustomHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjVjOTc2MjcyOWQ0OGQwYTE2ZmU4OTU3M2JkZDJmYWY1MDE5NmZlYTE1ZDQ5YjVhNmJmZWE0ODliZTcxIn19fQ=="),
        "§e造石机 §7- §eII",
        "",
        LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
        LoreBuilder.speed(2f),
        LoreBuilder.powerBuffer(256),
        LoreBuilder.powerPerSecond(30)
    )
    val METALLURGIC_INFUSER = SlimefunItemStack(
        "IE_METALLURGIC_INFUSER",
        SlimefunUtils.getCustomHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTQ4MzM3ZjdlZGUxNWMzYjJmOGRjNmE2M2JkOTI4NzRjZGY3NGVjODYyYjQxMThjN2UzNTU1OWNlOGI0ZCJ9fX0="),
        "§e冶金灌注机",
        "",
        LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
        LoreBuilder.speed(1f),
        LoreBuilder.powerBuffer(128),
        LoreBuilder.powerPerSecond(16)
    )
    val LAVA_FACTORY = SlimefunItemStack(
        "LAVA_FACTORY",
        HeadTexture.LAVA_CRYSTAL,
        "§4岩浆工厂",
        "§e消耗大量电量来制造岩浆",
        "",
        LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
        LoreBuilder.speed(1f),
        LoreBuilder.powerBuffer(512),
        LoreBuilder.powerPerSecond(80)
    )

    //  发电机
    val DEATH_GENERATOR = SlimefunItemStack(
        "IE_DEATH_GENERATOR",
        Material.SKELETON_SKULL,
        "§e不死发电机",
        "",
        LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
        LoreBuilder.powerBuffer(64),
        LoreBuilder.powerPerSecond(20)
    )
    val TNT_GENERATOR = SlimefunItemStack(
        "IE_TNT_GENERATOR",
        SlimefunUtils.getCustomHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2FmNTk3NzZmMmYwMzQxMmM3YjU5NDdhNjNhMGNmMjgzZDUxZmU2NWFjNmRmN2YyZjg4MmUwODM0NDU2NWU5In19fQ=="),
        "§eTNT发电机",
        "",
        LoreBuilder.machine(MachineTier.MEDIUM, MachineType.GENERATOR),
        LoreBuilder.powerBuffer(128),
        LoreBuilder.powerPerSecond(24)
    )
    val HALITOSIS_GENERATOR = SlimefunItemStack(
        "IE_HALITOSIS_GENERATOR",
        SlimefunUtils.getCustomHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOWM0NDA4ZTdlNGQzMTY0OGQ2MmM1MmU4OTQ3MTFhZTA4YWU4NTA1NTdmYWRlY2NjZDRmY2NmYmY3YjBkNDc0NCJ9fX0="),
        "§e龙息发电机",
        "",
        LoreBuilder.machine(MachineTier.MEDIUM, MachineType.GENERATOR),
        LoreBuilder.powerBuffer(128),
        LoreBuilder.powerPerSecond(40)
    )

    //  材料
    val WOODEN_GEAR = SlimefunItemStack(
        "WOODEN_GEAR",
        SlimefunUtils.getCustomHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTk2M2EyZmY3MDBkZDc0ZjI5NzlhNzU4ZWM1ZDNkODE5MGM1YWJlMTU1Yjc4NTIwNmYzZDMyNjk5NTE3YTMzYSJ9fX0="),
        "§e木齿轮"
    )
    val COBBLESTONE_GEAR = SlimefunItemStack(
        "COBBLESTONE_GEAR",
        SlimefunUtils.getCustomHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDc5MDEyZDFiZjljNzU3MTA3YjU5MTJiMDY4MzAyMGM1MWFjNDcyZTVjMjU3ZmE4NDQ2NWFkNWUxNDYyYjViYiJ9fX0="),
        "§e圆石齿轮"
    )
    val IRON_GEAR = SlimefunItemStack(
        "IRON_GEAR",
        SlimefunUtils.getCustomHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmNiNGU0M2MyZjg1Nzc3MDVmM2VlMWM1NzBmYmJmNGUyN2ZkZTljM2RjMGU0NzI3MjFhYWE4YjA1Mzc3NWJlYiJ9fX0="),
        "§e铁齿轮"
    )
    val OSMIUM_INGOT = SlimefunItemStack("OSMIUM_INGOT", Material.IRON_INGOT, "§b锇锭")
    val WOFT = SlimefunItemStack(
        "WOFT",
        buildItem(XMaterial.CLOCK) { shiny() },
        "§e时间洪流怀表 MK.II",
        "§3Time flies...",
        "§6使用后将周围机器的运行速度提高100倍！",
        "§0不会有人真信了吧，不会吧，不会吧？"
    )
    val STONE_TANK = SlimefunItemStack(
        "STONE_TANK",
        SlimefunUtils.getCustomHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjkxYjdiMjE3MjVmMTQ2ZDI5YzE5MmI3NDVkNzlkMjI2MDMyNjdjN2FkODkzYmFkZWI2NTQ2ZTc0NjYwMDA2MCJ9fX0="),
        "§e石制储罐"
    )
    val ENHANCED_GLOWSTONE = SlimefunItemStack("ENHANCED_GLOWSTONE", buildItem(XMaterial.BRICK) { shiny() }, "§e强化荧石锭")
    val ENHANCED_OBSIDIAN = SlimefunItemStack("ENHANCED_OBSIDIAN", buildItem(XMaterial.OBSIDIAN) { shiny() }, "§b强化黑曜石")
    val OSGLOGLAS_INGOT = SlimefunItemStack("OSGLOGLAS_INGOT", buildItem(XMaterial.IRON_INGOT) { shiny() }, "§b§l锇荧黑曜合金锭")
    val BASIC_CONTROL_CIRCUIT = SlimefunItemStack("IE_BASIC_CONTROL_CIRCUIT", buildItem(XMaterial.ACTIVATOR_RAIL) { shiny() }, "§a基础控制电路")
    val ADVANCED_CONTROL_CIRCUIT = SlimefunItemStack("IE_ADVANCED_CONTROL_CIRCUIT", buildItem(XMaterial.POWERED_RAIL) { shiny() }, "§4高级控制电路")
    val ENRICHED_ALLOY = SlimefunItemStack("IE_ENRICHED_ALLOY", buildItem(XMaterial.REDSTONE) { shiny() }, "§e富集合金")
    val GROW_CORE = SlimefunItemStack(
        "IE_GROW_CORE",
        SlimefunUtils.getCustomHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTNiMjI4ZjcwYTM1ZDBhYTMyMzUwNDY3ZDllOGMwOWFhZTlhZTBhZTA4NzVmZGM4YzMxMWE4NzZiZTE5MDcxNyJ9fX0="),
        "§a生长核心"
    )
    val ARTIFICIAL_DRAGON_BREATH = SlimefunItemStack("ARTIFICIAL_DRAGON_BREATH", Material.DRAGON_BREATH, "人造龙息")
    val ORIGINAL_MOB_MATERIAL =
        SlimefunItemStack("ORIGINAL_MOB_MATERIAL", buildItem(XMaterial.SNOWBALL) { shiny() }, "&6原始怪物物质", "&b在血夜时击杀怪物有25%几率掉落")
    val VILLAGER_BOOK = SlimefunItemStack("VILLAGER_BOOK", Material.BOOK, "§a§l村民交易之书", "用于和村民交换稀有附魔书")

    //  食物
    val SHIT = SlimefunItemStack("SHIT", buildItem(XMaterial.BROWN_WOOL) { shiny() }, "§5棕色不明物体", "", LoreBuilder.hunger(-114514.0))
    val WJZ_RICE = SlimefunItemStack(
        "WJZ_RICE",
        SlimefunUtils.getCustomHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTk0Yzk1NDE0ZDkyN2Y3ZWQ4NmE0YWUxODA3N2RmNjY3OThlYTczNmRkYjVjYjQ5YWFkNzY5OWQ5MWRkMWVmMiJ9fX0="),
        "§e王境泽的炒饭",
        "",
        LoreBuilder.hunger(1.5)
    )
    val MOUSE_TAIL_JUICE = SlimefunItemStack(
        "MOUSE_TAIL_JUICE",
        Color.SILVER,
        PotionEffect(PotionEffectType.SATURATION, 20, 0),
        "§3耗子尾汁",
        "",
        "§7恢复 §b??? §7的饥饿值"
    )
    val XIONG_SHI_LAO_FANG = SlimefunItemStack(
        "XIONG_SHI_LAO_FANG",
        buildItem(XMaterial.POTION) { color = Color.GREEN;potions += PotionEffect(PotionEffectType.HEAL, 20, 125) },
        "§a雄氏老方",
        "§e微笑着面对它!"
    )
    val BASIC_COIL = SlimefunItemStack("IE_BASE_COIL", Material.COBWEB, "§e基础线圈")
    val ADVANCED_COIL = SlimefunItemStack(
        "IE_ADVANCED_COIL",
        buildItem(XMaterial.COBWEB) { shiny() },
        "§e§l高级线圈",
        "§7仅仅只是闪闪发光而已")

    //  工具和武器装备
    val LIGHTNING_WHIP = SlimefunItemStack(
        "LIGHTNING_WHIP",
        buildItem(XMaterial.STICK) { enchants.putAll(mapOf(Enchantment.CHANNELING to 1, Enchantment.DAMAGE_ALL to 4)) },
        "§b§l闪电鞭 §7(伪)",
        "§5由于你还没有完全掌握混元形意太极拳法的精髓,",
        "§5你不能完全使用出闪电鞭的能力"
    ).also {
        it.modifyMeta<ItemMeta> {
            addAttributeModifier(
                Attribute.GENERIC_ATTACK_SPEED,
                AttributeModifier(
                    UUID.randomUUID(),
                    "加快攻速0.5",
                    0.5,
                    AttributeModifier.Operation.ADD_NUMBER,
                    EquipmentSlot.OFF_HAND
                )
            )
            addAttributeModifier(
                Attribute.GENERIC_ATTACK_DAMAGE,
                AttributeModifier(
                    UUID.randomUUID(),
                    "增加伤害1",
                    1.0,
                    AttributeModifier.Operation.ADD_NUMBER,
                    EquipmentSlot.OFF_HAND
                )
            )
            addAttributeModifier(
                Attribute.GENERIC_MAX_HEALTH,
                AttributeModifier(
                    UUID.randomUUID(),
                    "增加最大血量2",
                    2.0,
                    AttributeModifier.Operation.ADD_NUMBER,
                    EquipmentSlot.OFF_HAND
                )
            )
        }
    }
    val SPEED_TORCH = SlimefunItemStack(
        "SPEED_TORCH",
        buildItem(XMaterial.SOUL_TORCH) { enchants[Enchantment.SOUL_SPEED] = 1 },
        "§5《加速火把》", "§b只是对于玩家来说").also {
            it.modifyMeta<ItemMeta> {
                addAttributeModifier(
                    Attribute.GENERIC_MOVEMENT_SPEED,
                    AttributeModifier(
                        UUID.randomUUID(),
                        "放在副手加速0.06",
                        0.06,
                        AttributeModifier.Operation.ADD_NUMBER,
                        EquipmentSlot.OFF_HAND
                    )
                )
            }
    }
    val HUMAN_SADDLE = SlimefunItemStack("HUMAN_SADDLE", buildItem(XMaterial.SADDLE) { shiny() }, "§a§l人鞍", "总感觉很奇怪...")
    val LIGHTNING_BOW = SlimefunItemStack("LIGHTNING_BOW", Material.BOW, "§b§l闪电弓", "被此弓射出去的箭击中", "将会被一道雷劈中")
    val ELECTRIC_CROSSBOW = SlimefunItemStack(
        "ELECTRIC_CROSSBOW",
        buildItem(XMaterial.CROSSBOW) { isUnbreakable = true;enchants[Enchantment.QUICK_CHARGE] = 5 },
        "§9电动弩",
        "",
        "§e以消耗巨大电量为代价瞬间填充箭矢!",
        "§7然而你还是需要自备箭矢",
        "",
        LoreBuilder.powerCharged(0, 1000),
        ""
    )
    val ANDURIL = SlimefunItemStack(
        "ANDURIL",
        buildItem(XMaterial.IRON_SWORD) { enchants.putAll(mapOf(Enchantment.DAMAGE_ALL to 2, Enchantment.DURABILITY to 2)) },
        "§aAndúril").also {
            it.modifyMeta<ItemMeta> {
                addAttributeModifier(
                    Attribute.GENERIC_MOVEMENT_SPEED,
                    AttributeModifier(
                        UUID.randomUUID(),
                        "放在主手加速0.02",
                        0.02,
                        AttributeModifier.Operation.ADD_NUMBER,
                        EquipmentSlot.HAND
                    )
                )
                addAttributeModifier(
                    Attribute.GENERIC_ARMOR,
                    AttributeModifier(
                        UUID.randomUUID(),
                        "增加护甲值2",
                        2.0,
                        AttributeModifier.Operation.ADD_NUMBER,
                        EquipmentSlot.HAND
                    )
                )
                addAttributeModifier(
                    Attribute.GENERIC_ARMOR_TOUGHNESS,
                    AttributeModifier(
                        UUID.randomUUID(),
                        "增加护甲韧性2",
                        2.0,
                        AttributeModifier.Operation.ADD_NUMBER,
                        EquipmentSlot.HAND
                    )
                )
            }
    }
    val DURALUMIN_DRILL = SlimefunItemStack(
        "DURALUMIN_DRILL",
        buildItem(XMaterial.DIAMOND_PICKAXE) { enchants.putAll(mapOf(Enchantment.DIG_SPEED to 2, Enchantment.DURABILITY to 3)) },
        "&9手钻 &7- &eI",
        "",
        LoreBuilder.material("Duralumin"),
        LoreBuilder.powerCharged(0, 200),
        ""
    )
    val SOLDER_DRILL = SlimefunItemStack(
        "SOLDER_DRILL",
        buildItem(XMaterial.DIAMOND_PICKAXE) { enchants.putAll(mapOf(Enchantment.DIG_SPEED to 3, Enchantment.DURABILITY to 4)) },
        "&9手钻 &7- &eII",
        "",
        LoreBuilder.material("Solder"),
        LoreBuilder.powerCharged(0, 300),
        ""
    )
    val BILLON_DRILL = SlimefunItemStack(
        "BILLON_DRILL",
        buildItem(XMaterial.DIAMOND_PICKAXE) { enchants.putAll(mapOf(Enchantment.DIG_SPEED to 4, Enchantment.DURABILITY to 5)) },
        "&9手钻 &7- &eIII",
        "",
        LoreBuilder.material("Billon"),
        LoreBuilder.powerCharged(0, 400),
        ""
    )
    val STEEL_DRILL = SlimefunItemStack(
        "STEEL_DRILL",
        buildItem(XMaterial.DIAMOND_PICKAXE) { enchants.putAll(mapOf(Enchantment.DIG_SPEED to 5, Enchantment.DURABILITY to 6)) },
        "&9手钻 &7- &eIV",
        "",
        LoreBuilder.material("钢"),
        LoreBuilder.powerCharged(0, 500),
        ""
    )
    val DAMASCUS_STEEL_DRILL = SlimefunItemStack(
        "DAMASCUS_STEEL_DRILL",
        buildItem(XMaterial.DIAMOND_PICKAXE) { enchants.putAll(mapOf(Enchantment.DIG_SPEED to 6, Enchantment.DURABILITY to 7)) },
        "&9手钻 &7- &eV",
        "",
        LoreBuilder.material("大马士革钢锭"),
        LoreBuilder.powerCharged(0, 600),
        ""
    )
    val REINFORCED_ALLOY_DRILL = SlimefunItemStack(
        "REINFORCED_ALLOY_DRILL",
        buildItem(XMaterial.DIAMOND_PICKAXE) { enchants.putAll(mapOf(Enchantment.DIG_SPEED to 7, Enchantment.DURABILITY to 9)) },
        "&9手钻 &7- &eVI",
        "",
        LoreBuilder.material("强化合金锭"),
        LoreBuilder.powerCharged(0, 750),
        ""
    )
    val CARBONADO_DRILL = SlimefunItemStack(
        "CARBONADO_DRILL",
        buildItem(XMaterial.DIAMOND_PICKAXE) { enchants[Enchantment.DIG_SPEED] = 7;isUnbreakable = true },
        "&9手钻 &7- &eVII",
        "",
        LoreBuilder.material("黑金刚石"),
        LoreBuilder.powerCharged(0, 2000),
        ""
    )
    val WBP_BOOTS = SlimefunItemStack("WBP_BOOTS", buildItem(XMaterial.LEATHER_BOOTS) { color = Color.LIME;isUnbreakable = true }, "&2王八牌皮鞋")
    val SLIMECHUNK_CHECKER = SlimefunItemStack(
        "SLIMECHUNK_CHECKER",
        SlimefunUtils.getCustomHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDkzNGE5ZjVhYjE3ODlhN2Q4ZGQ5NmQzMjQ5M2NkYWNmZjU3N2Q4YzgxZTdiMjM5MTdkZmYyZTMyYmQwYmMxMCJ9fX0="),
        "§a§l史莱姆区块检测器",
        "§9返回你所在的区块是否是史莱姆区块",
        "",
        LoreBuilder.powerCharged(0, 500),
        ""
    )
    val REINFORCED_SHIELD = SlimefunItemStack("REFINED_SHIELD", buildItem(XMaterial.SHIELD) { isUnbreakable = true }, "§b§l强化盾牌")
    val ELECTRIC_CUTTER = SlimefunItemStack(
        "ELECTRIC_CUTTER",
        buildItem(XMaterial.SHEARS) { isUnbreakable = true },
        "&9电动切割器",
        "&7右键快速切割黑曜石",
        "",
        LoreBuilder.powerCharged(0, 128),
        "",
        LoreBuilder.RIGHT_CLICK_TO_USE,
        ""
    )
    val T_8848 = SlimefunItemStack(
        "T_8848",
        SlimefunUtils.getCustomHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTJjZTlhNDg4YTZlZTQ0N2ExYzg3NzllZDBmYzAwOWU1YWE4MDJlY2E5YWZjOWIwMmU1ZGE5NTRmM2QwODY3MCJ9fX0="),
        "§e§l§n8848锇荧黑曜合金手机",
        "§b§o向沙雕的人士致敬"
    )
    val SPLASH_XSLF = SlimefunItemStack(
        "SPLASH_XSLF",
        buildItem(XMaterial.SPLASH_POTION) { color = Color.GREEN;potions += PotionEffect(PotionEffectType.HEAL, 20, 125) },
        "§a§l喷溅型雄氏老方",
        "§9服主专用",
        "§4§o就没有我治不死的玩家",
        "§7-小心点,别喷到自己了",
        "注:亡灵生物需要连续喷两次"
    )

    //  杂项
    val JIN_KE_LA = SlimefunItemStack("JIN_KE_LA", Material.BLAZE_POWDER, "§e金坷垃", "§e§o肥料掺了金坷垃,一袋能顶两袋撒")
    val HOPE_FLOWER = SlimefunItemStack("HOPE_FLOWER", buildItem(XMaterial.POPPY) { shiny() }, "希望之花", "§7所以说,不要停下来啊...")
    val COMPRESSED_EXP_BLOCK = SlimefunItemStack("COMPRESSED_EXP_BLOCK", Material.EMERALD_BLOCK, "§a压缩经验方块")
    val COMPRESSED_EXP_BLOCK_2 = SlimefunItemStack("COMPRESSED_EXP_BLOCK_2", buildItem(XMaterial.EMERALD_BLOCK) { shiny() }, "§a二重压缩经验方块")
//    val EXP_CONVERTER = SlimefunItemStack(
//        "EXP_CONVERTER",
//        buildItem(XMaterial.EMERALD) { shiny() },
//        "§a§l经验之书",
//        "§e右键存入一级经验",
//        "§eShift+右键取出一级经验",
//        "§6已存储等级: 0"
//    ).also {
//        SlimefunItemExpansion.levelDataService.setItemData(it, "0")
//    }
    val MEMORY_128B = SlimefunItemStack(
        "MEMORY_128B",
        SlimefunUtils.getCustomHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjYwYjAwNGYzNjBlMjg4NTVjY2YxMjM1YzJiZGVhMGEyOTk3YjBiYzAzMjU4ZTJkYzI0YWI4YTI1NzBhZWE2In19fQ=="),
        "§e128B超小内存"
    )
    val CPU = SlimefunItemStack(
        "UNKNOWN_CPU",
        SlimefunUtils.getCustomHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDU2Yzk0NjE5MDMxMjMxNjhjZTY2N2VhZDdlYTU2YTUxNjEzMDk3MDQ5YmE2NDc4MzJiMzcyMmFmZmJlYjYzNiJ9fX0="),
        "§eCPU"
    )
    val CAMERA_13 = SlimefunItemStack(
        "CAMERA_13",
        SlimefunUtils.getCustomHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDgwNjU0OGZhZTliZGQ5M2QzYmMxYzdkYTczNmI2OTVjZGYzZTcyYWU1NDFlOTJkNjA1N2I5NWI4NDI3In19fQ=="),
        "13像素超低清摄像头"
    )
    val COBWEB_SCREEN = SlimefunItemStack(
        "COBWEB_SCREEN",
        SlimefunUtils.getCustomHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGVmNWM3YjY5OGJmZjEyZmRiZTY2Mjk4ZDEwYWQyYjQzYzFlMWMwYmZmZjkwZDlmNWViNmVjNjMxMzhjNjE4In19fQ=="),
        "§e蛛网膜低清屏"
    )
    val MOUSE_TAIL = SlimefunItemStack("MOUSE_TAIL", Material.TWISTING_VINES, "§3耗子尾")

    //分类
    private val IE_GENERAL = NestedItemGroup(
        "IE_GENERAL".toKey(),
        CustomItemStack(
            SlimefunUtils.getCustomHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjgxOWFjZGIyMzEzYzEyOWJmNmFkMzQ1MjhkNDJhZGU3YjlhMmRmNjI3N2FkODRlN2I3NTFjOWY4OTk1NmRkYiJ9fX0="),
            "物品拓展"
        )
    )
    val IE_MACHINES_STUFF = SubItemGroup(
        "IE_MACHINES_STUFF".toKey(),
        IE_GENERAL,
        CustomItemStack(MACHINE_BLOCK, "物品拓展 - 机械")
    )
    val IE_MISC_STUFF = SubItemGroup(
        "IE_MISC_STUFF".toKey(),
        IE_GENERAL,
        CustomItemStack(Material.BUCKET, "物品拓展 - 杂项")
    )
    val IE_ATW_STUFF = SubItemGroup(
        "IE_TOOLSANDWEAPONS_STUFF".toKey(),
        IE_GENERAL,
        CustomItemStack(Material.NETHERITE_SWORD, "物品拓展 - 工具和武器装备")
    )
    val IE_RESOURCE_STUFF = SubItemGroup(
        "IE_RESOURCE_STUFF".toKey(),
        IE_GENERAL,
        CustomItemStack(OSGLOGLAS_INGOT, "物品拓展 - 材料")
    )
    val IE_FOOD_STUFF = SubItemGroup(
        "IE_FOOD_STUFF".toKey(),
        IE_GENERAL,
        CustomItemStack(
            SlimefunUtils.getCustomHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTQxMWNiNTRhYWExZTNkYjU1NWM3ODVmNmI3NWJlMWJmOGU2OGIyOGU1Y2ZjNTljOWE4NzY4OTRmNjFjZGMxNyJ9fX0="),
            "物品拓展 - 食物"
        )
    )
}