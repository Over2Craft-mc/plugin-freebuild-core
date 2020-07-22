package fr.dubslime.over2craft.freebuildcore;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class FreecoreListeners implements Listener {

	@EventHandler
	public void onChat(AsyncPlayerChatEvent event) {
		Player vPlayer = event.getPlayer();
		String message = event.getMessage();
		for (Player player : Bukkit.getOnlinePlayers()) {
			if (message.contains(player.getName())){
				Player target = player;
			}
		}
	}
	
}
