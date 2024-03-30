package de.sylx.system.Listeners;

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

        p.playSound(p.getLocation(), Sound.ITEM_GOAT_HORN_SOUND_0, 1.0f, 1.0f);

    }
}
