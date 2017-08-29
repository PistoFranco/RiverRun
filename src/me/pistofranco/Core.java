package me.pistofranco;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Core extends JavaPlugin{

    public static Core plugin;
    int taskID;

    public void onEnable(){
        plugin = this;
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN+"RiverRun plugin is now enabled!");
        GameState.setState(GameState.WAITING);
        startCountdown();
    }

    public void onDisable(){
        plugin = null;
        getServer().getConsoleSender().sendMessage(ChatColor.RED+"RiverRun plugin is now disabled!");
    }
    public void startCountdown(){
        taskID = getServer().getScheduler().scheduleSyncRepeatingTask(this,new Countdown(),20L,20L);
    }
    public void stopCountdown(){
        getServer().getScheduler().cancelTask(taskID);
    }


}
