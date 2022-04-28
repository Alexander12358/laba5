package com.company.command;

import com.company.common.DragonList;
import com.company.common.Input;
import com.company.interfaces.Command;

public class Insert extends Command {
    @Override
    public void Run(String[] args) {
        if(args.length > 1){
            DragonList.Add(args[1], Input.InputDragon());
            System.out.println("дракон успешно создан");
        }
        else
            System.out.println("неверное кол-во аргументов");
    }
}
