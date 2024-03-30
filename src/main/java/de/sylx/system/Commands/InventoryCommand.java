package de.sylx.system.Commands;

import de.sylx.system.util.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.jetbrains.annotations.NotNull;

public class InventoryCommand implements CommandExecutor {


    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (!(commandSender instanceof Player)) return false;
        Player player = (Player) commandSender;
        Inventory inventory = Bukkit.createInventory(null , 3*9 , "§6§lSylx Inventory");
        inventory.setItem(13 , new ItemBuilder(Material.DIRT).setDisplayname("§c Survival ").setLore("§7 Name: " + player.getName(),"§7 UUID: " + player.getUniqueId()).build());

        if (player.getGameMode()== GameMode.SURVIVAL){
            inventory.setItem(15 , new ItemBuilder(Material.PAPER).setDisplayname("§c Gamemode Creative ").setLore("§7 Gamemode Zu Creative ").setLocalizedName("creative").build());


        }else {
            inventory.setItem(15 , new ItemBuilder(Material.BAKED_POTATO).setDisplayname("§a Gamemode Survival ").setLore("§7 Gamemode Zu Survival  ").setLocalizedName("survival").build());


        }

        inventory.setItem(11 , new ItemBuilder(Material.IRON_SWORD).setDisplayname("§c Ab Zum Spawn  ").setLore("§7 Zum Spawn  ").setLocalizedName("spawn").build());
        player.openInventory(inventory);
        return false;


    }
}
