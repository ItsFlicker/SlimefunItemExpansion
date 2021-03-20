package com.wlyscraft.slimefunitemexpansion.tasks;

import com.wlyscraft.slimefunitemexpansion.resources.OsmiumResource;

public class ResourceRegisterTask {
    public static void run(){
        new OsmiumResource().register();
    }
}
