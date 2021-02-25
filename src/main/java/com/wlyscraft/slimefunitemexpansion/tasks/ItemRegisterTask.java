package com.wlyscraft.slimefunitemexpansion.tasks;

import com.wlyscraft.slimefunitemexpansion.EXPDataType;
import com.wlyscraft.slimefunitemexpansion.items.LightningBow;
import com.wlyscraft.slimefunitemexpansion.items.Drill;
import com.wlyscraft.slimefunitemexpansion.Items;
import com.wlyscraft.slimefunitemexpansion.items.ElectricCrossbow;
import com.wlyscraft.slimefunitemexpansion.items.HopeFlower;
import com.wlyscraft.slimefunitemexpansion.items.MouseTail;
import com.wlyscraft.slimefunitemexpansion.SlimefunItemExpansion;
import com.wlyscraft.slimefunitemexpansion.machines.AlloyFurnace;
import com.wlyscraft.slimefunitemexpansion.machines.MetallurgicInfuser;
import com.wlyscraft.slimefunitemexpansion.utils.SfUtils;
import io.github.thebusybiscuit.slimefun4.core.handlers.EntityInteractHandler;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import me.mrCookieSlime.Slimefun.cscorelib2.skull.SkullItem;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Arrays;
import java.util.Random;


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
            player.getLocation().getWorld().createExplosion(player.getLocation(), 1F, false, false);
            player.getLocation().getWorld().dropItem(player.getLocation(), new ItemStack(Material.ENDER_PEARL, 2));
            player.getLocation().getWorld().dropItem(player.getLocation(), new ItemStack(Material.DIAMOND, 1));
            player.getLocation().getWorld().dropItem(player.getLocation(), new ItemStack(Material.GOLD_INGOT, 1));
            SfUtils.sendMessage(player, "§4由于你错误的使用方式，时间洪流怀表爆炸了！");
            SfUtils.sendMessage(player, "§e幸运的是，时间洪流怀表的部分材料没有被炸坏...");
            SfUtils.sendMessage(player, "§2你应该先看看教程再来使用的：https://www.bilibili.com/video/BV1GJ411x7h7");
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
                        null, new CustomItem(SkullItem.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGE5MWRhYjgzOTFhZjVmZGE1NGFjZDJjMGIxOGZiZDgxOWI4NjVlMWE4ZjFkNjIzODEzZmE3NjFlOTI0NTQwIn19fQ=="), "§aSilverfish", "击杀蠹虫时有5%机率掉落"), null,
                        null, null, null}).register(SlimefunItemExpansion.getInstance());

        new HopeFlower(Items.IE_MISC_STUFF, Items.HOPE_FLOWER, RecipeType.MOB_DROP,
                new ItemStack[]{
                        null, null, null,
                        null, new CustomItem(Material.PLAYER_HEAD, "§aPlayer"), null,
                        null, null, null
                }).register(SlimefunItemExpansion.getInstance());

        SfUtils.registerItem(Items.MOUSE_TAIL_JUICE, Items.IE_FOOD_STUFF, RecipeType.JUICER, new ItemStack[]{
                Items.MOUSE_TAIL, null, null,
                null, null, null,
                null, null, null
        }, (ItemUseHandler) e -> {
            if (e.getHand() != EquipmentSlot.HAND) return;
            Random r = new Random();
            Player player = e.getPlayer();
            player.getInventory().setItemInMainHand(null);
            int num = r.nextInt(100);
            if (num <= 24) {
                SfUtils.sendMessage(player, "§g你大E了!这汁有里毒!");
                player.addPotionEffects(Arrays.asList(new PotionEffect(PotionEffectType.POISON, 20 * 5, 4),
                        new PotionEffect(PotionEffectType.CONFUSION, 20*10, 0)));
            }
            else if (num <= 49) {
                SfUtils.sendMessage(player, "§g你感觉你现在非常能\"闪\"!");
                player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 90, 4));
            }
            else SfUtils.sendMessage(player, "§g淡而无味...");
        });

        SfUtils.registerItem(Items.LIGHTNING_WHIP, Items.IE_ATW_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                null, null, SlimefunItems.STAFF_STORM,
                null, new ItemStack(Material.COBWEB), null,
                SlimefunItems.STAFF_STORM, null, null
        });

        SfUtils.registerItem(Items.HUMAN_SADDLE, Items.IE_ATW_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.LEAD), null, new ItemStack(Material.LEAD),
                new ItemStack(Material.LEAD), new ItemStack(Material.SADDLE), new ItemStack(Material.LEAD),
                SlimefunItems.REINFORCED_PLATE, Items.WBP_BOOTS, SlimefunItems.REINFORCED_PLATE
        }, (EntityInteractHandler)(e, item, offhand) -> {
            if (offhand) return;
            e.setCancelled(true);
            Player player = e.getPlayer();
            if (e.getRightClicked() instanceof Player) {
                Player rc = (Player) e.getRightClicked();
                if (!rc.addPassenger(player)) {
                    SfUtils.sendMessage(player, "§4由于某种原因，你不能骑上"+rc.getName()+"的头");
                    return;
                }
                SfUtils.sendMessage(rc, "§b"+player.getName()+"骑上了你的头!使用/sfie rp强制使ta下头");
            }
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

        SfUtils.registerNonPlaceableItem(Items.SPEED_TORCH, Items.IE_ATW_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.RABBIT_FOOT), Items.WOFT, new ItemStack(Material.RABBIT_FOOT),
                SlimefunItems.ENDER_RUNE, new ItemStack(Material.SOUL_TORCH), SlimefunItems.ENDER_RUNE,
                new ItemStack(Material.RABBIT_FOOT), Items.WOFT, new ItemStack(Material.RABBIT_FOOT)
        });

        SfUtils.registerItem(Items.WBP_BOOTS, Items.IE_ATW_STUFF, RecipeType.ARMOR_FORGE, new ItemStack[]{
                null, null, null,
                new ItemStack(Material.SCUTE), null, new ItemStack(Material.SCUTE),
                new ItemStack(Material.SCUTE), null, new ItemStack(Material.SCUTE)
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

//        SfUtils.registerItem(Items.EXP_CONVERTER, Items.IE_ATW_STUFF, RecipeType.MAGIC_WORKBENCH, new ItemStack[]{
//                SlimefunItems.MAGICAL_GLASS, Items.COMPRESSED_EXP_BLOCK_2, SlimefunItems.MAGICAL_GLASS,
//                SlimefunItems.ENDER_LUMP_3, Items.STONE_TANK, SlimefunItems.ENDER_LUMP_3,
//                SlimefunItems.MAGICAL_GLASS, Items.COMPRESSED_EXP_BLOCK_2, SlimefunItems.MAGICAL_GLASS
//        }, (ItemUseHandler) e -> {
//            if (e.getHand() != EquipmentSlot.HAND) return;
//            e.cancel();
//            Player player = e.getPlayer();
//            ItemStack item = e.getItem();
//
//            if (item.getAmount() != 1) {
//                SfUtils.sendMessage(player, "§4请不要堆叠使用！");
//                return;
//            }
//
//            ItemMeta im = item.getItemMeta();
//            int playerlevel = player.getLevel();
//            int preplayertotalexp;
//            int level30_totalexp = (int) (Math.pow(30, 2)*2.5-40.5*30+360);
//
//            if (player.isSneaking()) {
//                PersistentDataContainer container = im.getPersistentDataContainer();
//                EXPDataType.EXP get = container.get(new NamespacedKey(SlimefunItemExpansion.getInstance(), "ecExp"), EXPDataType.instance);
//                assert get != null;
//                if (get.level >= 1) {
//
//                    item.setItemMeta(im);
//                }
//            } else if (playerlevel >= 1) {
//                if (playerlevel <= 16) preplayertotalexp = (int) (Math.pow(playerlevel, 2) + 6 * playerlevel);
//                else if (playerlevel <= 31) preplayertotalexp = (int) (Math.pow(playerlevel, 2) * 2.5 - 40.5 * playerlevel +360);
//                else preplayertotalexp = (int) (Math.pow(playerlevel, 2) * 4.5 - 162.5 * playerlevel + 2220);
//                if (playerlevel >= 30)
//
//                item.setItemMeta(im);
//            }
//        });

        new Drill(Items.IE_ATW_STUFF, Items.DURALUMIN_DRILL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.DURALUMIN_INGOT, SlimefunItems.DURALUMIN_INGOT, SlimefunItems.DURALUMIN_INGOT,
                Items.BASIC_CONTROL_CIRCUIT, SlimefunItems.SMALL_CAPACITOR, Items.BASIC_CONTROL_CIRCUIT,
                new ItemStack(Material.IRON_BLOCK), Items.WOFT, new ItemStack(Material.IRON_BLOCK)
        }, 200).register(SlimefunItemExpansion.getInstance());

        new Drill(Items.IE_ATW_STUFF, Items.SOLDER_DRILL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.SOLDER_INGOT, SlimefunItems.SOLDER_INGOT, SlimefunItems.SOLDER_INGOT,
                Items.BASIC_CONTROL_CIRCUIT, SlimefunItems.SMALL_CAPACITOR, Items.BASIC_CONTROL_CIRCUIT,
                new ItemStack(Material.IRON_BLOCK), Items.WOFT, new ItemStack(Material.IRON_BLOCK)
        }, 300).register(SlimefunItemExpansion.getInstance());

        new Drill(Items.IE_ATW_STUFF, Items.BILLON_DRILL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.BILLON_INGOT, SlimefunItems.BILLON_INGOT, SlimefunItems.BILLON_INGOT,
                Items.BASIC_CONTROL_CIRCUIT, SlimefunItems.SMALL_CAPACITOR, Items.BASIC_CONTROL_CIRCUIT,
                new ItemStack(Material.IRON_BLOCK), Items.WOFT, new ItemStack(Material.IRON_BLOCK)
        }, 400).register(SlimefunItemExpansion.getInstance());

        new Drill(Items.IE_ATW_STUFF, Items.STEEL_DRILL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.STEEL_INGOT, SlimefunItems.STEEL_INGOT, SlimefunItems.STEEL_INGOT,
                Items.BASIC_CONTROL_CIRCUIT, SlimefunItems.SMALL_CAPACITOR, Items.BASIC_CONTROL_CIRCUIT,
                new ItemStack(Material.IRON_BLOCK), Items.WOFT, new ItemStack(Material.IRON_BLOCK)
        }, 500).register(SlimefunItemExpansion.getInstance());

        new Drill(Items.IE_ATW_STUFF, Items.DAMASCUS_STEEL_DRILL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.DAMASCUS_STEEL_INGOT, SlimefunItems.DAMASCUS_STEEL_INGOT, SlimefunItems.DAMASCUS_STEEL_INGOT,
                Items.ADVANCED_CONTROL_CIRCUIT, SlimefunItems.SMALL_CAPACITOR, Items.ADVANCED_CONTROL_CIRCUIT,
                new ItemStack(Material.IRON_BLOCK), Items.WOFT, new ItemStack(Material.IRON_BLOCK)
        }, 600).register(SlimefunItemExpansion.getInstance());

        new Drill(Items.IE_ATW_STUFF, Items.REINFORCED_ALLOY_DRILL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.REINFORCED_ALLOY_INGOT,
                Items.ADVANCED_CONTROL_CIRCUIT, SlimefunItems.MEDIUM_CAPACITOR, Items.ADVANCED_CONTROL_CIRCUIT,
                new ItemStack(Material.IRON_BLOCK), Items.WOFT, new ItemStack(Material.IRON_BLOCK)
        }, 750).register(SlimefunItemExpansion.getInstance());

        new Drill(Items.IE_ATW_STUFF, Items.CARBONADO_DRILL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.CARBONADO, SlimefunItems.CARBONADO, SlimefunItems.CARBONADO,
                Items.ADVANCED_CONTROL_CIRCUIT, SlimefunItems.LARGE_CAPACITOR, Items.ADVANCED_CONTROL_CIRCUIT,
                new ItemStack(Material.IRON_BLOCK), Items.WOFT, new ItemStack(Material.IRON_BLOCK)
        }, 1000).register(SlimefunItemExpansion.getInstance());

        new LightningBow(Items.IE_ATW_STUFF, Items.LIGHTNING_BOW, new ItemStack[]{
                null, new ItemStack(Material.STICK), SlimefunItems.AIR_RUNE,
                Items.LIGHTNING_WHIP, null, SlimefunItems.AIR_RUNE,
                null, new ItemStack(Material.STICK), SlimefunItems.AIR_RUNE
        }).register(SlimefunItemExpansion.getInstance());

        new ElectricCrossbow(Items.IE_ATW_STUFF, Items.ELECTRIC_CROSSBOW, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                Items.OSGLOGLAS_INGOT, SlimefunItems.REINFORCED_PLATE, Items.OSGLOGLAS_INGOT,
                Items.ADVANCED_CONTROL_CIRCUIT, SlimefunItems.LARGE_CAPACITOR, Items.ADVANCED_CONTROL_CIRCUIT,
                null, Items.OSGLOGLAS_INGOT, null
        }, 1000).register(SlimefunItemExpansion.getInstance());

        SfUtils.registerItem(Items.ANDURIL, Items.IE_ATW_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.AIR_RUNE, SlimefunItems.HARDENED_METAL_INGOT, SlimefunItems.AIR_RUNE,
                SlimefunItems.AIR_RUNE, SlimefunItems.HARDENED_METAL_INGOT, SlimefunItems.AIR_RUNE,
                SlimefunItems.AIR_RUNE, new ItemStack(Material.BLAZE_ROD), SlimefunItems.AIR_RUNE
        });

//        SfUtils.registerNonPlaceableItem(Items.SHIT, Items.IE_FOOD_STUFF, RecipeType.NULL, new ItemStack[]{});
        SfUtils.registerItem(Items.WJZ_RICE, Items.IE_FOOD_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                null, new ItemStack(Material.WHEAT), null,
                null, new ItemStack(Material.WHEAT), null,
                null, new ItemStack(Material.BOWL), null
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
            player.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 3, 0));
            player.chat("真香~");
            player.getWorld().dropItem(player.getLocation(), new ItemStack(Material.BOWL));
        });

        SfUtils.registerItem(Items.ENHANCED_GLOWSTONE, Items.IE_MISC_STUFF, AlloyFurnace.recipeType(),
                new ItemStack[]{Items.OSMIUM_INGOT, new ItemStack(Material.GLOWSTONE_DUST), null,
                null, null, null,
                null, null, null});

        SfUtils.registerItem(Items.ENHANCED_OBSIDIAN, Items.IE_MISC_STUFF, AlloyFurnace.recipeType(), new ItemStack[]{
                new ItemStack(Material.OBSIDIAN), SlimefunItems.HARDENED_GLASS, null,
                null, null, null,
                null, null, null});

        SfUtils.registerItem(Items.OSGLOGLAS_INGOT, Items.IE_MISC_STUFF, AlloyFurnace.recipeType(), new ItemStack[]{
                Items.ENHANCED_GLOWSTONE, Items.ENHANCED_OBSIDIAN, null,
                null, null, null,
                null, null, null});

        SfUtils.registerNonPlaceableItem(Items.BASIC_CONTROL_CIRCUIT, Items.IE_MISC_STUFF, MetallurgicInfuser.recipeType(), new ItemStack[]{
                Items.OSMIUM_INGOT, new ItemStack(Material.REDSTONE), null,
                null, null, null,
                null, null, null});

        SfUtils.registerNonPlaceableItem(Items.ENRICHED_ALLOY, Items.IE_MISC_STUFF, MetallurgicInfuser.recipeType(), new ItemStack[]{
                new ItemStack(Material.IRON_INGOT), new ItemStack(Material.REDSTONE), null,
                null, null, null,
                null, null, null});

        SfUtils.registerNonPlaceableItem(Items.ADVANCED_CONTROL_CIRCUIT, Items.IE_MISC_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                Items.ENRICHED_ALLOY, Items.BASIC_CONTROL_CIRCUIT, Items.ENRICHED_ALLOY,
                Items.ADVANCED_COIL, SlimefunItems.BASIC_CIRCUIT_BOARD, Items.ADVANCED_COIL,
                Items.ENRICHED_ALLOY, Items.BASIC_CONTROL_CIRCUIT, Items.ENRICHED_ALLOY
        });

        SfUtils.registerItem(Items.MANMADE_DRAGON_BREATH, Items.IE_MISC_STUFF, RecipeType.ANCIENT_ALTAR, new ItemStack[]{
                SlimefunItems.MAGICAL_GLASS, SlimefunItems.ENDER_RUNE,SlimefunItems.MAGICAL_GLASS,
                SlimefunItems.ENDER_RUNE, SlimefunItems.STRANGE_NETHER_GOO,SlimefunItems.ENDER_RUNE,
                SlimefunItems.MAGICAL_GLASS, SlimefunItems.ENDER_RUNE,SlimefunItems.MAGICAL_GLASS
        });

        SfUtils.registerItem(Items.XIONG_SHI_LAO_FANG, Items.IE_FOOD_STUFF, RecipeType.JUICER, new ItemStack[]{
                new ItemStack(Material.GRASS), new ItemStack(Material.FERN), new ItemStack(Material.DEAD_BUSH),
                new ItemStack(Material.SEAGRASS), new ItemStack(Material.WITHER_ROSE), new ItemStack(Material.WARPED_ROOTS),
                new ItemStack(Material.TWISTING_VINES), new ItemStack(Material.WEEPING_VINES), new ItemStack(Material.CRIMSON_ROOTS)
        });

        SfUtils.registerItem(Items.SPLASH_XSLF, Items.IE_ATW_STUFF, RecipeType.NULL, new ItemStack[]{

        });

        SfUtils.registerNonPlaceableItem(Items.MEMORY_128B, Items.IE_MISC_STUFF, RecipeType.NULL, new ItemStack[]{

        });

        SfUtils.registerNonPlaceableItem(Items.CPU, Items.IE_MISC_STUFF, RecipeType.NULL, new ItemStack[]{

        });

        SfUtils.registerNonPlaceableItem(Items.CAMERA_13, Items.IE_MISC_STUFF, RecipeType.NULL, new ItemStack[]{

        });

        SfUtils.registerNonPlaceableItem(Items.COBWEB_SCREEN, Items.IE_MISC_STUFF, RecipeType.NULL, new ItemStack[]{

        });

        SfUtils.registerNonPlaceableItem(Items.T_8848, Items.IE_ATW_STUFF, RecipeType.NULL, new ItemStack[]{

        });
    }
}
