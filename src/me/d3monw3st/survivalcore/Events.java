package me.d3monw3st.survivalcore;

import me.d3monw3st.survivalcore.PlayerData.PlayerData;
import me.d3monw3st.survivalcore.PlayerData.PlayerDataManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerLoginEvent;

public class Events implements Listener {

    @EventHandler
    public void onLogin(PlayerLoginEvent event) {
        Player player = event.getPlayer();
        PlayerData pdata = PlayerDataManager.getPlayerData(player.getUniqueId());

        if (pdata == null) {
            PlayerDataManager.createPlayerData(player.getUniqueId());
        }

    }

    @EventHandler
    public void onPlayerMessage(AsyncPlayerChatEvent event) {

        event.setFormat("%s" + "§7:§f " + "%s");

    }


}
