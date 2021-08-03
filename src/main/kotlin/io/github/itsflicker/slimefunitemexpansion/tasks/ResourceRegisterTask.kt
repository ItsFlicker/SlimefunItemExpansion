package io.github.itsflicker.slimefunitemexpansion.tasks

import io.github.itsflicker.slimefunitemexpansion.items.IEItems
import io.github.itsflicker.slimefunitemexpansion.items.resources.OsmiumDust

object ResourceRegisterTask {

    fun run() {
        OsmiumDust(IEItems.IE_RESOURCE_STUFF).register(io.github.itsflicker.slimefunitemexpansion.SlimefunItemExpansion)
    }
}