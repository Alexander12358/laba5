package com.company.command;

import com.company.interfaces.Command;

public class Exit extends Command {
    @Override
    public void Run(String[] args) {
        System.exit(0);
    }
}
