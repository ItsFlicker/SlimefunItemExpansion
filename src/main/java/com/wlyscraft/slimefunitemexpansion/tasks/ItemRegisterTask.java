package com.wlyscraft.slimefunitemexpansion.tasks;

import com.wlyscraft.slimefunitemexpansion.items.IEItems;
import com.wlyscraft.slimefunitemexpansion.SlimefunItemExpansion;
import com.wlyscraft.slimefunitemexpansion.items.*;
import com.wlyscraft.slimefunitemexpansion.items.tools.*;
import com.wlyscraft.slimefunitemexpansion.items.weapons.*;
import com.wlyscraft.slimefunitemexpansion.machines.*;
import com.wlyscraft.slimefunitemexpansion.resources.OsmiumDust;
import com.wlyscraft.slimefunitemexpansion.utils.SfUtils;
import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.core.handlers.EntityInteractHandler;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import me.mrCookieSlime.Slimefun.cscorelib2.skull.SkullItem;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Arrays;
import java.util.Random;


public class ItemRegisterTask{
    public static void run() {
//      材料
        SfUtils.registerItem(IEItems.OSMIUM_INGOT, IEItems.IE_RESOURCE_STUFF, RecipeType.SMELTERY, new ItemStack[]{OsmiumDust.OSMIUM_DUST, null, null, null, null, null, null, null, null});
        SfUtils.addSmelteryRecipe(OsmiumDust.OSMIUM_DUST, IEItems.OSMIUM_INGOT);

        SfUtils.registerNonPlaceableItem(IEItems.WOODEN_GEAR, IEItems.IE_RESOURCE_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.OAK_PLANKS), new ItemStack(Material.STICK), new ItemStack(Material.OAK_PLANKS),
                new ItemStack(Material.STICK), null, new ItemStack(Material.STICK),
                new ItemStack(Material.OAK_PLANKS), new ItemStack(Material.STICK), new ItemStack(Material.OAK_PLANKS)});

        SfUtils.registerNonPlaceableItem(IEItems.COBBLESTONE_GEAR, IEItems.IE_RESOURCE_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                null, new ItemStack(Material.COBBLESTONE), null,
                new ItemStack(Material.COBBLESTONE), IEItems.WOODEN_GEAR, new ItemStack(Material.COBBLESTONE),
                null, new ItemStack(Material.COBBLESTONE), null});

        SfUtils.registerNonPlaceableItem(IEItems.IRON_GEAR, IEItems.IE_RESOURCE_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                null, new ItemStack(Material.IRON_INGOT), null,
                new ItemStack(Material.IRON_INGOT), IEItems.COBBLESTONE_GEAR, new ItemStack(Material.IRON_INGOT),
                null, new ItemStack(Material.IRON_INGOT), null});

        SfUtils.registerNonPlaceableItem(IEItems.STONE_TANK, IEItems.IE_RESOURCE_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.STONE), new ItemStack(Material.GLASS_PANE), new ItemStack(Material.STONE),
                new ItemStack(Material.GLASS_PANE), null,new ItemStack(Material.GLASS_PANE),
                new ItemStack(Material.STONE), new ItemStack(Material.GLASS_PANE), new ItemStack(Material.STONE)
        });

        SfUtils.registerNonPlaceableItem(IEItems.BASIC_COIL, IEItems.IE_RESOURCE_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                null, SlimefunItems.COPPER_WIRE, null,
                SlimefunItems.COPPER_WIRE, new ItemStack(Material.STICK), SlimefunItems.COPPER_WIRE,
                null, SlimefunItems.COPPER_WIRE, null
        });

        SfUtils.registerNonPlaceableItem(IEItems.ADVANCED_COIL, IEItems.IE_RESOURCE_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.GOLD_NUGGET),
                new ItemStack(Material.GOLD_NUGGET), IEItems.BASIC_COIL, new ItemStack(Material.GOLD_NUGGET),
                new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.GOLD_NUGGET)
        });

        SfUtils.registerItem(IEItems.ENHANCED_GLOWSTONE, IEItems.IE_RESOURCE_STUFF, AlloyFurnace.recipeType(),
                new ItemStack[]{IEItems.OSMIUM_INGOT, new ItemStack(Material.GLOWSTONE_DUST), null,
                        null, null, null,
                        null, null, null});

        SfUtils.registerItem(IEItems.ENHANCED_OBSIDIAN, IEItems.IE_RESOURCE_STUFF, AlloyFurnace.recipeType(), new ItemStack[]{
                new ItemStack(Material.OBSIDIAN), IEItems.COMPRESSED_EXP_BLOCK, null,
                null, null, null,
                null, null, null});

        SfUtils.registerItem(IEItems.OSGLOGLAS_INGOT, IEItems.IE_RESOURCE_STUFF, AlloyFurnace.recipeType(), new ItemStack[]{
                IEItems.ENHANCED_GLOWSTONE, IEItems.ENHANCED_OBSIDIAN, null,
                null, null, null,
                null, null, null});

        SfUtils.registerNonPlaceableItem(IEItems.BASIC_CONTROL_CIRCUIT, IEItems.IE_RESOURCE_STUFF, MetallurgicInfuser.recipeType(), new ItemStack[]{
                IEItems.OSMIUM_INGOT, new ItemStack(Material.REDSTONE), null,
                null, null, null,
                null, null, null});

        SfUtils.registerNonPlaceableItem(IEItems.ENRICHED_ALLOY, IEItems.IE_RESOURCE_STUFF, MetallurgicInfuser.recipeType(), new ItemStack[]{
                new ItemStack(Material.IRON_INGOT), new ItemStack(Material.REDSTONE), null,
                null, null, null,
                null, null, null});

        SfUtils.registerNonPlaceableItem(IEItems.ADVANCED_CONTROL_CIRCUIT, IEItems.IE_RESOURCE_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                IEItems.ENRICHED_ALLOY, IEItems.BASIC_CONTROL_CIRCUIT, IEItems.ENRICHED_ALLOY,
                IEItems.ADVANCED_COIL, SlimefunItems.BASIC_CIRCUIT_BOARD, IEItems.ADVANCED_COIL,
                IEItems.ENRICHED_ALLOY, IEItems.BASIC_CONTROL_CIRCUIT, IEItems.ENRICHED_ALLOY
        });

//      杂项
        SfUtils.registerItem(IEItems.WOFT, IEItems.IE_MISC_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
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


        new MouseTail(IEItems.IE_MISC_STUFF, IEItems.MOUSE_TAIL, RecipeType.MOB_DROP,
                new ItemStack[]{
                        null, null, null,
                        null, new CustomItem(SkullItem.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGE5MWRhYjgzOTFhZjVmZGE1NGFjZDJjMGIxOGZiZDgxOWI4NjVlMWE4ZjFkNjIzODEzZmE3NjFlOTI0NTQwIn19fQ=="), "§aSilverfish", "击杀蠹虫时有5%机率掉落"), null,
                        null, null, null}).register(SlimefunItemExpansion.getInstance());

        new HopeFlower(IEItems.IE_MISC_STUFF, IEItems.HOPE_FLOWER, RecipeType.MOB_DROP,
                new ItemStack[]{
                        null, null, null,
                        null, new CustomItem(SkullItem.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDFiODMwZWI0MDgyYWNlYzgzNmJjODM1ZTQwYTExMjgyYmI1MTE5MzMxNWY5MTE4NDMzN2U4ZDM1NTU1ODMifX19"), "§aVillager", "击杀村民时有5%机率掉落"), null,
                        null, null, null
                }).register(SlimefunItemExpansion.getInstance());


        SfUtils.registerNonPlaceableItem(IEItems.COMPRESSED_EXP_BLOCK, IEItems.IE_MISC_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.FILLED_FLASK_OF_KNOWLEDGE, SlimefunItems.FILLED_FLASK_OF_KNOWLEDGE, SlimefunItems.FILLED_FLASK_OF_KNOWLEDGE,
                SlimefunItems.FILLED_FLASK_OF_KNOWLEDGE, SlimefunItems.FILLED_FLASK_OF_KNOWLEDGE, SlimefunItems.FILLED_FLASK_OF_KNOWLEDGE,
                SlimefunItems.FILLED_FLASK_OF_KNOWLEDGE, SlimefunItems.FILLED_FLASK_OF_KNOWLEDGE, SlimefunItems.FILLED_FLASK_OF_KNOWLEDGE
        });

        SfUtils.registerNonPlaceableItem(IEItems.COMPRESSED_EXP_BLOCK_2, IEItems.IE_MISC_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                IEItems.COMPRESSED_EXP_BLOCK, IEItems.COMPRESSED_EXP_BLOCK, IEItems.COMPRESSED_EXP_BLOCK,
                IEItems.COMPRESSED_EXP_BLOCK, IEItems.COMPRESSED_EXP_BLOCK, IEItems.COMPRESSED_EXP_BLOCK,
                IEItems.COMPRESSED_EXP_BLOCK, IEItems.COMPRESSED_EXP_BLOCK, IEItems.COMPRESSED_EXP_BLOCK
        });

        SfUtils.registerItem(IEItems.EXP_CONVERTER, IEItems.IE_ATW_STUFF, RecipeType.MAGIC_WORKBENCH, new ItemStack[]{
                SlimefunItems.MAGICAL_GLASS, IEItems.COMPRESSED_EXP_BLOCK_2, SlimefunItems.MAGICAL_GLASS,
                SlimefunItems.ENDER_LUMP_3, IEItems.STONE_TANK, SlimefunItems.ENDER_LUMP_3,
                SlimefunItems.MAGICAL_GLASS, IEItems.COMPRESSED_EXP_BLOCK_2, SlimefunItems.MAGICAL_GLASS
        });

//      工具和武器装备
        SfUtils.registerItem(IEItems.LIGHTNING_WHIP, IEItems.IE_ATW_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                null, null, SlimefunItems.STAFF_STORM,
                null, new ItemStack(Material.COBWEB), null,
                SlimefunItems.STAFF_STORM, null, null
        });

        SfUtils.registerItem(IEItems.HUMAN_SADDLE, IEItems.IE_ATW_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.LEAD), null, new ItemStack(Material.LEAD),
                new ItemStack(Material.LEAD), new ItemStack(Material.SADDLE), new ItemStack(Material.LEAD),
                SlimefunItems.REINFORCED_PLATE, IEItems.WBP_BOOTS, SlimefunItems.REINFORCED_PLATE
        }, (EntityInteractHandler)(e, item, offhand) -> {
            if (offhand) return;
            e.setCancelled(true);
            Player player = e.getPlayer();
            if (e.getRightClicked() instanceof Player) {
                Player rc = (Player) e.getRightClicked();
                if (!rc.addPassenger(player)) {
                    SfUtils.sendActionBar(player, "§4由于某种原因，你不能骑上"+rc.getName()+"的头");
                    return;
                }
                SfUtils.sendActionBar(rc, "§b"+player.getName()+"骑上了你的头!使用/sfie rp强制使ta下头");
            }
        });

        SfUtils.registerNonPlaceableItem(IEItems.SPEED_TORCH, IEItems.IE_ATW_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.RABBIT_FOOT), IEItems.WOFT, new ItemStack(Material.RABBIT_FOOT),
                SlimefunItems.ENDER_RUNE, new ItemStack(Material.SOUL_TORCH), SlimefunItems.ENDER_RUNE,
                new ItemStack(Material.RABBIT_FOOT), IEItems.WOFT, new ItemStack(Material.RABBIT_FOOT)
        });

        new Drill(IEItems.IE_ATW_STUFF, IEItems.DURALUMIN_DRILL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.DURALUMIN_INGOT, SlimefunItems.DURALUMIN_INGOT, SlimefunItems.DURALUMIN_INGOT,
                IEItems.BASIC_CONTROL_CIRCUIT, SlimefunItems.SMALL_CAPACITOR, IEItems.BASIC_CONTROL_CIRCUIT,
                new ItemStack(Material.IRON_BLOCK), IEItems.WOFT, new ItemStack(Material.IRON_BLOCK)
        }, 200).register(SlimefunItemExpansion.getInstance());

        new Drill(IEItems.IE_ATW_STUFF, IEItems.SOLDER_DRILL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.SOLDER_INGOT, SlimefunItems.SOLDER_INGOT, SlimefunItems.SOLDER_INGOT,
                IEItems.BASIC_CONTROL_CIRCUIT, SlimefunItems.SMALL_CAPACITOR, IEItems.BASIC_CONTROL_CIRCUIT,
                new ItemStack(Material.IRON_BLOCK), IEItems.WOFT, new ItemStack(Material.IRON_BLOCK)
        }, 300).register(SlimefunItemExpansion.getInstance());

        new Drill(IEItems.IE_ATW_STUFF, IEItems.BILLON_DRILL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.BILLON_INGOT, SlimefunItems.BILLON_INGOT, SlimefunItems.BILLON_INGOT,
                IEItems.BASIC_CONTROL_CIRCUIT, SlimefunItems.SMALL_CAPACITOR, IEItems.BASIC_CONTROL_CIRCUIT,
                new ItemStack(Material.IRON_BLOCK), IEItems.WOFT, new ItemStack(Material.IRON_BLOCK)
        }, 400).register(SlimefunItemExpansion.getInstance());

        new Drill(IEItems.IE_ATW_STUFF, IEItems.STEEL_DRILL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.STEEL_INGOT, SlimefunItems.STEEL_INGOT, SlimefunItems.STEEL_INGOT,
                IEItems.BASIC_CONTROL_CIRCUIT, SlimefunItems.SMALL_CAPACITOR, IEItems.BASIC_CONTROL_CIRCUIT,
                new ItemStack(Material.IRON_BLOCK), IEItems.WOFT, new ItemStack(Material.IRON_BLOCK)
        }, 500).register(SlimefunItemExpansion.getInstance());

        new Drill(IEItems.IE_ATW_STUFF, IEItems.DAMASCUS_STEEL_DRILL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.DAMASCUS_STEEL_INGOT, SlimefunItems.DAMASCUS_STEEL_INGOT, SlimefunItems.DAMASCUS_STEEL_INGOT,
                IEItems.ADVANCED_CONTROL_CIRCUIT, SlimefunItems.SMALL_CAPACITOR, IEItems.ADVANCED_CONTROL_CIRCUIT,
                new ItemStack(Material.IRON_BLOCK), IEItems.WOFT, new ItemStack(Material.IRON_BLOCK)
        }, 600).register(SlimefunItemExpansion.getInstance());

        new Drill(IEItems.IE_ATW_STUFF, IEItems.REINFORCED_ALLOY_DRILL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.REINFORCED_ALLOY_INGOT,
                IEItems.ADVANCED_CONTROL_CIRCUIT, SlimefunItems.MEDIUM_CAPACITOR, IEItems.ADVANCED_CONTROL_CIRCUIT,
                new ItemStack(Material.IRON_BLOCK), IEItems.WOFT, new ItemStack(Material.IRON_BLOCK)
        }, 750).register(SlimefunItemExpansion.getInstance());

        new Drill(IEItems.IE_ATW_STUFF, IEItems.CARBONADO_DRILL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.CARBONADO, SlimefunItems.CARBONADO, SlimefunItems.CARBONADO,
                IEItems.ADVANCED_CONTROL_CIRCUIT, SlimefunItems.LARGE_CAPACITOR, IEItems.ADVANCED_CONTROL_CIRCUIT,
                new ItemStack(Material.IRON_BLOCK), IEItems.REINFORCED_ALLOY_DRILL, new ItemStack(Material.IRON_BLOCK)
        }, 2000).register(SlimefunItemExpansion.getInstance());

        new LightningBow(IEItems.IE_ATW_STUFF, IEItems.LIGHTNING_BOW, new ItemStack[]{
                null, new ItemStack(Material.STICK), SlimefunItems.AIR_RUNE,
                IEItems.LIGHTNING_WHIP, null, SlimefunItems.AIR_RUNE,
                null, new ItemStack(Material.STICK), SlimefunItems.AIR_RUNE
        }).register(SlimefunItemExpansion.getInstance());

        new ElectricCrossbow(IEItems.IE_ATW_STUFF, IEItems.ELECTRIC_CROSSBOW, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                IEItems.OSGLOGLAS_INGOT, SlimefunItems.REINFORCED_PLATE, IEItems.OSGLOGLAS_INGOT,
                IEItems.ADVANCED_CONTROL_CIRCUIT, SlimefunItems.LARGE_CAPACITOR, IEItems.ADVANCED_CONTROL_CIRCUIT,
                null, IEItems.OSGLOGLAS_INGOT, null
        }, 1000).register(SlimefunItemExpansion.getInstance());

        SfUtils.registerItem(IEItems.ANDURIL, IEItems.IE_ATW_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.AIR_RUNE, SlimefunItems.HARDENED_METAL_INGOT, SlimefunItems.AIR_RUNE,
                SlimefunItems.AIR_RUNE, SlimefunItems.HARDENED_METAL_INGOT, SlimefunItems.AIR_RUNE,
                SlimefunItems.AIR_RUNE, new ItemStack(Material.BLAZE_ROD), SlimefunItems.AIR_RUNE
        });

        SfUtils.registerItem(IEItems.WBP_BOOTS, IEItems.IE_ATW_STUFF, RecipeType.ARMOR_FORGE, new ItemStack[]{
                null, null, null,
                new ItemStack(Material.SCUTE), null, new ItemStack(Material.SCUTE),
                new ItemStack(Material.SCUTE), null, new ItemStack(Material.SCUTE)
        });

        new SlimechunkChecker(IEItems.IE_ATW_STUFF, IEItems.SLIMECHUNK_CHECKER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.GPS_TRANSMITTER, null, SlimefunItems.GPS_TRANSMITTER,
                new ItemStack(Material.SLIME_BLOCK), IEItems.ADVANCED_CONTROL_CIRCUIT, new ItemStack(Material.SLIME_BLOCK),
                new ItemStack(Material.SLIME_BLOCK), new ItemStack(Material.LEVER), new ItemStack(Material.SLIME_BLOCK)
        }, 500).register(SlimefunItemExpansion.getInstance());

        SfUtils.registerItem(IEItems.REINFORCED_SHIELD, IEItems.IE_ATW_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                IEItems.OSGLOGLAS_INGOT, SlimefunItems.REINFORCED_PLATE, IEItems.OSGLOGLAS_INGOT,
                IEItems.OSGLOGLAS_INGOT, IEItems.OSGLOGLAS_INGOT, IEItems.OSGLOGLAS_INGOT,
                null, IEItems.OSGLOGLAS_INGOT, null
        });

        new ElectricCutter(IEItems.IE_ATW_STUFF, IEItems.ELECTRIC_CUTTER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.DAMASCUS_STEEL_INGOT, IEItems.DAMASCUS_STEEL_DRILL, SlimefunItems.DAMASCUS_STEEL_INGOT,
                new ItemStack(Material.IRON_SWORD), SlimefunItems.SMALL_CAPACITOR, new ItemStack(Material.IRON_SWORD),
                null, new ItemStack(Material.TRIDENT), null
        }, 128).register(SlimefunItemExpansion.getInstance());

        SfUtils.registerItem(IEItems.SPLASH_XSLF, IEItems.IE_ATW_STUFF, RecipeType.NULL, new ItemStack[]{});

//      食物
        SfUtils.registerItem(IEItems.MOUSE_TAIL_JUICE, IEItems.IE_FOOD_STUFF, RecipeType.JUICER, new ItemStack[]{
                IEItems.MOUSE_TAIL, null, null,
                null, null, null,
                null, null, null
        }, (ItemUseHandler) e -> {
            if (e.getHand() != EquipmentSlot.HAND) return;
            Random r = new Random();
            Player player = e.getPlayer();
            player.getInventory().setItemInMainHand(null);
            int num = r.nextInt(100);
            if (num <= 29) {
                SfUtils.sendMessage(player, "§g你大E了!这汁有里毒!");
                player.addPotionEffects(Arrays.asList(new PotionEffect(PotionEffectType.POISON, 20 * 5, 5),
                        new PotionEffect(PotionEffectType.CONFUSION, 20*10, 0)));
            }
            else if (num <= 59) {
                SfUtils.sendMessage(player, "§g你感觉你现在非常能\"闪\"!");
                player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20 * 60, 4));
            }
            else SfUtils.sendMessage(player, "§g淡而无味...");
        });

        SfUtils.registerItem(IEItems.WJZ_RICE, IEItems.IE_FOOD_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
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

        SfUtils.registerItem(IEItems.XIONG_SHI_LAO_FANG, IEItems.IE_FOOD_STUFF, RecipeType.JUICER, new ItemStack[]{
                new ItemStack(Material.GRASS), new ItemStack(Material.FERN), new ItemStack(Material.DEAD_BUSH),
                new ItemStack(Material.SEAGRASS), new ItemStack(Material.WITHER_ROSE), new ItemStack(Material.WARPED_ROOTS),
                new ItemStack(Material.TWISTING_VINES), new ItemStack(Material.WEEPING_VINES), new ItemStack(Material.CRIMSON_ROOTS)
        });

//      机械
        SfUtils.registerNonPlaceableItem(IEItems.MACHINE_BLOCK, IEItems.IE_MACHINES_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.STEEL_INGOT, IEItems.OSMIUM_INGOT, SlimefunItems.STEEL_INGOT,
                IEItems.IRON_GEAR, new ItemStack(Material.GLASS), IEItems.IRON_GEAR,
                SlimefunItems.STEEL_INGOT, IEItems.OSMIUM_INGOT, SlimefunItems.STEEL_INGOT});


        if (Bukkit.getServer().getPluginManager().getPlugin("Flicker") != null) {
            SfUtils.registerNonPlaceableItem(IEItems.SHIT, IEItems.IE_FOOD_STUFF, RecipeType.NULL, new ItemStack[]{});

            SfUtils.registerItem(IEItems.JIN_KE_LA, IEItems.IE_MISC_STUFF, RecipeType.NULL, new ItemStack[]{
//                new ItemStack(Material.BONE_MEAL), new ItemStack(Material.BONE_MEAL), new ItemStack(Material.BONE_MEAL),
//                new ItemStack(Material.BONE_MEAL), new ItemStack(Material.GOLD_INGOT), new ItemStack(Material.BONE_MEAL),
//                new ItemStack(Material.BONE_MEAL), new ItemStack(Material.BONE_MEAL), new ItemStack(Material.BONE_MEAL)
            });

            SfUtils.registerNonPlaceableItem(IEItems.GROW_CORE, IEItems.IE_RESOURCE_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                    new ItemStack(Material.GRASS_BLOCK), IEItems.OSGLOGLAS_INGOT, new ItemStack(Material.GRASS_BLOCK),
                    SlimefunItems.POWER_CRYSTAL, IEItems.MACHINE_BLOCK, SlimefunItems.POWER_CRYSTAL,
                    new ItemStack(Material.DIRT), IEItems.ADVANCED_CONTROL_CIRCUIT, new ItemStack(Material.DIRT)
            });

            SfUtils.registerItem(IEItems.ORIGINAL_MOB_MATERIAL, IEItems.IE_RESOURCE_STUFF, RecipeType.NULL, new ItemStack[]{},
                    (ItemUseHandler) PlayerRightClickEvent::cancel);

            SfUtils.registerItem(IEItems.VILLAGER_BOOK, IEItems.IE_RESOURCE_STUFF, RecipeType.ANCIENT_ALTAR, new ItemStack[]{
                    new ItemStack(Material.GRASS), SlimefunItems.FILLED_FLASK_OF_KNOWLEDGE, new ItemStack(Material.GRASS),
                    SlimefunItems.FILLED_FLASK_OF_KNOWLEDGE, new ItemStack(Material.BOOK), SlimefunItems.FILLED_FLASK_OF_KNOWLEDGE,
                    new ItemStack(Material.GRASS), SlimefunItems.FILLED_FLASK_OF_KNOWLEDGE, new ItemStack(Material.GRASS)
            });

            SfUtils.registerNonPlaceableItem(IEItems.MEMORY_128B, IEItems.IE_MISC_STUFF, RecipeType.NULL, new ItemStack[]{

            });

            SfUtils.registerNonPlaceableItem(IEItems.CPU, IEItems.IE_MISC_STUFF, RecipeType.NULL, new ItemStack[]{

            });

            SfUtils.registerNonPlaceableItem(IEItems.CAMERA_13, IEItems.IE_MISC_STUFF, RecipeType.NULL, new ItemStack[]{

            });

            SfUtils.registerNonPlaceableItem(IEItems.COBWEB_SCREEN, IEItems.IE_MISC_STUFF, RecipeType.NULL, new ItemStack[]{

            });

            SfUtils.registerNonPlaceableItem(IEItems.T_8848, IEItems.IE_ATW_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                    new ItemStack(Material.LEATHER), IEItems.OSGLOGLAS_INGOT, IEItems.CAMERA_13,
                    new ItemStack(Material.LEATHER), IEItems.COBWEB_SCREEN, IEItems.MEMORY_128B,
                    IEItems.CPU, IEItems.OSGLOGLAS_INGOT,
            });

            SfUtils.registerItemUsedToCraft(IEItems.MANMADE_DRAGON_BREATH, IEItems.IE_RESOURCE_STUFF, RecipeType.ANCIENT_ALTAR, new ItemStack[]{
                    SlimefunItems.MAGICAL_GLASS, SlimefunItems.ENDER_RUNE,SlimefunItems.MAGICAL_GLASS,
                    SlimefunItems.ENDER_RUNE, SlimefunItems.STRANGE_NETHER_GOO,SlimefunItems.ENDER_RUNE,
                    SlimefunItems.MAGICAL_GLASS, SlimefunItems.ENDER_RUNE,SlimefunItems.MAGICAL_GLASS
            });
        }
    }
}
