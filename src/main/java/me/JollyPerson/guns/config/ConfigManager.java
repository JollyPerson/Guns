package me.JollyPerson.guns.config;

import me.JollyPerson.guns.GunsMain;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class ConfigManager {

  private GunsMain plugin = GunsMain.getPlugin(GunsMain.class);
  public FileConfiguration gunsCfg;
  public File gunsFile;

  public void setup(){
      if(!plugin.getDataFolder().exists()){
          plugin.getDataFolder().mkdir();
      }

      gunsFile = new File(plugin.getDataFolder(), "guns.yml");

      if(!gunsFile.exists()){
          try{
              gunsFile.createNewFile();
          }catch (IOException e){
              Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.RED + "Could not create the file guns.yml! Please contact the author of this plugin for more info!");
              Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.RED + "Shutting down plugin!");
              Bukkit.getPluginManager().disablePlugin(plugin);
          }finally {
              if(gunsFile.exists()){
                  Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "The file guns.yml has been created.");
              }
          }
      }

      gunsCfg = YamlConfiguration.loadConfiguration(gunsFile);

  }

    public FileConfiguration getGunsConfig() {
        return gunsCfg;
    }

    public void saveGunsConfig(){
      try{
          gunsCfg.save(gunsFile);
          Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "The file guns.yml has been properly saved.");
      }catch (IOException e){
          Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.RED + "The file guns.yml couldn't be saved. Please contact the author of this plugin for more info!");
      }
    }

    public void reloadGunsConfig(){
        gunsCfg = YamlConfiguration.loadConfiguration(gunsFile);
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.YELLOW + "The file guns.yml has been reloaded.");
    }
}
