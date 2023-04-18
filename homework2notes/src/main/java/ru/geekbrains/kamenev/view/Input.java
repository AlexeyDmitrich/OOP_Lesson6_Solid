package ru.geekbrains.kamenev.view;

import ru.geekbrains.kamenev.exceptions.IncorrectDataTypeException;

import java.util.Scanner;

public class Input {
    private static Scanner input = new Scanner(System.in);
    public int Int (String info){
        System.out.println(info);
        Integer value = null;
        try {
            value = input.nextInt();
        } catch (RuntimeException e){
            throw new IncorrectDataTypeException();
        }
        return value;
    }

    public String Str(String info){
        System.out.println(info);
        String value = input.next();
        return value;
    }
}
