package ru.geekbrains.kamenev.view;

import ru.geekbrains.kamenev.controler.Noter;

public class Menu {
    private Noter noter = new Noter();

    public void run() {
        Commands comm = Commands.NONE;

        while (true) {
            try {
                String command = new Input().Str("Введите команду: ");
                comm = Commands.valueOf(command.toUpperCase());

                if (comm == Commands.EXIT) return;
                switch (comm) {
                    case CREATE:
                        create();
                        break;
                    case SHOW:
                        // TODO: 18.04.2023 not implemented yet
                        break;
                    case FIND:
                        // TODO: 18.04.2023 not implemented yet
                        break;
                    case EDIT:
                        // TODO: 18.04.2023 not implemented yet
                        break;
                    case DELETE:
                        // TODO: 18.04.2023 not implemented yet
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void create() {
        noter.createNote();
    }
}
