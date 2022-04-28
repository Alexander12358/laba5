package com.company.command;

import com.company.common.DragonList;
import com.company.interfaces.Command;

public class Remove_key extends Command {
    @Override
    public void Run(String[] args) {
        if(args.length > 1){
            if(DragonList.Remove(args[1])){
                System.out.println("дракон успешно удален");
            }
            else{
                System.out.println("дракона не существует");
            }
        }
        else{
            System.out.println("кол-во аргументов неверно");
        }
    }

}
