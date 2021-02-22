package com.wlyscraft.slimefunitemexpansion.tasks;

import com.wlyscraft.slimefunitemexpansion.items.Drill;
import com.wlyscraft.slimefunitemexpansion.Items;
import com.wlyscraft.slimefunitemexpansion.items.MouseTail;
import com.wlyscraft.slimefunitemexpansion.SlimefunItemExpansion;
import com.wlyscraft.slimefunitemexpansion.utils.SfUtils;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.cscorelib2.skull.SkullItem;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Arrays;

import static com.wlyscraft.slimefunitemexpansion.utils.SfUtils.sendMessage;

public class ItemRegisterTask {
    public static void run() {
        SfUtils.registerNonPlaceableItem(Items.WOODEN_GEAR, Items.IE_MISC_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.OAK_PLANKS), new ItemStack(Material.STICK), new ItemStack(Material.OAK_PLANKS),
                new ItemStack(Material.STICK), null, new ItemStack(Material.STICK),
                new ItemStack(Material.OAK_PLANKS), new ItemStack(Material.STICK), new ItemStack(Material.OAK_PLANKS)});
        SfUtils.registerNonPlaceableItem(Items.COBBLESTONE_GEAR, Items.IE_MISC_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                null, new ItemStack(Material.COBBLESTONE), null,
                new ItemStack(Material.COBBLESTONE), Items.WOODEN_GEAR, new ItemStack(Material.COBBLESTONE),
                null, new ItemStack(Material.COBBLESTONE), null});
        SfUtils.registerNonPlaceableItem(Items.IRON_GEAR, Items.IE_MISC_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                null, new ItemStack(Material.IRON_INGOT), null,
                new ItemStack(Material.IRON_INGOT), Items.COBBLESTONE_GEAR, new ItemStack(Material.IRON_INGOT),
                null, new ItemStack(Material.IRON_INGOT), null});
        SfUtils.registerNonPlaceableItem(Items.MACHINE_BLOCK, Items.IE_MACHINES_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.STEEL_INGOT, Items.OSMIUM_INGOT, SlimefunItems.STEEL_INGOT,
                Items.IRON_GEAR, new ItemStack(Material.GLASS), Items.IRON_GEAR,
                SlimefunItems.STEEL_INGOT, Items.OSMIUM_INGOT, SlimefunItems.STEEL_INGOT
        });

        SfUtils.registerItem(Items.WOFT, Items.IE_MISC_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.ENDER_PEARL), new ItemStack(Material.DIAMOND), new ItemStack(Material.ENDER_PEARL),
                new ItemStack(Material.GOLD_INGOT), new ItemStack(Material.CLOCK), new ItemStack(Material.GOLD_INGOT),
                new ItemStack(Material.ENDER_PEARL), new ItemStack(Material.DIAMOND), new ItemStack(Material.ENDER_PEARL)
        }, (ItemUseHandler) e -> {
            if (e.getHand() != EquipmentSlot.HAND) return;
            Player player = e.getPlayer();
            ItemStack item = e.getItem();
            if (item.getAmount() > 1) {
                item.setAmount(item.getAmount() - 1);
                player.getInventory().setItemInMainHand(item);
            } else {
                player.getInventory().setItemInMainHand(null);
            }
            player.getLocation().getWorld().createExplosion(player.getLocation(), 1.5F, false, false);
            player.getLocation().getWorld().dropItem(player.getLocation(), new ItemStack(Material.ENDER_PEARL, 2));
            player.getLocation().getWorld().dropItem(player.getLocation(), new ItemStack(Material.DIAMOND, 2));
            player.getLocation().getWorld().dropItem(player.getLocation(), new ItemStack(Material.GOLD_INGOT, 2));
            sendMessage(player, "§4由于你错误的使用方式，时间洪流怀表爆炸了！");
            sendMessage(player, "§e幸运的是，时间洪流怀表的部分材料没有被炸坏...");
            sendMessage(player, "§2你应该先看看教程再来使用的：https://www.bilibili.com/video/BV1GJ411x7h7");
        });

        SfUtils.registerNonPlaceableItem(Items.STONE_TANK, Items.IE_MISC_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.STONE), new ItemStack(Material.GLASS_PANE), new ItemStack(Material.STONE),
                new ItemStack(Material.GLASS_PANE), null,new ItemStack(Material.GLASS_PANE),
                new ItemStack(Material.STONE), new ItemStack(Material.GLASS_PANE), new ItemStack(Material.STONE)
        });

        SfUtils.registerItem(Items.JIN_KE_LA, Items.IE_MISC_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.BONE_MEAL), new ItemStack(Material.BONE_MEAL), new ItemStack(Material.BONE_MEAL),
                new ItemStack(Material.BONE_MEAL), new ItemStack(Material.GOLD_INGOT), new ItemStack(Material.BONE_MEAL),
                new ItemStack(Material.BONE_MEAL), new ItemStack(Material.BONE_MEAL), new ItemStack(Material.BONE_MEAL)
        });

        SfUtils.registerItem(Items.OSMIUM_DUST, Items.IE_MISC_STUFF, RecipeType.GEO_MINER, new ItemStack[] {null, null, null, null, null, null, null, null, null});
        SfUtils.registerItem(Items.OSMIUM_INGOT, Items.IE_MISC_STUFF, RecipeType.SMELTERY, new ItemStack[] {Items.OSMIUM_DUST, null, null, null, null, null, null, null, null});
        SfUtils.addSmelteryRecipe(Items.OSMIUM_DUST, Items.OSMIUM_INGOT);

        new MouseTail(Items.IE_MISC_STUFF, Items.MOUSE_TAIL, RecipeType.MOB_DROP,
                new ItemStack[]{
                        null, null, null,
                        null, new SlimefunItemStack("SILVERFISH_HEAD", SkullItem.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGE5MWRhYjgzOTFhZjVmZGE1NGFjZDJjMGIxOGZiZDgxOWI4NjVlMWE4ZjFkNjIzODEzZmE3NjFlOTI0NTQwIn19fQ=="), "§aSilverfish"), null,
                        null, null, null}).register(SlimefunItemExpansion.getInstance());
        SfUtils.registerItem(Items.MOUSE_TAIL_JUICE, Items.IE_MISC_STUFF, RecipeType.JUICER, new ItemStack[]{
                Items.MOUSE_TAIL, null, null,
                null, null, null,
                null, null, null
        }, (ItemUseHandler) e -> {
            if (e.getHand() != EquipmentSlot.HAND) return;
            Player player = e.getPlayer();
            player.getInventory().setItemInMainHand(null);
            sendMessage(player, "§3你只微微尝了一口...");
            sendMessage(player, "§2生命值已回满！");
            sendMessage(player, "§1...但是你大E了！");
            player.addPotionEffects(Arrays.asList(new PotionEffect(PotionEffectType.POISON, 20 * 20, 4),
                    new PotionEffect(PotionEffectType.LEVITATION, 20, 24)));
        });

        SfUtils.registerItem(Items.LIGHTNING_WHIP, Items.IE_TOOLSANDWEAPONS_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                null, null, SlimefunItems.STAFF_STORM,
                null, new ItemStack(Material.COBWEB), null,
                SlimefunItems.STAFF_STORM, null, null
        });

        SfUtils.registerNonPlaceableItem(Items.BASIC_COIL, Items.IE_MISC_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                null, SlimefunItems.COPPER_WIRE, null,
                SlimefunItems.COPPER_WIRE, new ItemStack(Material.STICK), SlimefunItems.COPPER_WIRE,
                null, SlimefunItems.COPPER_WIRE, null
        });

        SfUtils.registerNonPlaceableItem(Items.ADVANCED_COIL, Items.IE_MISC_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.GOLD_NUGGET),
                new ItemStack(Material.GOLD_NUGGET), Items.BASIC_COIL, new ItemStack(Material.GOLD_NUGGET),
                new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.GOLD_NUGGET)
        });

        SfUtils.registerNonPlaceableItem(Items.SPEED_TORCH, Items.IE_TOOLSANDWEAPONS_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.RABBIT_FOOT), Items.WOFT, new ItemStack(Material.RABBIT_FOOT),
                SlimefunItems.ENDER_RUNE, new ItemStack(Material.SOUL_TORCH), SlimefunItems.ENDER_RUNE,
                new ItemStack(Material.RABBIT_FOOT), Items.WOFT, new ItemStack(Material.RABBIT_FOOT)
        });

        SfUtils.registerNonPlaceableItem(Items.COMPRESSED_EXP_BLOCK, Items.IE_MISC_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.FILLED_FLASK_OF_KNOWLEDGE, SlimefunItems.FILLED_FLASK_OF_KNOWLEDGE, SlimefunItems.FILLED_FLASK_OF_KNOWLEDGE,
                SlimefunItems.FILLED_FLASK_OF_KNOWLEDGE, SlimefunItems.FILLED_FLASK_OF_KNOWLEDGE, SlimefunItems.FILLED_FLASK_OF_KNOWLEDGE,
                SlimefunItems.FILLED_FLASK_OF_KNOWLEDGE, SlimefunItems.FILLED_FLASK_OF_KNOWLEDGE, SlimefunItems.FILLED_FLASK_OF_KNOWLEDGE
        });

        SfUtils.registerNonPlaceableItem(Items.COMPRESSED_EXP_BLOCK_2, Items.IE_MISC_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                Items.COMPRESSED_EXP_BLOCK, Items.COMPRESSED_EXP_BLOCK, Items.COMPRESSED_EXP_BLOCK,
                Items.COMPRESSED_EXP_BLOCK, Items.COMPRESSED_EXP_BLOCK, Items.COMPRESSED_EXP_BLOCK,
                Items.COMPRESSED_EXP_BLOCK, Items.COMPRESSED_EXP_BLOCK, Items.COMPRESSED_EXP_BLOCK
        });

        SfUtils.registerItem(Items.EXP_CONVERTER, Items.IE_TOOLSANDWEAPONS_STUFF, RecipeType.MAGIC_WORKBENCH, new ItemStack[]{
                SlimefunItems.MAGICAL_GLASS, Items.COMPRESSED_EXP_BLOCK_2, SlimefunItems.MAGICAL_GLASS,
                SlimefunItems.ENDER_LUMP_3, Items.STONE_TANK, SlimefunItems.ENDER_LUMP_3,
                SlimefunItems.MAGICAL_GLASS, Items.COMPRESSED_EXP_BLOCK_2, SlimefunItems.MAGICAL_GLASS
        }, (ItemUseHandler) e -> {
            if (e.getHand() != EquipmentSlot.HAND) return;
            e.cancel();
            Player player = e.getPlayer();
            ItemStack item = e.getItem();
            ItemMeta im = item.getItemMeta();

            if (item.getAmount() != 1) {
                sendMessage(player, "§4请不要堆叠使用！");
                return;
            }

            if (player.isSneaking()) {
                if (item.getEnchantmentLevel(Enchantment.BINDING_CURSE) >= 1) {
                    int pre_level = im.getEnchantLevel(Enchantment.BINDING_CURSE);
                    player.setLevel(player.getLevel() + 1);
                    item.removeEnchantment(Enchantment.BINDING_CURSE);
                    item.addUnsafeEnchantment(Enchantment.BINDING_CURSE, pre_level-1);
                    im = item.getItemMeta();
                    im.setLore((Arrays.asList("§e右键存入一级", "§eShift+右键取出一级", "§6已存储: " + (pre_level-1) + "级")));
                    item.setItemMeta(im);
                }
            } else if (player.getLevel() > 1) {
                int pre_level = im.getEnchantLevel(Enchantment.BINDING_CURSE);
                if (pre_level >= 40) {
                    sendMessage(player, "§4存储已到达上限！");
                    return;
                }
                player.setLevel(player.getLevel() - 1);
                item.removeEnchantment(Enchantment.BINDING_CURSE);
                item.addUnsafeEnchantment(Enchantment.BINDING_CURSE, pre_level+1);
                im = item.getItemMeta();
                im.setLore((Arrays.asList("§e右键存入一级", "§eShift+右键取出一级", "§6已存储: " + (pre_level+1) + "级")));
                item.setItemMeta(im);
            }
        });

        new Drill(Items.IE_TOOLSANDWEAPONS_STUFF, Items.DURALUMIN_DRILL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.DURALUMIN_INGOT, SlimefunItems.DURALUMIN_INGOT, SlimefunItems.DURALUMIN_INGOT,
                Items.BASIC_COIL, SlimefunItems.SMALL_CAPACITOR, Items.BASIC_COIL,
                new ItemStack(Material.IRON_BLOCK), Items.WOFT, new ItemStack(Material.IRON_BLOCK)
        }, 200).register(SlimefunItemExpansion.getInstance());

        new Drill(Items.IE_TOOLSANDWEAPONS_STUFF, Items.SOLDER_DRILL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.SOLDER_INGOT, SlimefunItems.SOLDER_INGOT, SlimefunItems.SOLDER_INGOT,
                Items.BASIC_COIL, SlimefunItems.SMALL_CAPACITOR, Items.BASIC_COIL,
                new ItemStack(Material.IRON_BLOCK), Items.WOFT, new ItemStack(Material.IRON_BLOCK)
        }, 300).register(SlimefunItemExpansion.getInstance());

        new Drill(Items.IE_TOOLSANDWEAPONS_STUFF, Items.BILLON_DRILL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.BILLON_INGOT, SlimefunItems.BILLON_INGOT, SlimefunItems.BILLON_INGOT,
                Items.BASIC_COIL, SlimefunItems.SMALL_CAPACITOR, Items.BASIC_COIL,
                new ItemStack(Material.IRON_BLOCK), Items.WOFT, new ItemStack(Material.IRON_BLOCK)
        }, 400).register(SlimefunItemExpansion.getInstance());

        new Drill(Items.IE_TOOLSANDWEAPONS_STUFF, Items.STEEL_DRILL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.STEEL_INGOT, SlimefunItems.STEEL_INGOT, SlimefunItems.STEEL_INGOT,
                Items.BASIC_COIL, SlimefunItems.SMALL_CAPACITOR, Items.BASIC_COIL,
                new ItemStack(Material.IRON_BLOCK), Items.WOFT, new ItemStack(Material.IRON_BLOCK)
        }, 500).register(SlimefunItemExpansion.getInstance());

        new Drill(Items.IE_TOOLSANDWEAPONS_STUFF, Items.DAMASCUS_STEEL_DRILL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.DAMASCUS_STEEL_INGOT, SlimefunItems.DAMASCUS_STEEL_INGOT, SlimefunItems.DAMASCUS_STEEL_INGOT,
                Items.ADVANCED_COIL, SlimefunItems.SMALL_CAPACITOR, Items.ADVANCED_COIL,
                new ItemStack(Material.IRON_BLOCK), Items.WOFT, new ItemStack(Material.IRON_BLOCK)
        }, 600).register(SlimefunItemExpansion.getInstance());

        new Drill(Items.IE_TOOLSANDWEAPONS_STUFF, Items.REINFORCED_ALLOY_DRILL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.REINFORCED_ALLOY_INGOT,
                Items.ADVANCED_COIL, SlimefunItems.MEDIUM_CAPACITOR, Items.ADVANCED_COIL,
                new ItemStack(Material.IRON_BLOCK), Items.WOFT, new ItemStack(Material.IRON_BLOCK)
        }, 750).register(SlimefunItemExpansion.getInstance());

        new Drill(Items.IE_TOOLSANDWEAPONS_STUFF, Items.CARBONADO_DRILL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.CARBONADO, SlimefunItems.CARBONADO, SlimefunItems.CARBONADO,
                Items.ADVANCED_COIL, SlimefunItems.LARGE_CAPACITOR, Items.ADVANCED_COIL,
                new ItemStack(Material.IRON_BLOCK), Items.WOFT, new ItemStack(Material.IRON_BLOCK)
        }, 1000).register(SlimefunItemExpansion.getInstance());
    }
}
