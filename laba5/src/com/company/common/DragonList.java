package com.company.common;

import com.company.model.Dragon;
import java.util.Collection;
import java.util.TreeMap;

public class DragonList{
    private static TreeMap<String, Dragon> dragons = new TreeMap<>();

    public static TreeMap<String, Dragon> getDragonsMap(){
        return dragons;
    }

    public static void setDragons(TreeMap<String, Dragon> dragons) {
        DragonList.dragons = dragons;
    }

    public static Dragon get(String key) {
        return dragons.get(key);
    }

    public static Collection<String> getDragonsKeys(){
        return dragons.keySet();
    }

    public static void Add(String key, Dragon dragon){
        dragons.put(key, dragon);
    }

    public static boolean Remove(String key){
        return dragons.remove(key) != null;
    }
}
