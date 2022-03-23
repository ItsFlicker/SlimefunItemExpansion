package io.github.itsflicker.slimefunitemexpansion

import io.github.itsflicker.slimefunitemexpansion.tasks.ItemRegisterTask
import io.github.itsflicker.slimefunitemexpansion.tasks.MachineRegisterTask
import io.github.itsflicker.slimefunitemexpansion.tasks.ResearchRegisterTask
import io.github.itsflicker.slimefunitemexpansion.tasks.ResourceRegisterTask
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon
import org.bukkit.plugin.java.JavaPlugin
import taboolib.common.platform.Plugin
import taboolib.common.platform.function.info
import taboolib.platform.BukkitPlugin

object SlimefunItemExpansion : Plugin(), SlimefunAddon {

    val plugin by lazy {
        BukkitPlugin.getInstance()
    }

//    @Config(autoReload = true)
//    lateinit var config: Configuration
//        private set

    override fun onEnable() {
        ResourceRegisterTask.run()
        ItemRegisterTask.run()
        MachineRegisterTask.run()
        ResearchRegisterTask.run()
        info("§bSFIE v${plugin.description.version} Enabled.")
    }

    override fun getJavaPlugin(): JavaPlugin {
        return this.plugin
    }

    override fun getBugTrackerURL(): String {
        return "https://github.com/ItsFlicker/SlimefunItemExpansion"
    }
}