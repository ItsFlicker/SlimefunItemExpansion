package io.github.itsflicker.slimefunitemexpansion.items.resources

import io.github.itsflicker.slimefunitemexpansion.util.toKey
import io.github.thebusybiscuit.slimefun4.api.geo.GEOResource
import me.mrCookieSlime.Slimefun.Lists.RecipeType
import me.mrCookieSlime.Slimefun.Objects.Category
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack
import org.bukkit.Material
import org.bukkit.NamespacedKey
import org.bukkit.World
import org.bukkit.block.Biome
import org.bukkit.inventory.ItemStack

class OsmiumDust(category: Category) : SlimefunItem(category, OSMIUM_DUST, RecipeType.GEO_MINER, arrayOfNulls(0)), GEOResource {

    init {
        register()
    }

    override fun getDefaultSupply(environment: World.Environment, biome: Biome): Int {
        return if (environment == World.Environment.NORMAL) 4 else 0
    }

    override fun getMaxDeviation(): Int {
        // 浮动值
        return 3
    }

    override fun getName(): String {
        return "锇粉"
    }

    override fun getItem(): ItemStack {
        return OSMIUM_DUST
    }

    override fun isObtainableFromGEOMiner(): Boolean {
        return true
    }

    override fun getKey(): NamespacedKey {
        return "IE_OSMIUM_DUST_RESOURCE".toKey()
    }

    companion object {

        val OSMIUM_DUST by lazy {
            SlimefunItemStack("OSMIUM_DUST", Material.SUGAR, "§6锇粉")
        }
    }
}