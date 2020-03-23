package me.d3monw3st.survivalcore;

import me.d3monw3st.survivalcore.PlayerData.PlayerData;
import me.d3monw3st.survivalcore.PlayerData.PlayerDataManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandCreative implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        Player player = (Player) commandSender;

        PlayerData pdata = PlayerDataManager.getPlayerData(player.getUniqueId());

        if (pdata == null) {
            PlayerDataManager.createPlayerData(player.getUniqueId());
            return false;
        }

        if (pdata != null) {

            if (pdata.isFlying() == false && player.isFlying() == false) {
                pdata.setFlying(true);
                pdata.setLastUsed(System.currentTimeMillis());
                player.setFlying(true);
            } else if (pdata.isFlying() && player.isFlying()) {
                pdata.setFlying(false);
                player.setFlying(false);
                pdata.setLastUsed(System.currentTimeMillis());
            }
        }



        return false;
    }



}
