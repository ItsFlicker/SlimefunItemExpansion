package com.wlyscraft.slimefunitemexpansion;

import com.wlyscraft.slimefunitemexpansion.utils.SfUtils;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.utils.HeadTexture;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import me.mrCookieSlime.Slimefun.cscorelib2.skull.SkullItem;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.UUID;


public class Items {
    public static Category IE_MACHINES_STUFF
            = new Category(new NamespacedKey(SlimefunItemExpansion.getInstance(), "IE_MACHINES_STUFF"),
            new CustomItem(Material.IRON_BLOCK, "物品拓展 - 机械"));

    public static Category IE_MISC_STUFF
            = new Category(new NamespacedKey(SlimefunItemExpansion.getInstance(), "IE_MISC_STUFF"),
            new CustomItem(Material.BUCKET, "物品拓展 - 杂项"));

    public static Category IE_ATW_STUFF
            = new Category(new NamespacedKey(SlimefunItemExpansion.getInstance(), "IE_TOOLSANDWEAPONS_STUFF"),
            new CustomItem(Material.NETHERITE_SWORD, "物品拓展 - 工具和武器装备"));

    public static Category IE_FOOD_STUFF
            = new Category(new NamespacedKey(SlimefunItemExpansion.getInstance(), "IE_FOOD_STUFF"),
            new CustomItem(SkullItem.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTQxMWNiNTRhYWExZTNkYjU1NWM3ODVmNmI3NWJlMWJmOGU2OGIyOGU1Y2ZjNTljOWE4NzY4OTRmNjFjZGMxNyJ9fX0="), "物品拓展 - 食物"));

    public static SlimefunItemStack MACHINE_BLOCK = new SlimefunItemStack("IE_MACHINE_BLOCK", SkullItem.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmRkZDRhMTJkYTFjYzJjOWY5ZDZjZDQ5ZmM3NzhlM2ExMWYzNzU3ZGU2ZGQzMTJkNzBhMGQ0Nzg4NTE4OWMwIn19fQ=="), "§e钢制机壳");
    public static SlimefunItemStack ALLOY_FURNACE = new SlimefunItemStack("IE_ALLOY_FURNACE", SkullItem.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOWZiYjZlZWE1NzU0N2IyNTg4YmFmOGFmNjQ5ZDkxMTZmZjA4Y2FjNTZkZDIxNDBiM2M0OTU3Nzc5OWJhZDdjIn19fQ=="), "§4合金炉", "",LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(16));
    public static SlimefunItemStack COMPRESSED_FREEZER = new SlimefunItemStack("IE_COMPRESSED_FREEZER", SkullItem.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2VmNjVjZDUwYjg4NWI3MDVlNTU4ZTk1ODM2YTEyNDc3YWNjOGJhMzZlYWU1ODhiMjI1Njk0OTZjNzA0MzY4MCJ9fX0="), "§b四合一冰箱", "§e将水桶直接转换为反应堆冷却剂!", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(4), LoreBuilder.powerBuffer(512), LoreBuilder.powerPerSecond(120));
    public static SlimefunItemStack COBBLESTONE_GENERATOR = new SlimefunItemStack("IE_COBBLESTONE_GENERATOR", SkullItem.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjVjOTc2MjcyOWQ0OGQwYTE2ZmU4OTU3M2JkZDJmYWY1MDE5NmZlYTE1ZDQ5YjVhNmJmZWE0ODliZTcxIn19fQ=="), "§e造石机", "",LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(18));
    public static SlimefunItemStack COBBLESTONE_GENERATOR_2 = new SlimefunItemStack("IE_COBBLESTONE_GENERATOR_2", SkullItem.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjVjOTc2MjcyOWQ0OGQwYTE2ZmU4OTU3M2JkZDJmYWY1MDE5NmZlYTE1ZDQ5YjVhNmJmZWE0ODliZTcxIn19fQ=="), "§e造石机 §7- §eII", "",LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(2), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(30));
    public static SlimefunItemStack PHYTOGENIC_INSOLATOR = new SlimefunItemStack("IE_PHYTOGENIC_INSOLATOR", SkullItem.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTNiMjI4ZjcwYTM1ZDBhYTMyMzUwNDY3ZDllOGMwOWFhZTlhZTBhZTA4NzVmZGM4YzMxMWE4NzZiZTE5MDcxNyJ9fX0="), "§a有机灌注器", "§e将金坷垃灌注到任何原版农作物中!", "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(512), LoreBuilder.powerPerSecond(50));
    public static SlimefunItemStack METALLURGIC_INFUSER = new SlimefunItemStack("IE_METALLURGIC_INFUSER", SkullItem.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTQ4MzM3ZjdlZGUxNWMzYjJmOGRjNmE2M2JkOTI4NzRjZGY3NGVjODYyYjQxMThjN2UzNTU1OWNlOGI0ZCJ9fX0="), "§e冶金灌注机", "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(128), LoreBuilder.powerPerSecond(16));
    public static SlimefunItemStack LAVA_FACTORY = new SlimefunItemStack("LAVA_FACTORY", HeadTexture.LAVA_CRYSTAL, "§4岩浆工厂", "§e消耗大量电量来制造岩浆", "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(512), LoreBuilder.powerPerSecond(80));

    public static SlimefunItemStack DEATH_GENERATOR = new SlimefunItemStack("IE_DEATH_GENERATOR", Material.SKELETON_SKULL, "§e不死发电机", "", LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR), LoreBuilder.powerBuffer(64), LoreBuilder.powerPerSecond(20));
    public static SlimefunItemStack TNT_GENERATOR = new SlimefunItemStack("IE_TNT_GENERATOR", SkullItem.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2FmNTk3NzZmMmYwMzQxMmM3YjU5NDdhNjNhMGNmMjgzZDUxZmU2NWFjNmRmN2YyZjg4MmUwODM0NDU2NWU5In19fQ=="), "§eTNT发电机", "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.GENERATOR), LoreBuilder.powerBuffer(128), LoreBuilder.powerPerSecond(24));

    public static SlimefunItemStack WOODEN_GEAR = new SlimefunItemStack("WOODEN_GEAR" , SkullItem.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTk2M2EyZmY3MDBkZDc0ZjI5NzlhNzU4ZWM1ZDNkODE5MGM1YWJlMTU1Yjc4NTIwNmYzZDMyNjk5NTE3YTMzYSJ9fX0="), "§e木齿轮");
    public static SlimefunItemStack COBBLESTONE_GEAR = new SlimefunItemStack("COBBLESTONE_GEAR", SkullItem.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDc5MDEyZDFiZjljNzU3MTA3YjU5MTJiMDY4MzAyMGM1MWFjNDcyZTVjMjU3ZmE4NDQ2NWFkNWUxNDYyYjViYiJ9fX0="), "§e圆石齿轮");
    public static SlimefunItemStack IRON_GEAR = new SlimefunItemStack("IRON_GEAR", SkullItem.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmNiNGU0M2MyZjg1Nzc3MDVmM2VlMWM1NzBmYmJmNGUyN2ZkZTljM2RjMGU0NzI3MjFhYWE4YjA1Mzc3NWJlYiJ9fX0="), "§e铁齿轮");
    public static SlimefunItemStack WOFT = new SlimefunItemStack("WOFT", Material.CLOCK, "§e时间洪流怀表 MK.II", "§3Time flies...", "§6使用后将周围机器的运行速度提高100倍！", "§0不会有人真信了吧，不会吧，不会吧？");
    public static SlimefunItemStack STONE_TANK = new SlimefunItemStack("STONE_TANK", SkullItem.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjkxYjdiMjE3MjVmMTQ2ZDI5YzE5MmI3NDVkNzlkMjI2MDMyNjdjN2FkODkzYmFkZWI2NTQ2ZTc0NjYwMDA2MCJ9fX0="), "§e石制储罐");
    public static SlimefunItemStack HOPE_FLOWER = new SlimefunItemStack("HOPE_FLOWER", Material.POPPY, "希望之花", "§7所以说,不要停下来啊..."); //の

    public static SlimefunItemStack OSMIUM_DUST = new SlimefunItemStack("OSMIUM_DUST", Material.SUGAR, "§6锇粉");
    public static SlimefunItemStack OSMIUM_INGOT = new SlimefunItemStack("OSMIUM_INGOT", Material.IRON_INGOT, "§b锇锭");
    public static SlimefunItemStack MOUSE_TAIL = new SlimefunItemStack("MOUSE_TAIL", Material.TWISTING_VINES, "§3耗子尾");
    public static SlimefunItemStack MOUSE_TAIL_JUICE = new SlimefunItemStack("MOUSE_TAIL_JUICE", Color.SILVER, new PotionEffect(PotionEffectType.SATURATION, 20, 0), "§3耗子尾汁", "", "§7恢复 §b??? §7的饥饿值");

    public static SlimefunItemStack LIGHTNING_WHIP = new SlimefunItemStack("LIGHTNING_WHIP", Material.STICK, "§b§l闪电鞭 §7(伪)", "§5由于你还没有完全掌握混元形意太极拳法的精髓,","§5你不能完全使用出闪电鞭的能力");
    public static SlimefunItemStack SPEED_TORCH = new SlimefunItemStack("SPEED_TORCH", Material.SOUL_TORCH, "§5《加速火把》", "§b只是对于玩家来说");
    public static SlimefunItemStack HUMAN_SADDLE = new SlimefunItemStack("HUMAN_SADDLE", Material.SADDLE, "§a§l人鞍", "总感觉很奇怪...");

    public static final SlimefunItemStack BASIC_COIL = new SlimefunItemStack("IE_BASE_COIL", Material.COBWEB, "§e基础线圈");
    public static final SlimefunItemStack ADVANCED_COIL = new SlimefunItemStack("IE_ADVANCED_COIL", Material.COBWEB, "§e§l高级线圈", "§7仅仅只是闪闪发光而已");


    public static final SlimefunItemStack DURALUMIN_DRILL = new SlimefunItemStack("DURALUMIN_DRILL", Material.DIAMOND_PICKAXE, "&9手钻 &7- &eI", "", LoreBuilder.material("Duralumin"), LoreBuilder.powerCharged(0, 200), "");
    public static final SlimefunItemStack SOLDER_DRILL = new SlimefunItemStack("SOLDER_DRILL", Material.DIAMOND_PICKAXE, "&9手钻 &7- &eII", "", LoreBuilder.material("Solder"), LoreBuilder.powerCharged(0, 300), "");
    public static final SlimefunItemStack BILLON_DRILL = new SlimefunItemStack("BILLON_DRILL", Material.DIAMOND_PICKAXE, "&9手钻 &7- &eIII", "", LoreBuilder.material("Billon"), LoreBuilder.powerCharged(0, 400), "");
    public static final SlimefunItemStack STEEL_DRILL = new SlimefunItemStack("STEEL_DRILL", Material.DIAMOND_PICKAXE, "&9手钻 &7- &eIV", "", LoreBuilder.material("Steel"), LoreBuilder.powerCharged(0, 500), "");
    public static final SlimefunItemStack DAMASCUS_STEEL_DRILL = new SlimefunItemStack("DAMASCUS_STEEL_DRILL", Material.DIAMOND_PICKAXE, "&9手钻 &7- &eV", "", LoreBuilder.material("Damascus Steel"), LoreBuilder.powerCharged(0, 600), "");
    public static final SlimefunItemStack REINFORCED_ALLOY_DRILL = new SlimefunItemStack("REINFORCED_ALLOY_DRILL", Material.DIAMOND_PICKAXE, "&9手钻 &7- &eVI", "", LoreBuilder.material("Reinforced Alloy"), LoreBuilder.powerCharged(0, 750), "");
    public static final SlimefunItemStack CARBONADO_DRILL = new SlimefunItemStack("CARBONADO_DRILL", Material.DIAMOND_PICKAXE, "&9手钻 &7- &eVII", "", LoreBuilder.material("Carbonado"), LoreBuilder.powerCharged(0, 1000), "");

    static {
        DURALUMIN_DRILL.addUnsafeEnchantment(Enchantment.DIG_SPEED, 5);
        DURALUMIN_DRILL.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
        ItemMeta duralumin = DURALUMIN_DRILL.getItemMeta();
        duralumin.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        DURALUMIN_DRILL.setItemMeta(duralumin);

        SOLDER_DRILL.addUnsafeEnchantment(Enchantment.DIG_SPEED, 5);
        SOLDER_DRILL.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
        ItemMeta solder = SOLDER_DRILL.getItemMeta();
        solder.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        SOLDER_DRILL.setItemMeta(solder);

        BILLON_DRILL.addUnsafeEnchantment(Enchantment.DIG_SPEED, 5);
        BILLON_DRILL.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
        ItemMeta billon = BILLON_DRILL.getItemMeta();
        billon.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        BILLON_DRILL.setItemMeta(billon);

        STEEL_DRILL.addUnsafeEnchantment(Enchantment.DIG_SPEED, 5);
        STEEL_DRILL.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
        ItemMeta steel = STEEL_DRILL.getItemMeta();
        steel.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        STEEL_DRILL.setItemMeta(steel);

        DAMASCUS_STEEL_DRILL.addUnsafeEnchantment(Enchantment.DIG_SPEED, 5);
        DAMASCUS_STEEL_DRILL.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
        ItemMeta damascus = DAMASCUS_STEEL_DRILL.getItemMeta();
        damascus.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        DAMASCUS_STEEL_DRILL.setItemMeta(damascus);

        REINFORCED_ALLOY_DRILL.addUnsafeEnchantment(Enchantment.DIG_SPEED, 5);
        REINFORCED_ALLOY_DRILL.addUnsafeEnchantment(Enchantment.DURABILITY, 15);
        ItemMeta reinforced = REINFORCED_ALLOY_DRILL.getItemMeta();
        reinforced.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        REINFORCED_ALLOY_DRILL.setItemMeta(reinforced);

        CARBONADO_DRILL.addUnsafeEnchantment(Enchantment.DIG_SPEED, 5);
        CARBONADO_DRILL.addUnsafeEnchantment(Enchantment.DURABILITY, 15);
        ItemMeta carbonado = CARBONADO_DRILL.getItemMeta();
        carbonado.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        CARBONADO_DRILL.setItemMeta(carbonado);
    }

    public static SlimefunItemStack LIGHTNING_BOW = new SlimefunItemStack("LIGHTNING_BOW", Material.BOW, "§b§l闪电弓", "被此弓射出去的箭击中", "将有25%的几率被一道§0§m假§r雷劈中");
    public static SlimefunItemStack ELECTRIC_CROSSBOW = new SlimefunItemStack("ELECTRIC_CROSSBOW", Material.CROSSBOW, "§9电动弩", "", "§e以消耗巨大电量为代价瞬间填充箭矢!", "§7然而你还是需要自备箭矢", "", LoreBuilder.powerCharged(0, 1000), "");
    public static SlimefunItemStack ANDURIL = new SlimefunItemStack("ANDURIL", Material.IRON_SWORD, "§aAndúril", "§7穿越而来...");

    public static SlimefunItemStack JIN_KE_LA = new SlimefunItemStack("JIN_KE_LA", Material.BLAZE_POWDER, "§e金坷垃", "§e§o肥料掺了金坷垃,一袋能顶两袋撒");

    public static SlimefunItemStack COMPRESSED_EXP_BLOCK = new SlimefunItemStack("COMPRESSED_EXP_BLOCK", Material.EMERALD_BLOCK, "§a压缩经验方块");
    public static SlimefunItemStack COMPRESSED_EXP_BLOCK_2 = new SlimefunItemStack("COMPRESSED_EXP_BLOCK_2", Material.EMERALD_BLOCK, "§a二重压缩经验方块");
    public static SlimefunItemStack EXP_CONVERTER = new SlimefunItemStack("EXP_CONVERTER", Material.WRITTEN_BOOK, "§a§l经验之书", "§e右键存入一级经验", "§eShift+右键取出一级经验", "§6已存储: 0级");

    public static SlimefunItemStack ENHANCED_GLOWSTONE = new SlimefunItemStack("ENHANCED_GLOWSTONE", Material.BRICK, "§e强化荧石锭");
    public static SlimefunItemStack ENHANCED_OBSIDIAN = new SlimefunItemStack("ENHANCED_OBSIDIAN", Material.OBSIDIAN, "§b强化黑曜石");
    public static SlimefunItemStack OSGLOGLAS_INGOT = new SlimefunItemStack("OSGLOGLAS_INGOT", Material.IRON_INGOT, "§b§l锇荧黑曜合金锭");

    public static SlimefunItemStack SHIT = new SlimefunItemStack("SHIT", Material.BROWN_WOOL, "§5棕色不明物体", "", LoreBuilder.hunger(-114514));
    public static SlimefunItemStack WJZ_RICE = new SlimefunItemStack("WJZ_RICE", SkullItem.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTk0Yzk1NDE0ZDkyN2Y3ZWQ4NmE0YWUxODA3N2RmNjY3OThlYTczNmRkYjVjYjQ5YWFkNzY5OWQ5MWRkMWVmMiJ9fX0="), "§e王境泽的炒饭", "", LoreBuilder.hunger(1.5));

    public static SlimefunItemStack BASIC_CONTROL_CIRCUIT = new SlimefunItemStack("IE_BASIC_CONTROL_CIRCUIT", Material.ACTIVATOR_RAIL, "§a基础控制电路");
    public static SlimefunItemStack ADVANCED_CONTROL_CIRCUIT = new SlimefunItemStack("IE_ADVANCED_CONTROL_CIRCUIT", Material.POWERED_RAIL, "§4高级控制电路");
    public static SlimefunItemStack ENRICHED_ALLOY = new SlimefunItemStack("IE_ENRICHED_ALLOY", Material.REDSTONE, "§e富集合金");

    public static SlimefunItemStack WBP_BOOTS = new SlimefunItemStack("WBP_BOOTS", Material.LEATHER_BOOTS, Color.LIME, "王八牌皮鞋");

    public static SlimefunItemStack MANMADE_DRAGON_BREATH = new SlimefunItemStack("MANMADE_DRAGON_BREATH", Material.DRAGON_BREATH, "人造龙息");

    public static SlimefunItemStack MEMORY_128B = new SlimefunItemStack("MEMORY_128B", SkullItem.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjYwYjAwNGYzNjBlMjg4NTVjY2YxMjM1YzJiZGVhMGEyOTk3YjBiYzAzMjU4ZTJkYzI0YWI4YTI1NzBhZWE2In19fQ=="), "§e128B超小内存");
    public static SlimefunItemStack CPU = new SlimefunItemStack("UNKNOWN_CPU", SkullItem.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDU2Yzk0NjE5MDMxMjMxNjhjZTY2N2VhZDdlYTU2YTUxNjEzMDk3MDQ5YmE2NDc4MzJiMzcyMmFmZmJlYjYzNiJ9fX0="), "§eCPU");
    public static SlimefunItemStack CAMERA_13 = new SlimefunItemStack("CAMERA_13", SkullItem.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDgwNjU0OGZhZTliZGQ5M2QzYmMxYzdkYTczNmI2OTVjZGYzZTcyYWU1NDFlOTJkNjA1N2I5NWI4NDI3In19fQ=="), "13像素超低清摄像头");
    public static SlimefunItemStack COBWEB_SCREEN = new SlimefunItemStack("COBWEB_SCREEN", SkullItem.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGVmNWM3YjY5OGJmZjEyZmRiZTY2Mjk4ZDEwYWQyYjQzYzFlMWMwYmZmZjkwZDlmNWViNmVjNjMxMzhjNjE4In19fQ=="), "§e蛛网膜低清屏");
    public static SlimefunItemStack T_8848 = new SlimefunItemStack("T_8848", SkullItem.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTJjZTlhNDg4YTZlZTQ0N2ExYzg3NzllZDBmYzAwOWU1YWE4MDJlY2E5YWZjOWIwMmU1ZGE5NTRmM2QwODY3MCJ9fX0="), "§e§l§n8848锇荧黑曜合金手机", "§b§o向沙雕的人士致敬");

    public static SlimefunItemStack XIONG_SHI_LAO_FANG = new SlimefunItemStack("XIONG_SHI_LAO_FANG", Color.GREEN, new PotionEffect(PotionEffectType.HEAL, 20, 125), "§a雄氏老方", "§e微笑着面对它!");
    public static SlimefunItemStack SPLASH_XSLF = new SlimefunItemStack("SPLASH_XSLF", Material.SPLASH_POTION, "§a§l喷溅型雄氏老方", "§9服主专用", "§4§o就没有我治不死的玩家", "§7-小心点,别喷到自己了", "注:亡灵生物需要连续喷两次");

    static {
        WOFT.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 1);

        SfUtils.hideEnchants(ADVANCED_COIL);
        ADVANCED_COIL.addUnsafeEnchantment(Enchantment.DURABILITY, 1);

        SfUtils.hideEnchants(COMPRESSED_EXP_BLOCK_2);
        COMPRESSED_EXP_BLOCK_2.addUnsafeEnchantment(Enchantment.LUCK, 1);

        ItemMeta ec = EXP_CONVERTER.getItemMeta();
        PersistentDataContainer ecc = ec.getPersistentDataContainer();
        EXPDataType.EXP exp = new EXPDataType.EXP();
        ecc.set(new NamespacedKey(SlimefunItemExpansion.getInstance(), "ecExp"), EXPDataType.instance, exp);
        EXP_CONVERTER.setItemMeta(ec);

        ItemMeta st = SPEED_TORCH.getItemMeta();
        st.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, new AttributeModifier(UUID.randomUUID(), "放在副手加速0.06", 0.06D, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.OFF_HAND));
        st.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        SPEED_TORCH.setItemMeta(st);
        SPEED_TORCH.addUnsafeEnchantment(Enchantment.SOUL_SPEED, 1);

        ItemMeta lw = LIGHTNING_WHIP.getItemMeta();
        lw.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, new AttributeModifier(UUID.randomUUID(), "加快攻速0.5", 0.5D, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.OFF_HAND));
        lw.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(UUID.randomUUID(), "增加伤害1", 1, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.OFF_HAND));
        lw.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, new AttributeModifier(UUID.randomUUID(), "增加最大血量2", 2, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.OFF_HAND));
        LIGHTNING_WHIP.setItemMeta(lw);
        LIGHTNING_WHIP.addUnsafeEnchantment(Enchantment.CHANNELING, 1);
        LIGHTNING_WHIP.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 3);

        SfUtils.hideEnchants(ENHANCED_GLOWSTONE);
        SfUtils.hideEnchants(ENHANCED_OBSIDIAN);
        SfUtils.hideEnchants(OSGLOGLAS_INGOT);
        ENHANCED_GLOWSTONE.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
        ENHANCED_OBSIDIAN.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
        OSGLOGLAS_INGOT.addUnsafeEnchantment(Enchantment.DURABILITY, 1);

        SfUtils.hideEnchants(HOPE_FLOWER);
        HOPE_FLOWER.addUnsafeEnchantment(Enchantment.DURABILITY, 1);

        SfUtils.hideEnchants(SHIT);
        SHIT.addUnsafeEnchantment(Enchantment.THORNS, 1);

        SfUtils.hideEnchants(BASIC_CONTROL_CIRCUIT);
        BASIC_CONTROL_CIRCUIT.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);

        SfUtils.hideEnchants(ADVANCED_CONTROL_CIRCUIT);
        ADVANCED_CONTROL_CIRCUIT.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);

        SfUtils.hideEnchants(ENRICHED_ALLOY);
        ENRICHED_ALLOY.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);

        ItemMeta anduril = ANDURIL.getItemMeta();
        anduril.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, new AttributeModifier(UUID.randomUUID(), "放在主手加速0.02", 0.02D, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND));
        anduril.addAttributeModifier(Attribute.GENERIC_ARMOR, new AttributeModifier(UUID.randomUUID(), "增加护甲值2", 2, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND));
        anduril.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, new AttributeModifier(UUID.randomUUID(), "增加护甲韧性2", 2, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND));
        ANDURIL.setItemMeta(anduril);
        ANDURIL.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 2);
        ANDURIL.addUnsafeEnchantment(Enchantment.DURABILITY, 2);

        SfUtils.hideEnchants(ELECTRIC_CROSSBOW);
        ELECTRIC_CROSSBOW.addUnsafeEnchantment(Enchantment.QUICK_CHARGE, 5);
        ELECTRIC_CROSSBOW.addUnsafeEnchantment(Enchantment.DURABILITY, 20);

        SfUtils.hideEnchants(WBP_BOOTS);
        ItemMeta wb = WBP_BOOTS.getItemMeta();
        wb.setUnbreakable(true);
        WBP_BOOTS.setItemMeta(wb);
        WBP_BOOTS.addUnsafeEnchantment(Enchantment.DURABILITY, 6);

        SfUtils.hideEnchants(HUMAN_SADDLE);
        HUMAN_SADDLE.addUnsafeEnchantment(Enchantment.DURABILITY, 1);

        ItemMeta xslf = XIONG_SHI_LAO_FANG.getItemMeta();
        xslf.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
        XIONG_SHI_LAO_FANG.setItemMeta(xslf);

        ItemMeta sx = SPLASH_XSLF.getItemMeta();
        ((PotionMeta) sx).setColor(Color.GREEN);
        ((PotionMeta) sx).addCustomEffect(new PotionEffect(PotionEffectType.HEAL, 20, 125), true);
        sx.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
        SPLASH_XSLF.setItemMeta(sx);
    }
}
