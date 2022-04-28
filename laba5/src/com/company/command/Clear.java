package com.company.command;

import com.company.common.DragonList;
import com.company.interfaces.Command;

public class Clear extends Command {
    @Override
    public void Run(String[] args) {
        DragonList.getDragonsMap().clear();
        System.out.println("коллекция очищена");
    }
}
