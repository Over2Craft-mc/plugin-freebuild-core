package fr.dubslime.over2craft.freebuildcore;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import static fr.dubslime.over2craft.freebuildcore.FreecoreFunctions.colorize;
import static fr.dubslime.over2craft.freebuildcore.FreecoreVariables.loadVariables;
import static fr.dubslime.over2craft.freebuildcore.FreecoreVariables.reloadMessage;

public class FreecoreCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (command.getName().equalsIgnoreCase("freecore")) {
			if (args[0].equalsIgnoreCase("reload")) {
				Main.plugin.reloadConfig();
				loadVariables();
				sender.sendMessage(colorize(reloadMessage));
			}
		}
		return true;
	}

}
