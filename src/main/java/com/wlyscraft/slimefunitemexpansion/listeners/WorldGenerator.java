package com.wlyscraft.slimefunitemexpansion.listeners;

import com.wlyscraft.slimefunitemexpansion.SlimefunItemExpansion;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.ChunkPopulateEvent;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class WorldGenerator implements Listener {
    private final SlimefunItemExpansion plugin;

    public WorldGenerator(SlimefunItemExpansion plugin){
        this.plugin = plugin;
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onRandomSpawn(ChunkPopulateEvent e){
        Random random = ThreadLocalRandom.current();


    }
}
