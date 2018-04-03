package me.JollyPerson.guns.inventory;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;

public class Inventories {

    public Inventory gunCreatorInv = Bukkit.createInventory(null, 27 ,ChatColor.GREEN + "Create a Gun!");
}
