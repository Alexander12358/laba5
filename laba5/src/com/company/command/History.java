package com.company.command;

import com.company.common.Commands;
import com.company.interfaces.Command;

public class History extends Command {
    @Override
    public void Run(String[] args) {
        for (String str : Commands.getLast()){
            System.out.println(str);
        }
    }
}
