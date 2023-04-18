package ru.geekbrains.kamenev.controler;

import ru.geekbrains.kamenev.exceptions.EmptyDataException;
import ru.geekbrains.kamenev.view.Input;

public class Creator {
    private Input input = new Input();
    private static int id = 0;
    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Creator.id = id;
    }

    String createHead() {
        String head = input.Str("Введите заголовок");
        if (head.length()<1){
            return "Без заголовка";
        }
        return head;
    }

    String createBody() {
        String body = input.Str("Введите текст заметки");
        if (body.length()<1){
            throw new EmptyDataException();
        }
        return body;
    }


}
