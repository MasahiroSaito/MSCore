package com.masahirosaito.spigot.mscore

import org.bukkit.ChatColor
import org.bukkit.entity.Player
import org.bukkit.plugin.java.JavaPlugin
import java.util.logging.Logger

class Messenger(val plugin: JavaPlugin, val onDebug: Boolean) {
    val logger: Logger = plugin.logger

    fun prefix(obj: Any) = "[${plugin.name}] $obj"

    fun log(obj: Any) = logger.info("$obj")

    fun debug(obj: Any) {
        if (onDebug) log("${ChatColor.AQUA}[DEBUG]${ChatColor.RESET} $obj")
    }

    fun send(player: Player, obj: Any) = player.sendMessage(prefix(obj))
}