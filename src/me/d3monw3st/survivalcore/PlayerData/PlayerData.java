package me.d3monw3st.survivalcore.PlayerData;

import java.util.UUID;

public class PlayerData {


    private UUID uuid;
    private int blocksPlaced;
    private long lastUsed;
    private boolean flying;


    public PlayerData(UUID uuid) {
        this.uuid = uuid;
        blocksPlaced = 0;
        lastUsed = 0;
    }




    /** Getters and Setters **/

    public void wipe() {
        blocksPlaced = 0;
    }

    public void setLastUsed(long lastUsed) {
        this.lastUsed = lastUsed;
    }

    public long getLastUsed() {
        return lastUsed;
    }

    public void setFlying(boolean flying) {
        this.flying = flying;
    }

    public boolean isFlying() {
        return flying;
    }

    public void setBlocksPlaced(int amt) {
        blocksPlaced = amt;
    }

    public int getBlocksPlaced() {
        return blocksPlaced;
    }
}
