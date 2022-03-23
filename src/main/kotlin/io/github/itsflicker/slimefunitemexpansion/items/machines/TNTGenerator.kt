package io.github.itsflicker.slimefunitemexpansion.items.machines

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AGenerator
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineFuel
import me.mrCookieSlime.Slimefun.Objects.handlers.BlockTicker
import org.bukkit.Material
import org.bukkit.block.Block
import org.bukkit.inventory.ItemStack
import taboolib.common.platform.function.submit
import taboolib.common.util.random

class TNTGenerator(itemGroup: ItemGroup, item: SlimefunItemStack, recipeType: RecipeType, recipe: Array<ItemStack?>) :
    AGenerator(itemGroup, item, recipeType, recipe) {

    override fun getProgressBar(): ItemStack {
        return SlimefunUtils.getCustomHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTI2ZTZlYjYyNDliYjEzOWM4MTIyODU2YmE0YzA4NTRlMTQwMGY3ZTA2MGYyM2UwYzQ0NWNhNTg2YjFhY2RiNSJ9fX0=")
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