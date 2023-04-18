package ru.geekbrains.kamenev.exceptions;

public class IncorrectDataTypeException extends RuntimeException{
    public IncorrectDataTypeException() {
    }

    public IncorrectDataTypeException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Получено значение неожиданного типа";
    }
}
