package com.company.command;

import com.company.common.DragonList;
import com.company.interfaces.Command;
import com.company.model.Dragon;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Save extends Command {
    @Override
    public void Run(String[] args) {
        if(args.length > 1) {
            OutputStreamWriter writer;
            try {
                writer = new OutputStreamWriter(new FileOutputStream(args[1]));
                for (String key : DragonList.getDragonsKeys()) {
                    Dragon dragon = DragonList.get(key);
                    String k = key + "," + dragon.getId() + "," + dragon.getName() + "," + dragon.getCoordinates().getX() + ","
                            + dragon.getCoordinates().getY() + "," + dragon.getCreationDate().toString() + "," + dragon.getAge() +
                            "," + dragon.getWeight() + "," + dragon.isSpeaking() + "," + dragon.getHead().getSize() + ","
                            + dragon.getType() + "\n";
                    writer.write(k, 0, k.length());
                }
                writer.close();
            } catch (Exception e) {
                System.out.println("ошибка:" + e.getMessage());
            }
        }
        else{
            System.out.println("недостаточно аргументов");
        }
    }
}
