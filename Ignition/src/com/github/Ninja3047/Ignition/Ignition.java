package com.github.Ninja3047.Ignition;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Ignition extends JavaPlugin
{
	public void onEnable() // When the plugin is enabled
	{

		getLogger().info("Ignition has been enabled. "); // display message

	}

	public void onDisable() // When the plugin is disabled
	{

		getLogger().info("Ignition has been disabled. "); // display message

	}

	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args)
	{
		if (cmd.getName().equalsIgnoreCase("ignite")) //if player typed /ignite
		{
			Player s = (Player) sender;
			Player target = s.getServer().getPlayer(args[0]); // Gets the player who was typed in the command. 
			target.setFireTicks(10000); //set the target on fire for 10000 milliseconds
			sender.sendMessage("You set " + target.getDisplayName()	+ " on fire!"); //displays a message
			return true;
		}
		return false;
	}
}