package me.d3monw3st.survivalcore;

import me.d3monw3st.survivalcore.PlayerData.PlayerData;
import me.d3monw3st.survivalcore.PlayerData.PlayerDataManager;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class DeFlyRunnable extends BukkitRunnable {
    @Override
    public void run() {

        for (Player player : Bukkit.getOnlinePlayers()) {

            PlayerData pdata = PlayerDataManager.getPlayerData(player.getUniqueId());

            if (pdata != null) {

                    if (player.isFlying() && pdata.isFlying() && (System.currentTimeMillis() - pdata.getLastUsed())/60000 > 5) {
                        pdata.setFlying(false);
                        pdata.setLastUsed(System.currentTimeMillis());
                        player.setFlying(false);
                     }
            }
        }
    }
}
