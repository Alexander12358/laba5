package com.company.common;

import com.company.command.*;
import com.company.interfaces.Command;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Commands {
    private static List<Command> commands;
    private static List<String> last;

    static {
        Init();
    }

    public static List<String> getLast() {
        return last;
    }

    public static List<Command> getCommands() {
        return commands;
    }

    public static void Init(){
        commands = new ArrayList<>();
        last = new ArrayList<>();

        commands.add(new Help());
        commands.add(new Info());
        commands.add(new Clear());
        commands.add(new Exit());
        commands.add(new History());
        commands.add(new Show());
        commands.add(new Insert());
        commands.add(new Update());
        commands.add(new Remove_key());

        commands.add(new Filter_by_weight());
        commands.add(new Filter_then_greater_head());
        commands.add(new Remove_all_by_age());
        commands.add(new Remove_key());
        commands.add(new Replace_if_greater());
        commands.add(new Replace_if_lower());
        commands.add(new Save());

    }

    public static boolean ExecuteCommand(String commandName){
        if(commandName == null)
            return false;
        String[] args = commandName.split(",");
        for (Command command : commands){
            if(commandName.toLowerCase(Locale.ROOT).startsWith(command.getName().toLowerCase(Locale.ROOT))){
                if (last.size() == 6) {
                    last.remove(0);
                }
                last.add(args[0]);
                command.Run(args);
                return true;
            }
        }
        return false;
    }
}
