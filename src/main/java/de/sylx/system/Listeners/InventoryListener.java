package de.sylx.system.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryListener implements Listener {
    @EventHandler
    public void onInventoryClick(InventoryClickEvent e) {

        if (e.getCurrentItem() == null) return;
        if (e.getView().getTitle() == "§6§lSylx Inventory"){
            Player player = (Player) e.getWhoClicked();
            e.setCancelled(true);
            if (e.getCurrentItem().getItemMeta().hasLocalizedName()){
                switch (e.getCurrentItem().getItemMeta().getLocalizedName()) {
                    case "creative":
                        player.setGameMode(GameMode.CREATIVE);
                        player.closeInventory();
                        player.sendMessage("§7Du hast erfolgreich dein Gamemode auf §aCREATIVE§7 gesetzt§8!");
                        player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 2.0F, 1.0F);
                        break;
                    case "survival":
                        player.setGameMode(GameMode.SURVIVAL);
                        player.closeInventory();
                        player.sendMessage("§7Du hast erfolgreich dein Gamemode auf §aSURVIVAL§7 gesetzt§8!");
                        player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 2.0F, 1.0F);
                        break;
                    case "spawn":
                        player.teleport(Bukkit.getWorld("world").getSpawnLocation());
                        player.closeInventory();
                        player.sendMessage("§aDu hast dich zum Spawn teleportiert!");
                        player.playSound(player.getLocation(), Sound.ENTITY_ALLAY_HURT, 2.0F, 1.0F);
                        break;
                }

            }
        }

    }
}