package com.company.command;

import com.company.common.Commands;
import com.company.common.DragonList;
import com.company.common.Input;
import com.company.common.console.ConsoleReader;
import com.company.interfaces.Command;

public class Remove_all_by_age extends Command {
    @Override
    public void Run(String[] args) {
        if(args.length > 1) {
            if(ConsoleReader.isNumber(args[1])) {
                int age = Integer.parseInt(args[1]);
                int count = 0;
                for (String key : DragonList.getDragonsKeys()) {
                    if (DragonList.get(key).getAge().equals(age)) {
                        DragonList.Remove(key);
                        count++;
                    }
                }
                System.out.println("удалено: " + count + " драконов");
            }
            else{
                System.out.println("введеный аргумент не число");
            }
        }
        else{
            System.out.println("недостаточно аргументов");
        }
    }
}
