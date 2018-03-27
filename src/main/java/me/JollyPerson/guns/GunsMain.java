package me.JollyPerson.guns;

import me.JollyPerson.guns.events.*;
import me.JollyPerson.guns.gun.Gun;
import me.JollyPerson.guns.gun.GunHandler;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.JavaPluginLoader;

public class GunsMain extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Plugin Enabled");
        getServer().getPluginManager().registerEvents(new Events(new BlockPhysics()), this);
        getServer().getPluginManager().registerEvents(new Gun(), this);
    }

    @Override
    public void onDisable(){

    }
}
