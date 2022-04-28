package com.company;

import com.company.common.Commands;
import com.company.common.DragonList;
import com.company.common.console.ConsoleReader;
import com.company.model.Coordinates;
import com.company.model.Dragon;
import com.company.model.DragonHead;
import com.company.model.DragonType;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.time.LocalDateTime;

public class Main {
    public static LocalDateTime time = LocalDateTime.now();
    public static Long IdCount = (long)0;


    public static void main(String[] args) {

        if(args.length > 0) {
            InputStreamReader reader;
            try {
                reader = new InputStreamReader(new FileInputStream(args[0]));
                StringBuilder builder = new StringBuilder();
                int b = reader.read();
                while (b != -1) {
                    builder.append((char) b);
                    b = reader.read();
                }
                for (String line : builder.toString().split("\n")) {
                    String[] items = line.split(",");
                    String key = items[0];
                    Long id = Long.parseLong(items[1]);
                    String name = items[2];
                    long x = Long.parseLong(items[3]);
                    Double y = Double.parseDouble(items[4]);
                    LocalDateTime time = LocalDateTime.parse(items[5]);
                    int age = Integer.parseInt(items[6]);
                    Float weight = Float.parseFloat(items[7]);
                    boolean speaking = Boolean.parseBoolean(items[8]);
                    Integer size = Integer.parseInt(items[9]);
                    DragonType type = DragonType.valueOf(items[10]);
                    DragonList.Add(key, new Dragon(id, name, new Coordinates(x, y), time, age, weight, speaking, new DragonHead(size), type));
                    IdCount++;
                }
            } catch (Exception e) {
                System.out.println("ошибка: " + e.getMessage());
            }
        }
        else{
            System.out.println("нет аргумента");
        }

        String command;
        while (true){
            System.out.println("введите команду");
            command = ConsoleReader.getLine();
            if(!Commands.ExecuteCommand(command)){
                System.out.println("команды " + command + " не существует");
            }
        }
    }
}
