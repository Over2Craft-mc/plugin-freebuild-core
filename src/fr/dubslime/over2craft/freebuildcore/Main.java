package fr.dubslime.over2craft.freebuildcore;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	private static Main plugin;
	
	@Override
	public void onEnable() {
		plugin = this;
		
		this.getCommand("freecore").setExecutor(new FreecoreCommand());
		Bukkit.getPluginManager().registerEvents(new FreecoreListeners(), this);
	}

	@Override
	public void onDisable() {

	}
	
}