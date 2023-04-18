package ru.geekbrains.kamenev.controler;

import ru.geekbrains.kamenev.model.Note;

public class Noter {
    Creator creator = new Creator();
    public Note createNote(){
        String head = creator.createHead();
        String body = creator.createBody();
        int id = creator.getId();
        Note note = new Note(id, head, body);
        creator.setId(++id);
        return note;
    }
}
