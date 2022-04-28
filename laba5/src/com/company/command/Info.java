package com.company.command;

import com.company.Main;
import com.company.common.Commands;
import com.company.interfaces.Command;

public class Info extends Command {
    @Override
    public void Run(String[] args) {
        System.out.println("дата создания: " + Main.time.toString());
        System.out.println("кол-во команд: " + Commands.getCommands().size());
        System.out.println("для информации о команде напишите: Help");
    }
}
