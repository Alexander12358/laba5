package com.company.common.console;

import com.company.model.Dragon;
import com.company.model.DragonType;

import java.util.Arrays;
import java.util.Scanner;

public class ConsoleReader {
    private static final Scanner scanner = new Scanner(System.in);

    public static boolean isNumber(String str) {
        if (str == null || str.isEmpty()) return false;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i)) && str.charAt(i) != '-') return false;
        }
        return true;
    }

    public static boolean isDoubleNumber(String str){
        if (str == null || str.isEmpty()) return false;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i)) && str.charAt(i) != ',' && str.charAt(i) != '-' )return false;
        }
        return true;
    }

    public static String getLine(){
        String line = scanner.nextLine();
        return line.equals("") ? null : line;
    }

    public static void ErrorMessage(){
        System.out.println("данные введены неверно. Повторите ввод");
    }


    public static Integer getInt(){
        String text = getLine();
        while (!isNumber(text)){
            text = getLine();
            if(text == null){
                return null;
            }
            ErrorMessage();
        }
        return Integer.parseInt(text);
    }

    public static Double getDouble(){
        String text = getLine();
        while (!isDoubleNumber(text)){
            text = getLine();
            if(text == null){
                return null;
            }
            ErrorMessage();
        }
        return Double.parseDouble(text);
    }

    public static DragonType getType(){
        DragonType dragonType = null;
        System.out.println(Arrays.toString(DragonType.values()));
        while (dragonType == null){
            try {
                String line = getLine();
                if(line == null){
                    return null;
                }
                dragonType = DragonType.valueOf(line);
            }
            catch (Exception e){
                ErrorMessage();
            }
        }
        return dragonType;
    }

    public static Float getFloat(){
        String text = getLine();
        while (!isDoubleNumber(text)){
            text = getLine();
            if(text == null){
                return null;
            }
            ErrorMessage();
        }
        return Float.parseFloat(text);
    }


    public static long getLong(){
        String text = getLine();
        while (!isNumber(text)){
            text = getLine();
            ErrorMessage();
        }
        return Long.parseLong(text);
    }
}
