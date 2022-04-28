package com.company.command;

import com.company.common.Commands;
import com.company.interfaces.Command;

public class Help extends Command {

    @Override
    public void Run(String[] args) {
        for (Command command : Commands.getCommands()){
            System.out.println(command.toString());
        }
    }
}
