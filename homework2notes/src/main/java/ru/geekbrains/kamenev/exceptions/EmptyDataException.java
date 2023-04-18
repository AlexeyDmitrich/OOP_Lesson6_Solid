package ru.geekbrains.kamenev.exceptions;

public class EmptyDataException extends RuntimeException{
    public EmptyDataException() {
    }

    public EmptyDataException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Пустая заметка";
    }
}
