package me.d3monw3st.survivalcore;

import me.d3monw3st.survivalcore.PlayerData.PlayerData;
import me.d3monw3st.survivalcore.PlayerData.PlayerDataManager;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    private static Main plugin;

    @Override
    public void onEnable() {

        plugin = this;

        registerEvents();
        registerCommands();
        registerRunnable();
        registerPlayerData();


    }



    @Override
    public void onDisable() {



    }


    public void registerPlayerData() {
        for (Player player: Bukkit.getOnlinePlayers()) {
            PlayerDataManager.createPlayerData(player.getUniqueId());


        }
    }


    public void registerEvents() {
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new PreCommand(), this);

    }


    public void registerCommands() {
        getCommand("fly").setExecutor(new CommandCreative());
    }

    public void registerRunnable() {
        new DeFlyRunnable().runTaskTimer(this, 0L, 20L);

    }





}



