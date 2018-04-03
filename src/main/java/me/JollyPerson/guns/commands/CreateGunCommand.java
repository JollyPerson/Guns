package me.JollyPerson.guns.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class CreateGunCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(cmd.getLabel().equalsIgnoreCase("creategun")){
            if(sender instanceof Player){
                Player p = (Player) sender;
            }
            if(sender instanceof ConsoleCommandSender){

            }
        }
        return true;
    }
}
