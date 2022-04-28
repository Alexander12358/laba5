package com.company.common;

import com.company.common.console.ConsoleReader;
import com.company.model.Coordinates;
import com.company.model.Dragon;
import com.company.model.DragonHead;
import com.company.model.DragonType;

public class Input {
    public static Dragon InputDragon(){
        System.out.println("вводится дракон");

        System.out.println("введеите имя");
        String name = ConsoleReader.getLine();
        while (name == null){
            System.out.println("неверно. Повторите ввод");
            name = ConsoleReader.getLine();
        }

        Coordinates coordinates = getCoordinates();


        System.out.println("введеите возраст");
        Integer age = ConsoleReader.getInt();
        if(age != null) {
            while (age <= 0) {
                System.out.println("неверно. Повторите ввод");
                age = ConsoleReader.getInt();
                if(age == null) break;
            }
        }


        System.out.println("введеите вес");
        Float weight = ConsoleReader.getFloat();
        if(weight != null) {
            while (weight <= 0) {
                System.out.println("неверно. Повторите ввод");
                weight = ConsoleReader.getFloat();
                if(weight == null) break;
            }
        }

        System.out.println("введеите разговор(true, false)");
        boolean speaking = Boolean.parseBoolean(ConsoleReader.getLine());

        System.out.println("введеите тип");
        DragonType type = ConsoleReader.getType();

        DragonHead head = getHead();

        return new Dragon(name,coordinates,age,weight,speaking, head, type);
    }

    public static DragonHead getHead(){
        System.out.println("вводится голова дракона");
        System.out.println("введеите размер");
        return new DragonHead(ConsoleReader.getInt());
    }

    public static Coordinates getCoordinates(){
        System.out.println("вводятся координаты");

        System.out.println("введеите x");
        long x = ConsoleReader.getLong();
        while (x < -259){
            System.out.println("неверно. Повторите ввод");
            x = ConsoleReader.getLong();
        }

        System.out.println("введеите y");
        Double y = ConsoleReader.getDouble();
        while (y >= 664){
            System.out.println("неверно. Повторите ввод");
            y = ConsoleReader.getDouble();
        }
        return new Coordinates(x, y);
    }
}
