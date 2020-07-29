package fr.dubslime.over2craft.freebuildcore;

import org.bukkit.entity.Player;

import static fr.dubslime.over2craft.freebuildcore.FreecoreVariables.vPlayer;
import static fr.dubslime.over2craft.freebuildcore.FreecoreVariables.vTarget;

public class FreecoreFunctions {

	static String colorize(String string) {
		return org.bukkit.ChatColor.translateAlternateColorCodes('&', string);
	}
	
	static String formatMsg(String string) {
		if (string.contains("%PLAYER%")) {
			string = string.replace("%PLAYER%", vPlayer.getName());
		}
		if (string.contains("%TARGET%")) {
			string = string.replace("%TARGET%", vTarget.getName());
		}
		return colorize(string);
	}
	
}
