package com.company.command;

import com.company.common.DragonList;
import com.company.common.Input;
import com.company.interfaces.Command;
import com.company.model.Dragon;

public class Replace_if_greater extends Command {
    @Override
    public void Run(String[] args) {
        if(args.length > 1){
            Dragon Old = DragonList.get(args[1]);
            Dragon New = Input.InputDragon();
            if(New.compareTo(Old) > 0){
                DragonList.getDragonsMap().replace(args[1], New);
                System.out.println("дракон заменен");
            }
            else{
                System.out.println("дракон не зменен");
            }
        }
        else{
            System.out.println("недостаточно аргументов");
        }
    }
}
