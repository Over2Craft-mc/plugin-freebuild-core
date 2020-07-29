package fr.dubslime.over2craft.freebuildcore;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

public class FreecoreVariables {

	static String symbol;
	static String color;
	static String soundName;
	static String chatMessage;
	static String actionBarMessage;
	static String reloadMessage;
	static boolean toggleSound;
	static boolean toggleMessage;
	static boolean toggleActionBar;
	static int soundVolume;
	static int soundPitch;
	
	static Player vPlayer;
	static Player vTarget;
	
	static void loadVariables() {
		
		FileConfiguration configYml = Main.plugin.getConfig();
		
		symbol = configYml.getString("symbol");
		color = configYml.getString("color");
		soundName = configYml.getString("soundName");
		chatMessage = configYml.getString("chatMessage");
		actionBarMessage = configYml.getString("actionBarMessage");
		reloadMessage = configYml.getString("reloadMessage");
		toggleSound = configYml.getBoolean("toggleSound");
		toggleMessage = configYml.getBoolean("toggleMessage");
		toggleActionBar = configYml.getBoolean("toggleActionBar");
		soundVolume = configYml.getInt("soundVolume");
		soundPitch = configYml.getInt("soundPitch");
		
	}
	
}
