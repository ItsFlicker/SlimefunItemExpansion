package io.github.itsflicker.slimefunitemexpansion.items.machines

import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config
import me.mrCookieSlime.Slimefun.Lists.RecipeType
import me.mrCookieSlime.Slimefun.Objects.Category
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AGenerator
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineFuel
import me.mrCookieSlime.Slimefun.Objects.handlers.BlockTicker
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack
import me.mrCookieSlime.Slimefun.cscorelib2.skull.SkullItem
import org.bukkit.Material
import org.bukkit.block.Block
import org.bukkit.inventory.ItemStack
import taboolib.common.platform.submit
import taboolib.common.util.random
import java.util.*

class TNTGenerator(category: Category, item: SlimefunItemStack, recipeType: RecipeType, recipe: Array<ItemStack?>) :
    AGenerator(category, item, recipeType, recipe) {

    override fun getProgressBar(): ItemStack {
        return SkullItem.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTI2ZTZlYjYyNDliYjEzOWM4MTIyODU2YmE0YzA4NTRlMTQwMGY3ZTA2MGYyM2UwYzQ0NWNhNTg2YjFhY2RiNSJ9fX0=")
    }

    override fun registerDefaultFuelTypes() {
        registerFuel(MachineFuel(5, ItemStack(Material.GUNPOWDER)))
        registerFuel(MachineFuel(30, ItemStack(Material.TNT)))
    }

    override fun preRegister() {
        addItemHandler(object : BlockTicker() {

            override fun isSynchronized(): Boolean {
                return false
            }

            override fun tick(b: Block, item: SlimefunItem, data: Config) {
                if (machineProcessor.getOperation(b)?.isFinished == false) {
                    if (random(0.02)) {
                        submit { b.world.createExplosion(b.location, 2F, false, false) }
                    }
                }
            }
        })
    }
}