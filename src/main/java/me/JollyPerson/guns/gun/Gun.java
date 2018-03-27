package me.JollyPerson.guns.gun;

import org.bukkit.entity.Entity;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.HashMap;
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

    public HashMap<UUID, String> getBullets() {
        return bullets;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getGunName() {
        return gunName;
    }

    public int getMaxAmmo() {
        return maxAmmo;
    }

    public String getReloadSound() {
        return reloadSound;
    }

    public String getFireSound() {
        return fireSound;
    }

    public String getHitSound() {
        return hitSound;
    }

    public boolean isHitPing() {
        return hitPing;
    }

    public String getHitPingSound() {
        return hitPingSound;
    }

    public ItemStack getGunItem() {
        return gunItem;
    }

    public ItemStack getAmmoItem() {
        return ammoItem;
    }

    public Action getShootAction() {
        return shootAction;
    }

    public Action getReloadAction() {
        return reloadAction;
    }

    public Integer getPlayerDamage() {
        return playerDamage;
    }

    public Boolean getScoped() {
        return scoped;
    }

    public Double getKnockback() {
        return knockback;
    }

    public Entity getBulletEntity() {
        return bulletEntity;
    }

    public int getSpreadAmount() {
        return spreadAmount;
    }

    public int getExplosionPower() {
        return explosionPower;
    }

    public Gun(String identifier, String gunName, int maxAmmo, String reloadSound, String fireSound, String hitSound, boolean hitPing, String hitPingSound, ItemStack gunItem, ItemStack ammoItem, Action shootAction, Action reloadAction, Integer playerDamage, Boolean scoped, Double knockback, Entity bulletEntity, int spreadAmount, int explosionPower) {
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
    }

    public Gun(){
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
