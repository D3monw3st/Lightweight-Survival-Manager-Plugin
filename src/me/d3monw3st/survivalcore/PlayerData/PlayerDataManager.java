package me.d3monw3st.survivalcore.PlayerData;

import org.bukkit.Bukkit;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;

public class PlayerDataManager {

    private static Map<UUID, PlayerData> playerData = new HashMap<>();

    public static boolean hasPlayerData(UUID uuid) {
        return playerData.containsKey(uuid);
    }

    public static PlayerData createPlayerData(UUID uuid) {
        if (playerData.containsKey(uuid)) {
            Bukkit.getConsoleSender().sendMessage(String.format("Tried to create player data for uuid that already exists: %s", uuid.toString()));
            return playerData.get(uuid);
        }
        Bukkit.getPlayer(uuid).setAllowFlight(true);
        //Console.log(String.format("Created player data for uuid %s", uuid.toString()));
        return playerData.put(uuid, new PlayerData(uuid));
    }

    public static PlayerData getPlayerData(UUID uuid) {
        return playerData.get(uuid);
    }

}
