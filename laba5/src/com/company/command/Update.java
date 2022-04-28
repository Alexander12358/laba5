package com.company.command;

import com.company.common.DragonList;
import com.company.common.Input;
import com.company.interfaces.Command;

public class Update extends Command {
    @Override
    public void Run(String[] args) {
        if(args.length > 1){
            int id = Integer.parseInt(args[1]);
            for (String key : DragonList.getDragonsKeys()){
                if(DragonList.get(key).equals(id)){
                    DragonList.getDragonsMap().replace(key, Input.InputDragon());
                    System.out.println("дракон изменен");
                    return;
                }
            }
            System.out.println("дракона не существует");
        }
        else{
            System.out.println("кол-во аргументов неверное");
        }
    }
}
