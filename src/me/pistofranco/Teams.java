package me.pistofranco;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Teams {
    List<UUID> red = new ArrayList<>();
    List<UUID> blue = new ArrayList<>();

    public void addRed(UUID uuid){
        if(blue.contains(uuid)){
            blue.remove(uuid);
            red.add(uuid);
        }else{
            red.add(uuid);
        }
    }

    public void addBlue(UUID uuid){
        if(red.contains(uuid)){
            red.remove(uuid);
            blue.add(uuid);
        }else{
            blue.add(uuid);
        }
    }
    public void removeBlue(UUID uuid){
        if(blue.contains(uuid)) {
            blue.remove(uuid);
        }else return;
    }
    public void removeRed(UUID uuid){
        if(red.contains(uuid)) {
            red.remove(uuid);
        }else return;
    }

    public boolean isRed(UUID uuid){
        if(red.contains(uuid)){
            return true;
        }else return false;
    }


}
