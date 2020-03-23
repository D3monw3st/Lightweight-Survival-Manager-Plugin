package me.d3monw3st.survivalcore;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class PreCommand  implements Listener {


        @EventHandler(priority = EventPriority.LOWEST)
        public void onCommandPreProcess(PlayerCommandPreprocessEvent event) {
            if (event.getMessage().toLowerCase().startsWith("/gamemode") || event.getMessage().toLowerCase().startsWith("/minecraft:gamemode")) {
                event.setCancelled(true);
                event.getPlayer().sendMessage("§8§l(§4§l!§8§l) §7Cannot switch gamemodes - type /fly to build.");
            }


        }




}
