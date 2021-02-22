package com.wlyscraft.slimefunitemexpansion;

import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
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

    public static Category IE_TOOLSANDWEAPONS_STUFF
            = new Category(new NamespacedKey(SlimefunItemExpansion.getInstance(), "IE_TOOLSANDWEAPONS_STUFF"),
            new CustomItem(Material.NETHERITE_SWORD, "物品拓展 - 工具和武器"));

    public static SlimefunItemStack MACHINE_BLOCK = new SlimefunItemStack("IE_MACHINE_BLOCK", SkullItem.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmRkZDRhMTJkYTFjYzJjOWY5ZDZjZDQ5ZmM3NzhlM2ExMWYzNzU3ZGU2ZGQzMTJkNzBhMGQ0Nzg4NTE4OWMwIn19fQ=="), "§e钢制机壳");
    public static SlimefunItemStack ALLOY_FURNACE = new SlimefunItemStack("IE_ALLOY_FURNACE", SkullItem.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOWZiYjZlZWE1NzU0N2IyNTg4YmFmOGFmNjQ5ZDkxMTZmZjA4Y2FjNTZkZDIxNDBiM2M0OTU3Nzc5OWJhZDdjIn19fQ=="), "§4合金炉", "",LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(16));
    public static SlimefunItemStack COMPRESSED_FREEZER = new SlimefunItemStack("IE_COMPRESSED_FREEZER", SkullItem.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2VmNjVjZDUwYjg4NWI3MDVlNTU4ZTk1ODM2YTEyNDc3YWNjOGJhMzZlYWU1ODhiMjI1Njk0OTZjNzA0MzY4MCJ9fX0="), "§b四合一冰箱", "§e将水桶直接转换为反应堆冷却剂!", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(512), LoreBuilder.powerPerSecond(60));
    public static SlimefunItemStack COBBLESTONE_GENERATOR = new SlimefunItemStack("IE_COBBLESTONE_GENERATOR", SkullItem.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjVjOTc2MjcyOWQ0OGQwYTE2ZmU4OTU3M2JkZDJmYWY1MDE5NmZlYTE1ZDQ5YjVhNmJmZWE0ODliZTcxIn19fQ=="), "§e造石机", "",LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(20));
    public static SlimefunItemStack PHYTOGENIC_INSOLATOR = new SlimefunItemStack("PHYTOGENIC_INSOLATOR", SkullItem.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTNiMjI4ZjcwYTM1ZDBhYTMyMzUwNDY3ZDllOGMwOWFhZTlhZTBhZTA4NzVmZGM4YzMxMWE4NzZiZTE5MDcxNyJ9fX0="), "§a有机灌注器", "§e将金坷垃灌注到任何原版农作物中!", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(512), LoreBuilder.powerPerSecond(60));

    public static SlimefunItemStack WOODEN_GEAR = new SlimefunItemStack("WOODEN_GEAR" , SkullItem.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTk2M2EyZmY3MDBkZDc0ZjI5NzlhNzU4ZWM1ZDNkODE5MGM1YWJlMTU1Yjc4NTIwNmYzZDMyNjk5NTE3YTMzYSJ9fX0="), "§e木齿轮");
    public static SlimefunItemStack COBBLESTONE_GEAR = new SlimefunItemStack("COBBLESTONE_GEAR", SkullItem.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDc5MDEyZDFiZjljNzU3MTA3YjU5MTJiMDY4MzAyMGM1MWFjNDcyZTVjMjU3ZmE4NDQ2NWFkNWUxNDYyYjViYiJ9fX0="), "§e圆石齿轮");
    public static SlimefunItemStack IRON_GEAR = new SlimefunItemStack("IRON_GEAR", SkullItem.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmNiNGU0M2MyZjg1Nzc3MDVmM2VlMWM1NzBmYmJmNGUyN2ZkZTljM2RjMGU0NzI3MjFhYWE4YjA1Mzc3NWJlYiJ9fX0="), "§e铁齿轮");
    public static SlimefunItemStack WOFT = new SlimefunItemStack("WOFT", Material.CLOCK, "§e时间洪流怀表 MK.II", "§3Time flies...", "§6使用后将周围机器的运行速度提高100倍！", "§0不会有人真信了吧，不会吧，不会吧？");
    public static SlimefunItemStack STONE_TANK = new SlimefunItemStack("STONE_TANK", SkullItem.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjkxYjdiMjE3MjVmMTQ2ZDI5YzE5MmI3NDVkNzlkMjI2MDMyNjdjN2FkODkzYmFkZWI2NTQ2ZTc0NjYwMDA2MCJ9fX0="), "§e石制储罐");


    public static SlimefunItemStack OSMIUM_DUST = new SlimefunItemStack("OSMIUM_DUST", Material.SUGAR, "§6锇粉");
    public static SlimefunItemStack OSMIUM_INGOT = new SlimefunItemStack("OSMIUM_INGOT", Material.IRON_INGOT, "§b锇锭");
    public static SlimefunItemStack MOUSE_TAIL = new SlimefunItemStack("MOUSE_TAIL", Material.TWISTING_VINES, "§3耗子尾", "§2杀死蠹虫时有5%的几率掉落", "§3这个不能吃！");
    public static SlimefunItemStack MOUSE_TAIL_JUICE = new SlimefunItemStack("MOUSE_TAIL_JUICE", Color.SILVER, new PotionEffect(PotionEffectType.SATURATION, 20 * 5, 0), "§3耗子尾汁", "",LoreBuilder.hunger(2147483647));

    public static SlimefunItemStack LIGHTNING_WHIP = new SlimefunItemStack("LIGHTNING_WHIP", Material.STICK, "§b§l闪电鞭 §7(伪)", "§5由于你还没有完全掌握混元形意太极拳法的精髓,","§5你不能完全使用出闪电鞭的能力");
    public static SlimefunItemStack SPEED_TORCH = new SlimefunItemStack("SPEED_TORCH", Material.SOUL_TORCH, "§5《加速火把》", "§b只是对于玩家来说");

    public static final SlimefunItemStack BASIC_COIL = new SlimefunItemStack("IE_BASE_COIL", Material.COBWEB, "§e基础线圈");
    public static final SlimefunItemStack ADVANCED_COIL = new SlimefunItemStack("IE_ADVANCED_COIL", Material.COBWEB, "§e§l高级线圈");


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

    public static SlimefunItemStack JIN_KE_LA = new SlimefunItemStack("JIN_KE_LA", Material.BLAZE_POWDER, "§e金坷垃", "§e\"肥料掺了金坷垃,一袋能顶两袋撒\"");

    public static SlimefunItemStack COMPRESSED_EXP_BLOCK = new SlimefunItemStack("COMPRESSED_EXP_BLOCK", Material.EMERALD_BLOCK, "§a压缩经验方块");
    public static SlimefunItemStack COMPRESSED_EXP_BLOCK_2 = new SlimefunItemStack("COMPRESSED_EXP_BLOCK_2", Material.EMERALD_BLOCK, "§a二重压缩经验方块");
    public static SlimefunItemStack EXP_CONVERTER = new SlimefunItemStack("EXP_CONVERTER", Material.WRITTEN_BOOK, "§a§l经验之书", "§e右键存入一级经验", "§eShift+右键取出一级经验", "§6已存储: 0级");

    static {
        WOFT.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 1);
        ADVANCED_COIL.addUnsafeEnchantment(Enchantment.DURABILITY, 1);

        ItemMeta ceb2 = COMPRESSED_EXP_BLOCK_2.getItemMeta();
        ceb2.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        COMPRESSED_EXP_BLOCK_2.setItemMeta(ceb2);
        COMPRESSED_EXP_BLOCK_2.addUnsafeEnchantment(Enchantment.LUCK, 1);

        ItemMeta ec = EXP_CONVERTER.getItemMeta();
        ec.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_ATTRIBUTES);
        EXP_CONVERTER.setItemMeta(ec);
        EXP_CONVERTER.addUnsafeEnchantment(Enchantment.BINDING_CURSE, 0);

        ItemMeta st = SPEED_TORCH.getItemMeta();
        st.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, new AttributeModifier(UUID.randomUUID(), "放在副手加速0.05", 0.05D, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.OFF_HAND));
        st.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        SPEED_TORCH.setItemMeta(st);
        SPEED_TORCH.addUnsafeEnchantment(Enchantment.SOUL_SPEED, 1);

        ItemMeta lw = LIGHTNING_WHIP.getItemMeta();
        lw.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, new AttributeModifier(UUID.randomUUID(), "加快攻速1", 1.5D, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.OFF_HAND));
        lw.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(UUID.randomUUID(), "增加伤害1", 1, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.OFF_HAND));
        lw.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, new AttributeModifier(UUID.randomUUID(), "增加最大血量4", 4, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.OFF_HAND));
        LIGHTNING_WHIP.setItemMeta(lw);
        LIGHTNING_WHIP.addUnsafeEnchantment(Enchantment.CHANNELING, 1);
        LIGHTNING_WHIP.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 2);
    }
}
