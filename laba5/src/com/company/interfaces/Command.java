package com.company.interfaces;

import java.util.Locale;

public abstract class Command {

    public abstract void Run(String[] args);

    public String getName(){
        return getClass().getSimpleName();
    }

    @Override
    public boolean equals(Object obj) {
        Command command = (Command) obj;
        return getName().toLowerCase(Locale.ROOT).equals(command.getName());
    }

    @Override
    public String toString() {
        return getName();
    }
}
