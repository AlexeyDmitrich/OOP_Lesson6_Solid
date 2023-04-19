package ru.geekbrains.kamenev.model;

public class NoteMapper {
    public String map (Note note){
        return String.format("%s,%s,%s,%s", note.getId(), note.getToday(), note.getHead(), note.getBody());
    }
}
