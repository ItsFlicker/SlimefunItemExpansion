package io.github.itsflicker.slimefunitemexpansion

import org.bukkit.entity.Player
import taboolib.common.platform.command.CommandBody
import taboolib.common.platform.command.CommandHeader
import taboolib.common.platform.command.PermissionDefault
import taboolib.common.platform.command.subCommand
import taboolib.platform.util.sendLang

@CommandHeader("slimefunitemexpansion", aliases = ["sfie"])
object SFIECommands {

    @CommandBody(permissionDefault = PermissionDefault.TRUE)
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