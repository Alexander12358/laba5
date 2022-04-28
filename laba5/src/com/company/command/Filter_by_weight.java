package com.company.command;

import com.company.common.DragonList;
import com.company.common.console.ConsoleReader;
import com.company.interfaces.Command;
import com.company.model.Dragon;

public class Filter_by_weight extends Command {
    @Override
    public void Run(String[] args) {
        if(args.length > 1) {
            if(ConsoleReader.isDoubleNumber(args[1])) {
                Float weight = Float.parseFloat(args[1]);
                for (String key : DragonList.getDragonsKeys()) {
                    Dragon curr = DragonList.get(key);
                    if (curr.getWeight().equals(weight)) {
                        System.out.println(curr);
                    }
                }
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
