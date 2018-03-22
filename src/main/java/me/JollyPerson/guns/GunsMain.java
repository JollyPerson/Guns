package me.JollyPerson.guns;

import me.JollyPerson.guns.events.*;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class GunsMain extends JavaPlugin {

    @Override
    public void onEnable(){
        this.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Plugin Enabled");
        getServer().getPluginManager().registerEvents(new Events(new BlockPhysics()), this);
        getServer().getPluginManager().registerEvents(new Ak47Events(), this);
        getServer().getPluginManager().registerEvents(new AWPEvents(), this);
        getServer().getPluginManager().registerEvents(new DEagleEvents(), this);
        getServer().getPluginManager().registerEvents(new RevolverEvents(), this);
        getServer().getPluginManager().registerEvents(new M4A4Events(), this);
        getServer().getPluginManager().registerEvents(new ScarHEvents(), this);
    }

    @Override
    public void onDisable(){

    }
}
