package fr.dubslime.over2craft.freebuildcore;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;

import static fr.dubslime.over2craft.freebuildcore.FreecoreFunctions.*;
import static fr.dubslime.over2craft.freebuildcore.FreecoreVariables.*;

public class FreecoreListeners implements Listener {
	
	FileConfiguration config = Main.plugin.getConfig();

	@EventHandler
	public void onChat(AsyncPlayerChatEvent event) {
		vPlayer = event.getPlayer();
		String msg = event.getMessage();
		String message = event.getMessage().toLowerCase();
		for (Player player : Bukkit.getOnlinePlayers()) {
			if (message.contains(symbol + player.getName().toLowerCase())){
				vTarget = player;
				// Plays a sound effects
				if (toggleSound) {
					vTarget.playSound(vTarget.getLocation(), Sound.valueOf(soundName), soundVolume, soundPitch);
				}
				// Send a message
				if (toggleMessage) {
					vTarget.sendMessage(formatMsg(chatMessage));
				}
				// Action bar message
				if (toggleActionBar) {
                    player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(formatMsg(actionBarMessage)));
                }
				
				if (message.contains(symbol + player.getName().toLowerCase())) {
                    msg = msg.replaceAll(symbol + "(?i)" + player.getName(), colorize(color + symbol + player.getName() + "&r"));
				}
			}
		}	
		event.setMessage(msg);
	}
	
}
