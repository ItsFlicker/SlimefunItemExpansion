package com.wlyscraft.slimefunitemexpansion;

import com.wlyscraft.slimefunitemexpansion.tasks.ItemRegisterTask;
import com.wlyscraft.slimefunitemexpansion.tasks.MachineRegisterTask;
import com.wlyscraft.slimefunitemexpansion.tasks.ResearchRegisterTask;
import com.wlyscraft.slimefunitemexpansion.tasks.ResourceRegisterTask;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import org.bukkit.plugin.java.JavaPlugin;

import javax.annotation.Nonnull;
import java.io.File;

public final class SlimefunItemExpansion extends JavaPlugin implements SlimefunAddon {
    private static SlimefunItemExpansion instance;

    @Nonnull
    public JavaPlugin getJavaPlugin() {
        return this;
    }

    public String getBugTrackerURL() {
        return "暂时没有";
    }

    @Override
    public void onEnable() {
        instance = this;


        getLogger().info("§a注册SlimeFun物品中...");
        ItemRegisterTask.run();

        getLogger().info("§a注册SlimeFun机器中...");
        MachineRegisterTask.run();

        getLogger().info("§a注册SlimeFun GEO资源中...");
        ResourceRegisterTask.run();

        getLogger().info("§a注册SlimeFun研究中...");
        ResearchRegisterTask.run();


    }

    public static SlimefunItemExpansion getInstance() {
        return instance;
    }

    @Override
    public void onDisable() {
        instance = null;
    }
}
