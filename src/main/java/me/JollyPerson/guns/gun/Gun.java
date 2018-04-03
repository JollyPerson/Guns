package me.JollyPerson.guns.gun;

import me.JollyPerson.guns.config.ConfigManager;
import org.bukkit.craftbukkit.libs.it.unimi.dsi.fastutil.Hash;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class Gun implements Listener{

    public HashMap<UUID, String> bullets = new HashMap<>();

    private String identifier;
    private String gunName;
    private int maxAmmo;
    private String reloadSound;
    private String fireSound;
    private String hitSound;
    private boolean hitPing;
    private String hitPingSound;
    private ItemStack gunItem;
    private ItemStack ammoItem;
    private Action shootAction;
    private Action reloadAction;
    private Integer playerDamage;
    private Boolean scoped;
    private Double knockback;
    private Entity bulletEntity;
    private int spreadAmount;
    private int explosionPower;
    private GunType gunType;
    private int currentAmmo;

    private ConfigManager cfgm;

    public HashMap<UUID, String> getBullets() {
        return bullets;
    }

    public int getAmmo(){
        return currentAmmo;
    }


    public Gun(String identifier, String gunName, int maxAmmo, String reloadSound, String fireSound, String hitSound, boolean hitPing, String hitPingSound, ItemStack gunItem, ItemStack ammoItem, Action shootAction, Action reloadAction, Integer playerDamage, Boolean scoped, Double knockback, Entity bulletEntity, int spreadAmount, int explosionPower, GunType gunType) {
        this.identifier = identifier;
        this.gunName = gunName;
        this.maxAmmo = maxAmmo;
        this.reloadSound = reloadSound;
        this.fireSound = fireSound;
        this.hitSound = hitSound;
        this.hitPing = hitPing;
        this.hitPingSound = hitPingSound;
        this.gunItem = gunItem;
        this.ammoItem = ammoItem;
        this.shootAction = shootAction;
        this.reloadAction = reloadAction;
        this.playerDamage = playerDamage;
        this.scoped = scoped;
        this.knockback = knockback;
        this.bulletEntity = bulletEntity;
        this.spreadAmount = spreadAmount;
        this.explosionPower = explosionPower;
        this.gunType = gunType;
    }

    public Gun(){
    }

    public Gun(ConfigManager configManager){

    }

    public String toString() {
        return "Gun{" +
                "bullets=" + bullets +
                ", identifier='" + identifier + '\'' +
                ", gunName='" + gunName + '\'' +
                ", maxAmmo=" + maxAmmo +
                ", reloadSound='" + reloadSound + '\'' +
                ", fireSound='" + fireSound + '\'' +
                ", hitSound='" + hitSound + '\'' +
                ", hitPing=" + hitPing +
                ", hitPingSound='" + hitPingSound + '\'' +
                ", gunItem=" + gunItem +
                ", ammoItem=" + ammoItem +
                ", shootAction=" + shootAction +
                ", reloadAction=" + reloadAction +
                ", playerDamage=" + playerDamage +
                ", scoped=" + scoped +
                ", knockback=" + knockback +
                ", bulletEntity=" + bulletEntity +
                ", spreadAmount=" + spreadAmount +
                ", explosionPower=" + explosionPower +
                ", gunType=" + gunType +
                '}';
    }

    @EventHandler
    public void playerInteract(PlayerInteractEvent e){

    }

    @EventHandler
    public void playerDamage(EntityDamageByEntityEvent e){

    }

    @EventHandler
    public void entityHit(ProjectileHitEvent e){

    }


}
