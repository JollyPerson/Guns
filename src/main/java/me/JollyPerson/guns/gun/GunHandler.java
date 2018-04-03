package me.JollyPerson.guns.gun;

import org.bukkit.entity.Entity;
import org.bukkit.event.block.Action;
import org.bukkit.inventory.ItemStack;

public class GunHandler {

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

    public GunType getGunType() {
        return gunType;
    }

    public GunHandler setGunType(GunType gunType) {
        this.gunType = gunType;
        return this;
    }

    public GunHandler() {
    }

    public String getIdentifier() {
        return identifier;
    }

    public GunHandler setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    public Entity getBulletEntity() {
        return bulletEntity;
    }

    public GunHandler setBulletEntity(Entity bulletEntity) {
        this.bulletEntity = bulletEntity;
        return this;
    }

    public int getSpreadAmount() {
        return spreadAmount;
    }

    public GunHandler setSpreadAmount(int spreadAmount) {
        this.spreadAmount = spreadAmount;
        return this;
    }

    public Action getShootAction() {
        return shootAction;
    }

    public GunHandler setShootAction(Action shootAction) {
        this.shootAction = shootAction;
        return this;
    }

    public Action getReloadAction() {
        return reloadAction;
    }

    public GunHandler setReloadAction(Action reloadAction) {
        this.reloadAction = reloadAction;
        return this;
    }

    public Integer getPlayerDamage() {
        return playerDamage;
    }

    public GunHandler setPlayerDamage(Integer playerDamage) {
        this.playerDamage = playerDamage;
        return this;
    }

    public Boolean getScoped() {
        return scoped;
    }

    public GunHandler setScoped(Boolean scoped) {
        this.scoped = scoped;
        return this;
    }

    public Double getKnocback() {
        return knockback;
    }

    public GunHandler setKnocback(Double knockback) {
        this.knockback = knockback;
        return this;
    }

    public String getGunName() {
        return gunName;
    }

    public GunHandler setGunName(String gunName) {
        this.gunName = gunName;
        return this;
    }

    public int getMaxAmmo() {
        return maxAmmo;
    }

    public GunHandler setMaxAmmo(int maxAmmo) {
        this.maxAmmo = maxAmmo;
        return this;
    }

    public String getReloadSound() {
        return reloadSound;
    }

    public GunHandler setReloadSound(String reloadSound) {
        this.reloadSound = reloadSound;
        return this;
    }

    public String getFireSound() {
        return fireSound;
    }

    public GunHandler setFireSound(String fireSound) {
        this.fireSound = fireSound;
        return this;
    }

    public String getHitSound() {
        return hitSound;
    }

    public GunHandler setHitSound(String hitSound) {
        this.hitSound = hitSound;
        return this;
    }

    public boolean getHitPing() {
        return hitPing;
    }

    public GunHandler setHitPing(boolean hitPing) {
        this.hitPing = hitPing;
        return this;
    }

    public String getHitPingSound() {
        return hitPingSound;
    }

    public GunHandler setHitPingSound(String hitPingSound) {
        this.hitPingSound = hitPingSound;
        return this;
    }

    public ItemStack getGunItem() {
        return gunItem;
    }

    public GunHandler setGunItem(ItemStack gunItem) {
        this.gunItem = gunItem;
        return this;
    }

    public ItemStack getAmmoItem() {
        return ammoItem;
    }

    public GunHandler setAmmoItem(ItemStack ammoItem) {
        this.ammoItem = ammoItem;
        return this;
    }

    public int getExplosionPower(){
        return explosionPower;
    }

    public GunHandler setExplosionPower(int explosionPower){
        this.explosionPower = explosionPower;
        return this;
    }

    public Gun buildGun() {
        return new Gun(identifier, gunName, maxAmmo, reloadSound, fireSound, hitSound, hitPing, hitPingSound, gunItem, ammoItem, shootAction, reloadAction, playerDamage, scoped, knockback, bulletEntity, spreadAmount, explosionPower, gunType);
    }
}
