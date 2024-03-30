package de.sylx.system;

import de.sylx.system.Listeners.OnJoinListener;
import de.sylx.system.Listeners.OnQuitListener;
import de.sylx.system.Listeners.PlayerKillEvent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class SylxSystem extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "Sylx System Enabled");
        PluginManager manager = Bukkit.getPluginManager();
        manager.registerEvents(new OnJoinListener(), this );
        manager.registerEvents(new PlayerKillEvent(), this);
        manager.registerEvents(new OnQuitListener(), this);

    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Sylx System Disabled");
    }
}
