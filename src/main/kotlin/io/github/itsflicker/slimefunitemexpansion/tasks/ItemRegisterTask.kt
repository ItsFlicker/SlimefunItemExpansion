package io.github.itsflicker.slimefunitemexpansion.tasks

import io.github.itsflicker.slimefunitemexpansion.SlimefunItemExpansion
import io.github.itsflicker.slimefunitemexpansion.items.HopeFlower
import io.github.itsflicker.slimefunitemexpansion.items.IEItems
import io.github.itsflicker.slimefunitemexpansion.items.MouseTail
import io.github.itsflicker.slimefunitemexpansion.items.machines.AlloyFurnace
import io.github.itsflicker.slimefunitemexpansion.items.machines.MetallurgicInfuser
import io.github.itsflicker.slimefunitemexpansion.items.resources.OsmiumDust
import io.github.itsflicker.slimefunitemexpansion.items.tools.Drill
import io.github.itsflicker.slimefunitemexpansion.items.tools.ElectricCutter
import io.github.itsflicker.slimefunitemexpansion.items.tools.SlimechunkChecker
import io.github.itsflicker.slimefunitemexpansion.items.weapons.ElectricCrossbow
import io.github.itsflicker.slimefunitemexpansion.items.weapons.LightningBow
import io.github.itsflicker.slimefunitemexpansion.util.addSmelteryRecipe
import io.github.itsflicker.slimefunitemexpansion.util.regItem
import io.github.itsflicker.slimefunitemexpansion.util.regNonPlaceableItem
import io.github.itsflicker.slimefunitemexpansion.util.regUsableInWorkbenchItem
import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent
import io.github.thebusybiscuit.slimefun4.core.handlers.EntityInteractHandler
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems
import me.mrCookieSlime.Slimefun.Lists.RecipeType
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem
import me.mrCookieSlime.Slimefun.cscorelib2.skull.SkullItem
import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.inventory.EquipmentSlot
import org.bukkit.inventory.ItemStack
import org.bukkit.potion.PotionEffect
import org.bukkit.potion.PotionEffectType
import taboolib.common.util.random
import taboolib.platform.util.sendLang

object ItemRegisterTask {

    fun run() {
        // 材料
        IEItems.OSMIUM_INGOT.regItem(
            IEItems.IE_RESOURCE_STUFF,
            RecipeType.SMELTERY,
            arrayOf(OsmiumDust.OSMIUM_DUST, null, null, null, null, null, null, null, null)
        )

        addSmelteryRecipe(OsmiumDust.OSMIUM_DUST, IEItems.OSMIUM_INGOT)

        IEItems.WOODEN_GEAR.regNonPlaceableItem(
            IEItems.IE_RESOURCE_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, arrayOf(
                ItemStack(Material.OAK_PLANKS), ItemStack(Material.STICK), ItemStack(Material.OAK_PLANKS),
                ItemStack(Material.STICK), null, ItemStack(Material.STICK),
                ItemStack(Material.OAK_PLANKS), ItemStack(Material.STICK), ItemStack(Material.OAK_PLANKS)
            )
        )
        IEItems.COBBLESTONE_GEAR.regNonPlaceableItem(
            IEItems.IE_RESOURCE_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, arrayOf(
                null, ItemStack(Material.COBBLESTONE), null,
                ItemStack(Material.COBBLESTONE), IEItems.WOODEN_GEAR, ItemStack(Material.COBBLESTONE),
                null, ItemStack(Material.COBBLESTONE), null
            )
        )
        IEItems.IRON_GEAR.regNonPlaceableItem(
            IEItems.IE_RESOURCE_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, arrayOf(
                null, ItemStack(Material.IRON_INGOT), null,
                ItemStack(Material.IRON_INGOT), IEItems.COBBLESTONE_GEAR, ItemStack(Material.IRON_INGOT),
                null, ItemStack(Material.IRON_INGOT), null
            )
        )
        IEItems.STONE_TANK.regNonPlaceableItem(
            IEItems.IE_RESOURCE_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, arrayOf(
                ItemStack(Material.STONE), ItemStack(Material.GLASS_PANE), ItemStack(Material.STONE),
                ItemStack(Material.GLASS_PANE), null, ItemStack(Material.GLASS_PANE),
                ItemStack(Material.STONE), ItemStack(Material.GLASS_PANE), ItemStack(Material.STONE)
            )
        )
        IEItems.BASIC_COIL.regNonPlaceableItem(
            IEItems.IE_RESOURCE_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, arrayOf(
                null, SlimefunItems.COPPER_WIRE, null,
                SlimefunItems.COPPER_WIRE, ItemStack(Material.STICK), SlimefunItems.COPPER_WIRE,
                null, SlimefunItems.COPPER_WIRE, null
            )
        )
        IEItems.ADVANCED_COIL.regNonPlaceableItem(
            IEItems.IE_RESOURCE_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, arrayOf(
                ItemStack(Material.GOLD_NUGGET), ItemStack(Material.GOLD_NUGGET), ItemStack(Material.GOLD_NUGGET),
                ItemStack(Material.GOLD_NUGGET), IEItems.BASIC_COIL, ItemStack(Material.GOLD_NUGGET),
                ItemStack(Material.GOLD_NUGGET), ItemStack(Material.GOLD_NUGGET), ItemStack(Material.GOLD_NUGGET)
            )
        )
        IEItems.ENHANCED_GLOWSTONE.regItem(
            IEItems.IE_RESOURCE_STUFF, AlloyFurnace.recipeType, arrayOf(
                IEItems.OSMIUM_INGOT, ItemStack(
                    Material.GLOWSTONE_DUST
                ), null,
                null, null, null,
                null, null, null
            )
        )
        IEItems.ENHANCED_OBSIDIAN.regItem(
            IEItems.IE_RESOURCE_STUFF, AlloyFurnace.recipeType, arrayOf(
                ItemStack(Material.OBSIDIAN), IEItems.COMPRESSED_EXP_BLOCK, null,
                null, null, null,
                null, null, null
            )
        )
        IEItems.OSGLOGLAS_INGOT.regItem(
            IEItems.IE_RESOURCE_STUFF, AlloyFurnace.recipeType, arrayOf(
                IEItems.ENHANCED_GLOWSTONE, IEItems.ENHANCED_OBSIDIAN, null,
                null, null, null,
                null, null, null
            )
        )
        IEItems.BASIC_CONTROL_CIRCUIT.regNonPlaceableItem(
            IEItems.IE_RESOURCE_STUFF, MetallurgicInfuser.recipeType, arrayOf(
                IEItems.OSMIUM_INGOT, ItemStack(Material.REDSTONE), null,
                null, null, null,
                null, null, null
            )
        )
        IEItems.ENRICHED_ALLOY.regNonPlaceableItem(
            IEItems.IE_RESOURCE_STUFF, MetallurgicInfuser.recipeType, arrayOf(
                ItemStack(Material.IRON_INGOT), ItemStack(Material.REDSTONE), null,
                null, null, null,
                null, null, null
            )
        )
        IEItems.ADVANCED_CONTROL_CIRCUIT.regNonPlaceableItem(
            IEItems.IE_RESOURCE_STUFF,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            arrayOf(
                IEItems.ENRICHED_ALLOY, IEItems.BASIC_CONTROL_CIRCUIT, IEItems.ENRICHED_ALLOY,
                IEItems.ADVANCED_COIL, SlimefunItems.BASIC_CIRCUIT_BOARD, IEItems.ADVANCED_COIL,
                IEItems.ENRICHED_ALLOY, IEItems.BASIC_CONTROL_CIRCUIT, IEItems.ENRICHED_ALLOY
            )
        )

        // 杂项
        IEItems.WOFT.regItem(
            IEItems.IE_MISC_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, arrayOf(
            ItemStack(Material.ENDER_PEARL), ItemStack(Material.DIAMOND), ItemStack(Material.ENDER_PEARL),
            ItemStack(Material.GOLD_INGOT), ItemStack(Material.CLOCK), ItemStack(Material.GOLD_INGOT),
            ItemStack(Material.ENDER_PEARL), ItemStack(Material.DIAMOND), ItemStack(Material.ENDER_PEARL)
        ), ItemUseHandler { e: PlayerRightClickEvent ->
            if (e.hand != EquipmentSlot.HAND) return@ItemUseHandler
            val player = e.player
            val item = e.item
            if (item.amount > 1) {
                item.amount = item.amount - 1
                player.inventory.setItemInMainHand(item)
            } else {
                player.inventory.setItemInMainHand(null)
            }
            player.location.world!!.createExplosion(player.location, 1f, false, false)
            player.location.world!!
                .dropItem(player.location, ItemStack(Material.ENDER_PEARL, 2))
            player.location.world!!
                .dropItem(player.location, ItemStack(Material.DIAMOND, 1))
            player.location.world!!
                .dropItem(player.location, ItemStack(Material.GOLD_INGOT, 1))
            player.sendMessage("§4由于你错误的使用方式，时间洪流怀表爆炸了！")
            player.sendMessage("§e幸运的是，时间洪流怀表的部分材料没有被炸坏...")
            player.sendMessage("§2你应该先看看教程再来使用的：https://www.bilibili.com/video/BV1GJ411x7h7")
        })
        MouseTail(IEItems.IE_MISC_STUFF, IEItems.MOUSE_TAIL, RecipeType.MOB_DROP, arrayOf(
            null, null, null, null,
            CustomItem(
                SkullItem.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGE5MWRhYjgzOTFhZjVmZGE1NGFjZDJjMGIxOGZiZDgxOWI4NjVlMWE4ZjFkNjIzODEzZmE3NjFlOTI0NTQwIn19fQ=="),
                "§aSilverfish",
                "击杀蠹虫时有5%机率掉落"
            ),
            null, null, null, null
        )).register(SlimefunItemExpansion)
        HopeFlower(IEItems.IE_MISC_STUFF, IEItems.HOPE_FLOWER, RecipeType.MOB_DROP, arrayOf(
            null, null, null, null,
            CustomItem(
                SkullItem.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDFiODMwZWI0MDgyYWNlYzgzNmJjODM1ZTQwYTExMjgyYmI1MTE5MzMxNWY5MTE4NDMzN2U4ZDM1NTU1ODMifX19"),
                "§aVillager",
                "击杀村民时有5%机率掉落"
            ),
            null, null, null, null
        )).register(SlimefunItemExpansion)
        IEItems.COMPRESSED_EXP_BLOCK.regNonPlaceableItem(IEItems.IE_MISC_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, arrayOf(
            SlimefunItems.FILLED_FLASK_OF_KNOWLEDGE, SlimefunItems.FILLED_FLASK_OF_KNOWLEDGE, SlimefunItems.FILLED_FLASK_OF_KNOWLEDGE,
            SlimefunItems.FILLED_FLASK_OF_KNOWLEDGE, SlimefunItems.FILLED_FLASK_OF_KNOWLEDGE, SlimefunItems.FILLED_FLASK_OF_KNOWLEDGE,
            SlimefunItems.FILLED_FLASK_OF_KNOWLEDGE, SlimefunItems.FILLED_FLASK_OF_KNOWLEDGE, SlimefunItems.FILLED_FLASK_OF_KNOWLEDGE
        ))
        IEItems.COMPRESSED_EXP_BLOCK_2.regNonPlaceableItem(IEItems.IE_MISC_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, arrayOf(
            IEItems.COMPRESSED_EXP_BLOCK, IEItems.COMPRESSED_EXP_BLOCK, IEItems.COMPRESSED_EXP_BLOCK,
            IEItems.COMPRESSED_EXP_BLOCK, IEItems.COMPRESSED_EXP_BLOCK, IEItems.COMPRESSED_EXP_BLOCK,
            IEItems.COMPRESSED_EXP_BLOCK, IEItems.COMPRESSED_EXP_BLOCK, IEItems.COMPRESSED_EXP_BLOCK
        ))
        IEItems.EXP_CONVERTER.regItem(
            IEItems.IE_ATW_STUFF, RecipeType.MAGIC_WORKBENCH, arrayOf(
                SlimefunItems.MAGICAL_GLASS, IEItems.COMPRESSED_EXP_BLOCK_2, SlimefunItems.MAGICAL_GLASS,
                SlimefunItems.ENDER_LUMP_3, IEItems.STONE_TANK, SlimefunItems.ENDER_LUMP_3,
                SlimefunItems.MAGICAL_GLASS, IEItems.COMPRESSED_EXP_BLOCK_2, SlimefunItems.MAGICAL_GLASS
            )
        )

        // 工具和武器装备
        IEItems.LIGHTNING_WHIP.regItem(
            IEItems.IE_ATW_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, arrayOf(
                null, null, SlimefunItems.STAFF_STORM,
                null, ItemStack(Material.COBWEB), null,
                SlimefunItems.STAFF_STORM, null, null
            )
        )
        IEItems.HUMAN_SADDLE.regItem(
            IEItems.IE_ATW_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, arrayOf(
            ItemStack(Material.LEAD), null, ItemStack(Material.LEAD),
            ItemStack(Material.LEAD), ItemStack(Material.SADDLE), ItemStack(Material.LEAD),
            SlimefunItems.REINFORCED_PLATE, IEItems.WBP_BOOTS, SlimefunItems.REINFORCED_PLATE
        ), EntityInteractHandler { e, _, offhand ->
            if (offhand) return@EntityInteractHandler
            e.isCancelled = true
            val player = e.player
            if (e.rightClicked is Player) {
                val rc = e.rightClicked as Player
                if (!rc.addPassenger(player)) {
                    player.sendLang("item-cannot-mount", rc.name)
                    return@EntityInteractHandler
                }
                rc.sendLang("item-succeed-mount", player.name)
            }
        })
        IEItems.SPEED_TORCH.regNonPlaceableItem(
            IEItems.IE_ATW_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, arrayOf(
                ItemStack(Material.RABBIT_FOOT), IEItems.WOFT, ItemStack(Material.RABBIT_FOOT),
                SlimefunItems.ENDER_RUNE, ItemStack(Material.SOUL_TORCH), SlimefunItems.ENDER_RUNE,
                ItemStack(Material.RABBIT_FOOT), IEItems.WOFT, ItemStack(Material.RABBIT_FOOT)
            )
        )
        Drill(
            IEItems.IE_ATW_STUFF,
            IEItems.DURALUMIN_DRILL,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            arrayOf(
                SlimefunItems.DURALUMIN_INGOT,
                SlimefunItems.DURALUMIN_INGOT,
                SlimefunItems.DURALUMIN_INGOT,
                IEItems.BASIC_CONTROL_CIRCUIT,
                SlimefunItems.SMALL_CAPACITOR,
                IEItems.BASIC_CONTROL_CIRCUIT,
                ItemStack(Material.IRON_BLOCK),
                IEItems.WOFT,
                ItemStack(Material.IRON_BLOCK)
            ),
            200F
        ).register(SlimefunItemExpansion)
        Drill(
            IEItems.IE_ATW_STUFF,
            IEItems.SOLDER_DRILL,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            arrayOf(
                SlimefunItems.SOLDER_INGOT,
                SlimefunItems.SOLDER_INGOT,
                SlimefunItems.SOLDER_INGOT,
                IEItems.BASIC_CONTROL_CIRCUIT,
                SlimefunItems.SMALL_CAPACITOR,
                IEItems.BASIC_CONTROL_CIRCUIT,
                ItemStack(Material.IRON_BLOCK),
                IEItems.WOFT,
                ItemStack(Material.IRON_BLOCK)
            ),
            300F
        ).register(SlimefunItemExpansion)
        Drill(
            IEItems.IE_ATW_STUFF,
            IEItems.BILLON_DRILL,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            arrayOf(
                SlimefunItems.BILLON_INGOT,
                SlimefunItems.BILLON_INGOT,
                SlimefunItems.BILLON_INGOT,
                IEItems.BASIC_CONTROL_CIRCUIT,
                SlimefunItems.SMALL_CAPACITOR,
                IEItems.BASIC_CONTROL_CIRCUIT,
                ItemStack(Material.IRON_BLOCK),
                IEItems.WOFT,
                ItemStack(Material.IRON_BLOCK)
            ),
            400F
        ).register(SlimefunItemExpansion)
        Drill(
            IEItems.IE_ATW_STUFF,
            IEItems.STEEL_DRILL,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            arrayOf(
                SlimefunItems.STEEL_INGOT,
                SlimefunItems.STEEL_INGOT,
                SlimefunItems.STEEL_INGOT,
                IEItems.BASIC_CONTROL_CIRCUIT,
                SlimefunItems.SMALL_CAPACITOR,
                IEItems.BASIC_CONTROL_CIRCUIT,
                ItemStack(Material.IRON_BLOCK),
                IEItems.WOFT,
                ItemStack(Material.IRON_BLOCK)
            ),
            500F
        ).register(SlimefunItemExpansion)
        Drill(
            IEItems.IE_ATW_STUFF,
            IEItems.DAMASCUS_STEEL_DRILL,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            arrayOf(
                SlimefunItems.DAMASCUS_STEEL_INGOT,
                SlimefunItems.DAMASCUS_STEEL_INGOT,
                SlimefunItems.DAMASCUS_STEEL_INGOT,
                IEItems.ADVANCED_CONTROL_CIRCUIT,
                SlimefunItems.SMALL_CAPACITOR,
                IEItems.ADVANCED_CONTROL_CIRCUIT,
                ItemStack(Material.IRON_BLOCK),
                IEItems.WOFT,
                ItemStack(Material.IRON_BLOCK)
            ),
            600F
        ).register(SlimefunItemExpansion)
        Drill(
            IEItems.IE_ATW_STUFF,
            IEItems.REINFORCED_ALLOY_DRILL,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            arrayOf(
                SlimefunItems.REINFORCED_ALLOY_INGOT,
                SlimefunItems.REINFORCED_ALLOY_INGOT,
                SlimefunItems.REINFORCED_ALLOY_INGOT,
                IEItems.ADVANCED_CONTROL_CIRCUIT,
                SlimefunItems.MEDIUM_CAPACITOR,
                IEItems.ADVANCED_CONTROL_CIRCUIT,
                ItemStack(Material.IRON_BLOCK),
                IEItems.WOFT,
                ItemStack(Material.IRON_BLOCK)
            ),
            750F
        ).register(SlimefunItemExpansion)
        Drill(
            IEItems.IE_ATW_STUFF,
            IEItems.CARBONADO_DRILL,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            arrayOf(
                SlimefunItems.CARBONADO,
                SlimefunItems.CARBONADO,
                SlimefunItems.CARBONADO,
                IEItems.ADVANCED_CONTROL_CIRCUIT,
                SlimefunItems.LARGE_CAPACITOR,
                IEItems.ADVANCED_CONTROL_CIRCUIT,
                ItemStack(Material.IRON_BLOCK),
                IEItems.REINFORCED_ALLOY_DRILL,
                ItemStack(Material.IRON_BLOCK)
            ),
            2000F
        ).register(SlimefunItemExpansion)
        LightningBow(
            IEItems.IE_ATW_STUFF, IEItems.LIGHTNING_BOW, arrayOf(
                null, ItemStack(Material.STICK), SlimefunItems.AIR_RUNE,
                IEItems.LIGHTNING_WHIP, null, SlimefunItems.AIR_RUNE,
                null, ItemStack(Material.STICK), SlimefunItems.AIR_RUNE
            )
        ).register(SlimefunItemExpansion)
        ElectricCrossbow(
            IEItems.IE_ATW_STUFF,
            IEItems.ELECTRIC_CROSSBOW,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            arrayOf(
                IEItems.OSGLOGLAS_INGOT,
                SlimefunItems.REINFORCED_PLATE,
                IEItems.OSGLOGLAS_INGOT,
                IEItems.ADVANCED_CONTROL_CIRCUIT,
                SlimefunItems.LARGE_CAPACITOR,
                IEItems.ADVANCED_CONTROL_CIRCUIT,
                null,
                IEItems.OSGLOGLAS_INGOT,
                null
            ),
            1000F
        ).register(SlimefunItemExpansion)
        IEItems.ANDURIL.regItem(
            IEItems.IE_ATW_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, arrayOf(
                SlimefunItems.AIR_RUNE, SlimefunItems.HARDENED_METAL_INGOT, SlimefunItems.AIR_RUNE,
                SlimefunItems.AIR_RUNE, SlimefunItems.HARDENED_METAL_INGOT, SlimefunItems.AIR_RUNE,
                SlimefunItems.AIR_RUNE, ItemStack(Material.BLAZE_ROD), SlimefunItems.AIR_RUNE
            )
        )
        IEItems.WBP_BOOTS.regItem(
            IEItems.IE_ATW_STUFF, RecipeType.ARMOR_FORGE, arrayOf(
                null, null, null,
                ItemStack(Material.SCUTE), null, ItemStack(Material.SCUTE),
                ItemStack(Material.SCUTE), null, ItemStack(Material.SCUTE)
            )
        )
        SlimechunkChecker(IEItems.IE_ATW_STUFF, IEItems.SLIMECHUNK_CHECKER, RecipeType.ENHANCED_CRAFTING_TABLE, arrayOf(
            SlimefunItems.GPS_TRANSMITTER, null, SlimefunItems.GPS_TRANSMITTER,
            ItemStack(Material.SLIME_BLOCK), IEItems.ADVANCED_CONTROL_CIRCUIT, ItemStack(Material.SLIME_BLOCK),
            ItemStack(Material.SLIME_BLOCK), ItemStack(Material.LEVER), ItemStack(Material.SLIME_BLOCK)),
            500F).register(SlimefunItemExpansion)
        IEItems.REINFORCED_SHIELD.regItem(
            IEItems.IE_ATW_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, arrayOf(
                IEItems.OSGLOGLAS_INGOT, SlimefunItems.REINFORCED_PLATE, IEItems.OSGLOGLAS_INGOT,
                IEItems.OSGLOGLAS_INGOT, IEItems.OSGLOGLAS_INGOT, IEItems.OSGLOGLAS_INGOT,
                null, IEItems.OSGLOGLAS_INGOT, null
            )
        )
        ElectricCutter(IEItems.IE_ATW_STUFF, IEItems.ELECTRIC_CUTTER, RecipeType.ENHANCED_CRAFTING_TABLE, arrayOf(
            SlimefunItems.DAMASCUS_STEEL_INGOT, IEItems.DAMASCUS_STEEL_DRILL, SlimefunItems.DAMASCUS_STEEL_INGOT,
            ItemStack(Material.IRON_SWORD), SlimefunItems.SMALL_CAPACITOR, ItemStack(Material.IRON_SWORD),
            null, ItemStack(Material.TRIDENT), null
        ), 128F).register(SlimefunItemExpansion)
        IEItems.SPLASH_XSLF.regItem(IEItems.IE_ATW_STUFF, RecipeType.NULL, arrayOf())

        // 食物
        IEItems.MOUSE_TAIL_JUICE.regItem(
            IEItems.IE_FOOD_STUFF, RecipeType.JUICER, arrayOf(
            IEItems.MOUSE_TAIL, null, null,
            null, null, null,
            null, null, null
        ), ItemUseHandler { e: PlayerRightClickEvent ->
            if (e.hand != EquipmentSlot.HAND) return@ItemUseHandler
            val player = e.player
            player.inventory.setItemInMainHand(null)
            when(random(0, 100)) {
                in 0..29 -> {
                    player.sendLang("item-mousetailjuice-1")
                    player.addPotionEffects(
                        listOf(
                            PotionEffect(PotionEffectType.POISON, 20 * 5, 5),
                            PotionEffect(PotionEffectType.CONFUSION, 20 * 10, 0)
                        )
                    )
                }
                in 30..59 -> {
                    player.sendLang("item-mousetailjuice-2")
                    player.addPotionEffect(PotionEffect(PotionEffectType.SPEED, 20 * 60, 4))
                }
                else -> player.sendLang("item-mousetailjuice-3")
            }
        })
        IEItems.WJZ_RICE.regItem(
            IEItems.IE_FOOD_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, arrayOf(
            null, ItemStack(Material.WHEAT), null,
            null, ItemStack(Material.WHEAT), null,
            null, ItemStack(Material.BOWL), null
        ), ItemUseHandler { e: PlayerRightClickEvent ->
            if (e.hand != EquipmentSlot.HAND) return@ItemUseHandler
            val player = e.player
            val item = e.item
            if (item.amount > 1) {
                item.amount = item.amount - 1
                player.inventory.setItemInMainHand(item)
            } else {
                player.inventory.setItemInMainHand(null)
            }
            player.addPotionEffect(PotionEffect(PotionEffectType.SATURATION, 3, 0))
            player.chat("真香~")
            player.world.dropItem(player.location, ItemStack(Material.BOWL))
        })
        IEItems.XIONG_SHI_LAO_FANG.regItem(
            IEItems.IE_FOOD_STUFF, RecipeType.JUICER, arrayOf(
                ItemStack(Material.GRASS), ItemStack(Material.FERN), ItemStack(Material.DEAD_BUSH),
                ItemStack(Material.SEAGRASS), ItemStack(Material.WITHER_ROSE), ItemStack(Material.WARPED_ROOTS),
                ItemStack(Material.TWISTING_VINES), ItemStack(Material.WEEPING_VINES), ItemStack(Material.CRIMSON_ROOTS)
            )
        )

        // 机械
        IEItems.MACHINE_BLOCK.regNonPlaceableItem(
            IEItems.IE_MACHINES_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, arrayOf(
                SlimefunItems.STEEL_INGOT, IEItems.OSMIUM_INGOT, SlimefunItems.STEEL_INGOT,
                IEItems.IRON_GEAR, ItemStack(Material.GLASS), IEItems.IRON_GEAR,
                SlimefunItems.STEEL_INGOT, IEItems.OSMIUM_INGOT, SlimefunItems.STEEL_INGOT
            )
        )

        // FlickerRealm 专属物品
        if (Bukkit.getServer().pluginManager.isPluginEnabled("Flicker")) {
            IEItems.SHIT.regNonPlaceableItem(IEItems.IE_FOOD_STUFF, RecipeType.NULL, arrayOf())
            IEItems.JIN_KE_LA.regItem(IEItems.IE_MISC_STUFF, RecipeType.NULL, arrayOf())
            IEItems.GROW_CORE.regNonPlaceableItem(
                IEItems.IE_RESOURCE_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, arrayOf(
                    ItemStack(Material.GRASS_BLOCK), IEItems.OSGLOGLAS_INGOT, ItemStack(Material.GRASS_BLOCK),
                    SlimefunItems.POWER_CRYSTAL, IEItems.MACHINE_BLOCK, SlimefunItems.POWER_CRYSTAL,
                    ItemStack(Material.DIRT), IEItems.ADVANCED_CONTROL_CIRCUIT, ItemStack(Material.DIRT)
                )
            )
            IEItems.ORIGINAL_MOB_MATERIAL.regItem(IEItems.IE_RESOURCE_STUFF, RecipeType.NULL, arrayOf(), ItemUseHandler { it.cancel() })
            IEItems.VILLAGER_BOOK.regItem(IEItems.IE_RESOURCE_STUFF, RecipeType.ANCIENT_ALTAR, arrayOf(
                ItemStack(Material.GRASS), SlimefunItems.FILLED_FLASK_OF_KNOWLEDGE, ItemStack(Material.GRASS),
                SlimefunItems.FILLED_FLASK_OF_KNOWLEDGE, ItemStack(Material.BOOK), SlimefunItems.FILLED_FLASK_OF_KNOWLEDGE,
                ItemStack(Material.GRASS), SlimefunItems.FILLED_FLASK_OF_KNOWLEDGE, ItemStack(Material.GRASS)
            ))
            IEItems.MEMORY_128B.regNonPlaceableItem(
                IEItems.IE_MISC_STUFF,
                RecipeType.NULL,
                arrayOf()
            )
            IEItems.CPU.regNonPlaceableItem(IEItems.IE_MISC_STUFF, RecipeType.NULL, arrayOf())
            IEItems.CAMERA_13.regNonPlaceableItem(
                IEItems.IE_MISC_STUFF,
                RecipeType.NULL,
                arrayOf()
            )
            IEItems.COBWEB_SCREEN.regNonPlaceableItem(
                IEItems.IE_MISC_STUFF,
                RecipeType.NULL,
                arrayOf()
            )
            IEItems.T_8848.regNonPlaceableItem(
                IEItems.IE_ATW_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, arrayOf(
                    ItemStack(Material.LEATHER), IEItems.OSGLOGLAS_INGOT, IEItems.CAMERA_13,
                    ItemStack(Material.LEATHER), IEItems.COBWEB_SCREEN, IEItems.MEMORY_128B,
                    IEItems.CPU, IEItems.OSGLOGLAS_INGOT
                )
            )
            IEItems.ARTIFICIAL_DRAGON_BREATH.regUsableInWorkbenchItem(
                IEItems.IE_RESOURCE_STUFF, RecipeType.ANCIENT_ALTAR, arrayOf(
                    SlimefunItems.MAGICAL_GLASS, SlimefunItems.ENDER_RUNE, SlimefunItems.MAGICAL_GLASS,
                    SlimefunItems.ENDER_RUNE, SlimefunItems.STRANGE_NETHER_GOO, SlimefunItems.ENDER_RUNE,
                    SlimefunItems.MAGICAL_GLASS, SlimefunItems.ENDER_RUNE, SlimefunItems.MAGICAL_GLASS
                )
            )
        }
    }
}
