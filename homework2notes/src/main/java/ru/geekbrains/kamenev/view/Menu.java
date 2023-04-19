package ru.geekbrains.kamenev.view;

import ru.geekbrains.kamenev.controler.Noter;
import ru.geekbrains.kamenev.model.Note;

public class Menu {
    private final Noter noter = new Noter();
    private final Input input = new Input();

    public void run() {
        Commands comm = Commands.NONE;

        while (true) {
            try {
                String command = input.Str("Введите команду: ");
                comm = Commands.valueOf(command.toUpperCase());

                if (comm == Commands.EXIT) return;
                switch (comm) {
                    case CREATE:
                        create();
                        break;
                    case SHOW:
                        show();
                        break;
                    case FIND:
                        find();
                        break;
                    case EDIT:
                        // TODO: 18.04.2023 not implemented yet
                        break;
                    case DELETE:
                        delete();
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void create() {
        noter.addNote();
    }

    public void delete() {
        int id = input.Int("Укажите id для удаления");
        Note note = noter.findById(id);
        System.out.println(note.getPreview());
        String choise = input.Str("Точно удаляем? y/N\n");
        if (choise.equals("y")) {
            noter.deleteNote(id);
        }
    }

    public void find(){
        int id = input.Int("Укажите id для поиска:\n");
        Note note = noter.findById(id);
        System.out.println(note);
    }

    public void show(){
        noter.showAll();
    }
}
