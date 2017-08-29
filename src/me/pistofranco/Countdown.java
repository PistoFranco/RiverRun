package me.pistofranco;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.scheduler.BukkitRunnable;

public class Countdown extends BukkitRunnable {

    Core plugin = Core.plugin;

    int time = 20;
    @Override
    public void run() {
        if(Bukkit.getOnlinePlayers().size() >= 1){
            GameState.setState(GameState.STARTING);
            if(time % 10 == 0){
                Bukkit.broadcastMessage(ChatColor.GRAY+""+ChatColor.BOLD+"["+ChatColor.YELLOW+""+ChatColor.BOLD+"RiverRun"+ChatColor.GRAY+""+ChatColor.BOLD+"] "+ChatColor.YELLOW+"The game starts in: "+ChatColor.AQUA+ time);
            }
            if(time <10 && time >= 1){
                Bukkit.broadcastMessage(ChatColor.GRAY+""+ChatColor.BOLD+"["+ChatColor.YELLOW+""+ChatColor.BOLD+"RiverRun"+ChatColor.GRAY+""+ChatColor.BOLD+"] "+ChatColor.YELLOW+"The game starts in: "+ChatColor.AQUA+ time);
            }
            if(time == 0){
                Bukkit.broadcastMessage(ChatColor.GRAY+""+ChatColor.BOLD+"["+ChatColor.YELLOW+""+ChatColor.BOLD+"RiverRun"+ChatColor.GRAY+""+ChatColor.BOLD+"] "+ChatColor.YELLOW+"Starting the game!");
                plugin.stopCountdown();
                GameState.setState(GameState.IN_GAME);
            }
            time--;
        }else {
            plugin.stopCountdown();
            plugin.startCountdown();
            GameState.setState(GameState.WAITING);
        }
    }
}