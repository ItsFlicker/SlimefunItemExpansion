package io.github.itsflicker.slimefunitemexpansion

import io.github.itsflicker.slimefunitemexpansion.tasks.*
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon
import org.bukkit.plugin.java.JavaPlugin
import taboolib.common.platform.*
import taboolib.module.configuration.Config
import taboolib.module.configuration.SecuredFile
import taboolib.platform.BukkitPlugin

object SlimefunItemExpansion : Plugin(), SlimefunAddon {

    val plugin by lazy {
        BukkitPlugin.getInstance()
    }

    @Config(migrate = true)
    lateinit var config: SecuredFile
        private set

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