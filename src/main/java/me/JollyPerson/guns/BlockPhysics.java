package me.JollyPerson.guns;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.FallingBlock;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.util.Vector;

public class BlockPhysics {

    public void bounceBlock(Block b) {
        Object fb;
        if (b == null) return;
        if (b.getType() == Material.TNT) {
            fb = b.getWorld().spawn(b.getLocation().add(0, 1, 0), TNTPrimed.class);


        } else {
            fb = b.getWorld()
                    .spawnFallingBlock(b.getLocation().add(0, 1, 0), b.getType(), b.getData());
            ((FallingBlock) fb).setDropItem(false);
        }


        b.setType(Material.AIR);

        float x = (float) -1 + (float) (Math.random() * ((1 - -1) + 1));
        float y = (float) -5 + (float) (Math.random() * ((5 - -5) + 1));
        float z = (float) -0.3 + (float) (Math.random() * ((0.3 - -0.3) + 1));
        Vector vector = new Vector(x, y, z);

        ((Entity) fb).setVelocity(vector);
    }
}
