package me.JollyPerson.guns.gun;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Ak47 {


    public Gun ak47 = new GunHandler().setAmmoItem(new ItemStack(Material.FLINT)).buildGun();
}
