package me.JollyPerson.grenades;

import me.JollyPerson.grenades.events.Events;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class GunsMain extends JavaPlugin {

    @Override
    public void onEnable(){
        this.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Plugin Enabled");
        getServer().getPluginManager().registerEvents(new Events(new BlockPhysics()), this);
    }

    @Override
    public void onDisable(){

    }
}
