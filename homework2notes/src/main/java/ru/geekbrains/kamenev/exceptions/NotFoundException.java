package ru.geekbrains.kamenev.exceptions;

public class NotFoundException extends RuntimeException{
    public NotFoundException() {
    }

    public NotFoundException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Элемент не найден";
    }
}
