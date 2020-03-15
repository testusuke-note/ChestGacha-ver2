package net.testusuke.chestgacha;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.HashMap;

public class PlayerStatus {

    //  PlayerStatus
    private static HashMap<Player, Boolean> PlayerStatus = new HashMap<>();

    //  LoadPlayer
    public static void loadPlayer() {
        for(Player player : Bukkit.getServer().getOnlinePlayers()) {
            savePlayerStatus(player);
        }
    }

    //  CleanPlayer
    public static void clenPlayer() {
        PlayerStatus.clear();
        Bukkit.getLogger().info("CleanPlayer");
    }

    //  SavePlayerStatus
    public static void savePlayerStatus(Player p) {

        PlayerStatus.put(p,false);

        Bukkit.getLogger().info("SavePlayerStatus: add " + p.getName());
    }

    //  RemovePlayerStatus
    public static void removePlayerStatus(Player p){

        PlayerStatus.remove(p);

        Bukkit.getLogger().info("RemovePlayerStatus: remove " + p.getName());
    }

    //  getStatus
    public static Boolean getPlayerStatus(Player player){
        boolean b;
        if(!PlayerStatus.containsKey(player)){
            return false;
        }
        b = PlayerStatus.get(player);
        return b;
    }

    //  setStatus
    public static void setPlayerStatus(Player player,boolean b){
        if(!PlayerStatus.containsKey(player)){
            PlayerStatus.put(player,b);
            return;
        }
        PlayerStatus.put(player,b);
    }

}
