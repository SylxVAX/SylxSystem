package de.sylx.system.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class OnQuitListener implements Listener {
    @EventHandler
    public void onQuit(PlayerQuitEvent e) {
        Player p = e.getPlayer();

        e.setQuitMessage("§c" + p.getName() + " hat das Spiel Verlassen der huransohn");

        for (Player onlinePlayer : Bukkit.getOnlinePlayers()) {
            onlinePlayer.playSound(onlinePlayer.getLocation(), Sound.ENTITY_VILLAGER_YES, 3.0F, 1.0F);
        }

    }
}
