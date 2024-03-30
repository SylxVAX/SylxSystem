package de.sylx.system.Listeners;

import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class PlayerKillEvent implements Listener {

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent e) {
        Player p = e.getEntity();
        World w = p.getWorld();

        p.sendTitle("§cDu bist gestorben!", "Nuttensohn", 10, 10, 10);
        p.playSound(p.getLocation(), Sound.ENTITY_ENDERMAN_DEATH, 1.0F, 1.0F);
        w.strikeLightning(p.getLocation());

    }
}
