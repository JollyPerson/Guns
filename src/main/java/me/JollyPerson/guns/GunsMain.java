package me.JollyPerson.guns;

import me.JollyPerson.guns.commands.CreateGunCommand;
import me.JollyPerson.guns.events.*;
import me.JollyPerson.guns.gun.Gun;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import javax.swing.*;

public class GunsMain extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Plugin Enabled");
        getServer().getPluginManager().registerEvents(new Events(new BlockPhysics()), this);
        getServer().getPluginManager().registerEvents(new Gun(), this);
        getCommand("creategun").setExecutor(new CreateGunCommand());
    }

    @Override
    public void onDisable() {

    }
}

