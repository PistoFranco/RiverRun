package me.pistofranco;

import org.bukkit.Bukkit;

public enum GameState {
    IN_GAME,STARTING,WAITING;

    private static GameState current;

    public static GameState getState(){
        return current;
    }

    public static boolean isState(GameState state){
        if(state == current){
            return true;
        }else return false;
    }

    public static void setState(GameState state){
        current = state;
    }
}
