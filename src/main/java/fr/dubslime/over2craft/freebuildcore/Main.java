package fr.dubslime.over2craft.freebuildcore;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import static fr.dubslime.over2craft.freebuildcore.FreecoreVariables.loadVariables;

public class Main extends JavaPlugin {
	
	static Main plugin;
	
	@Override
	public void onEnable() {
		plugin = this;
		
		// Chargement de la config
		this.saveDefaultConfig();
		loadVariables();
		
		this.getCommand("freecore").setExecutor(new FreecoreCommand());
		Bukkit.getPluginManager().registerEvents(new FreecoreListeners(), this);
	}

	@Override
	public void onDisable() {

	}
	
}