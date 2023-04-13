package solid;

import solid.repository.JsonSaver;
import solid.srp.models.Order;
import solid.srp.views.ConsoleInput;

public class Main {
    public static void main(String[] args) {
        ConsoleInput input = new ConsoleInput();
        System.out.println("Введите заказ:");
        Order order = input.inputFromConsole();
        JsonSaver saver = new JsonSaver();
        saver.saveToJson(order);
    }
}
