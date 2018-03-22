package me.JollyPerson.guns.events;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class Ak47Events implements Listener {

    public ItemStack Ak47 = new ItemStack(Material.WOOD_SWORD);
    public ItemMeta Ak47Meta = Ak47.getItemMeta();

    public Ak47Events(){
        List<String> lore = new ArrayList<>();
        lore.add("Primed: false");
        lore.add("Ammo: 0");
        Ak47Meta.setDisplayName(ChatColor.GOLD + "Ak47" + ChatColor.GREEN + " >>0<<");
        Ak47Meta.setUnbreakable(true);
        Ak47Meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        Ak47Meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        Ak47Meta.setLore(lore);
        Ak47.setItemMeta(Ak47Meta);
    }

    @EventHandler
    public void onClick(PlayerInteractEvent e){
        
    }

}
