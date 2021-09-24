package io.github.itsflicker.slimefunitemexpansion

import io.github.itsflicker.slimefunitemexpansion.tasks.*
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon
import io.github.thebusybiscuit.slimefun4.core.services.CustomItemDataService
import org.bukkit.plugin.java.JavaPlugin
import taboolib.common.platform.*
import taboolib.common.platform.function.info
import taboolib.module.configuration.Config
import taboolib.module.configuration.SecuredFile
import taboolib.platform.BukkitPlugin

object SlimefunItemExpansion : Plugin(), SlimefunAddon {

    val plugin by lazy { BukkitPlugin.getInstance() }

    val levelDataService by lazy { CustomItemDataService(plugin, "stored_level") }

    @Config(migrate = true)
    lateinit var config: SecuredFile
        private set

    override fun onEnable() {
        ResourceRegisterTask.run()
        ItemRegisterTask.run()
        MachineRegisterTask.run()
        ResearchRegisterTask.run()
        info("§bSlimefunItemExpansion v$pluginVersion Enabled.")
    }

    override fun getJavaPlugin(): JavaPlugin {
        return plugin
    }

    override fun getBugTrackerURL(): String {
        return "https://github.com/ItsFlicker/SlimefunItemExpansion"
    }
}