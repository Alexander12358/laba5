package com.company.command;

import com.company.common.DragonList;
import com.company.interfaces.Command;

public class Show extends Command {
    @Override
    public void Run(String[] args) {
        for (String key : DragonList.getDragonsKeys()){
            System.out.println(DragonList.get(key).toString());
        }
    }
}
