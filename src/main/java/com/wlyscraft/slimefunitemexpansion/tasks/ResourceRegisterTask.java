package com.wlyscraft.slimefunitemexpansion.tasks;

import com.wlyscraft.slimefunitemexpansion.SlimefunItemExpansion;
import com.wlyscraft.slimefunitemexpansion.items.IEItems;
import com.wlyscraft.slimefunitemexpansion.resources.OsmiumDust;

public class ResourceRegisterTask {
    public static void run(){
        new OsmiumDust(IEItems.IE_RESOURCE_STUFF).register(SlimefunItemExpansion.getInstance());
    }
}
