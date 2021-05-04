package com.wlyscraft.slimefunitemexpansion;

import com.wlyscraft.slimefunitemexpansion.tasks.ItemRegisterTask;
import com.wlyscraft.slimefunitemexpansion.tasks.MachineRegisterTask;
import com.wlyscraft.slimefunitemexpansion.tasks.ResearchRegisterTask;
import com.wlyscraft.slimefunitemexpansion.tasks.ResourceRegisterTask;
import com.wlyscraft.slimefunitemexpansion.utils.SfUtils;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;


public final class SlimefunItemExpansion extends JavaPlugin implements SlimefunAddon {

    private static SlimefunItemExpansion instance;

    @Nonnull
    public JavaPlugin getJavaPlugin() {
        return this;
    }

    public String getBugTrackerURL() {
        return "https://github.com/ItsFlicker/SlimefunItemExpansion/issues";
    }

    @Override
    public void onEnable() {
        instance = this;

        getLogger().info("§b欢迎使用 SlimefunItemExpansion v1.0.2 by wlys(还在测试中)");

        getLogger().info("§a读取配置文件中...");
        saveDefaultConfig();

        FileConfiguration config = getConfig();

        SfUtils.setPrefix(config.getString("prefix"));

        getLogger().info("§a注册SlimeFun GEO资源中...");
        ResourceRegisterTask.run();

        getLogger().info("§a注册SlimeFun物品中...");
        ItemRegisterTask.run();

        getLogger().info("§a注册SlimeFun机器中...");
        MachineRegisterTask.run();

        getLogger().info("§a注册SlimeFun研究中...");
        ResearchRegisterTask.run();

//        getLogger().info("§a注册SlimeFun物品监听器中...");
//        Bukkit.getPluginManager().registerEvents(new ItemSwitchListener(), getInstance());

    }

    public static SlimefunItemExpansion getInstance() {
        return instance;
    }

    @ParametersAreNonnullByDefault
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("sfie") || command.getName().equalsIgnoreCase("slimefunitemexpansion")) {
            if (args == null || args.length == 0) return false;
            else if (args[0].equalsIgnoreCase("help")) {
                return false;
            }
            else if (args[0].equalsIgnoreCase("rp")) {
                if (!(sender instanceof Player)) {
                    sender.sendMessage("你必须是一名玩家!");
                    return true;
                }
                Player player = (Player) sender;
                for (Entity entity : player.getPassengers()) {
                    if (entity instanceof Player) {
                        Player passenger = (Player) entity;
                        if (!player.removePassenger(entity)) {
                            SfUtils.sendActionBar(player, "§4由于某种原因,你不能让" + passenger.getName() + "从你头上下去");
                            return true;
                        }
                        SfUtils.sendMessage(passenger, "§a" + player.getName() + "对你说:§e§l鬼!");
                        SfUtils.sendActionBar(player, "§e你成功的将" + passenger.getName() + "从你的头上赶了下去");
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public void onDisable() {
        super.onDisable();
        instance = null;
    }
}
