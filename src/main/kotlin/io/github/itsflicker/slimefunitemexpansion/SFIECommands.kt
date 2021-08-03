package io.github.itsflicker.slimefunitemexpansion

import org.bukkit.entity.Player
import taboolib.common.platform.CommandBody
import taboolib.common.platform.CommandHeader
import taboolib.common.platform.PermissionDefault
import taboolib.common.platform.subCommand
import taboolib.platform.util.sendLang

@CommandHeader("slimefunitemexpansion", aliases = ["sfie"], permissionDefault = PermissionDefault.TRUE)
object SFIECommands {

    @CommandBody
    val rp = subCommand {
        execute<Player> { sender, _, _ ->
            for (entity in sender.passengers) {
                if (entity is Player) {
                    if (!sender.removePassenger(entity)) {
                        sender.sendLang("command-cannot-dismount", sender.name)
                        return@execute
                    }
                    entity.sendMessage("§a${sender.name}对你说:§e§l鬼!")
                    sender.sendLang("command-succeed-dismount", entity.name)
                }
            }
        }
    }
}