package me.JollyPerson.guns.events;

import me.JollyPerson.guns.BlockPhysics;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Blaze;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockExplodeEvent;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

import java.util.*;

import static org.bukkit.event.block.Action.*;


public class Events implements Listener{

    public ItemStack CUSTOM_SNOWBALL = new ItemStack(Material.SNOW_BALL);
    private BlockPhysics blockPhysics;
    private List<UUID> bullets = new ArrayList<>();

    public Events(BlockPhysics blockPhysics) {
        this.blockPhysics = blockPhysics;
    }

    @EventHandler
    public void onExplodeEntity(EntityExplodeEvent e) {
        e.setYield(0);
        TNTPrimed tntPrimed = (TNTPrimed) e.blockList();
        tntPrimed.setFuseTicks(1);
        for (Block block : e.blockList()) {
            blockPhysics.bounceBlock(block);
        }
    }

    @EventHandler
    public void onExplodeBlock(BlockExplodeEvent e) {
        e.setYield(0);
        for (Block block : e.blockList()) {
            blockPhysics.bounceBlock(block);
        }
    }

    @EventHandler
    public void onFire(PlayerInteractEvent event) {
        if(event.getAction().equals(Action.RIGHT_CLICK_AIR) || event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
            if (event.getPlayer().getItemInHand().isSimilar(new ItemStack(Material.DIAMOND))) {
                Snowball snowball = event.getPlayer().launchProjectile(Snowball.class, event.getPlayer().getEyeLocation().getDirection());
                snowball.setVelocity(event.getPlayer().getEyeLocation().getDirection().multiply(5));
                bullets.add(snowball.getUniqueId());
                snowball.setGravity(false);
                System.out.println(bullets);
                snowball.getUniqueId();
            }
        }
    }

    @EventHandler
    public void onSnowballHit(ProjectileHitEvent event){

    }

    @EventHandler
    public void onHit(ProjectileHitEvent e) {
        if (e.getEntity().getShooter() instanceof Player) {
            Player player = (Player) e.getEntity().getShooter();
            player.sendMessage("Hi");
            if (bullets.contains(e.getEntity().getUniqueId())) {
                player.sendMessage("you are in the list");
                e.getEntity().getWorld().createExplosion(e.getEntity().getLocation(), 3);
                player.sendMessage(e.getEntity().getUniqueId().toString());
                player.sendMessage(e.getEntity().getVelocity().toString());
                bullets.remove(e.getEntity().getUniqueId());
            }
        }
    }

    interface Actions {
        Set<Action> CLICK_RIGHT = EnumSet.of(RIGHT_CLICK_BLOCK, RIGHT_CLICK_AIR);
        Set<Action> CLICK_LEFT = EnumSet.of(LEFT_CLICK_BLOCK, LEFT_CLICK_AIR);
        Set<Action> CLICK_BLOCK = EnumSet.of(LEFT_CLICK_BLOCK, RIGHT_CLICK_BLOCK);
        Set<Action> CLICK_AIR = EnumSet.of(RIGHT_CLICK_AIR, LEFT_CLICK_AIR);
    }
}
