package ru.geekbrains.kamenev.controler;

import ru.geekbrains.kamenev.model.Note;
import ru.geekbrains.kamenev.model.NoteList;

public class Noter {
    private Creator creator = new Creator();
    private NoteList<Note> notes = new NoteList<>();
    public void addNote(){
        notes.addNote(createNote());
    }
    public Note createNote(){
        String head = creator.createHead();
        String body = creator.createBody();
        int id = creator.getId();
        Note note = new Note(id, head, body);
        creator.setId(++id);
        return note;
    }

    public void deleteNote(int id){
        notes.delNote(notes.findNote(id));
    }

    public Note findById(int id){
        Note note = notes.findNote(id);
        return note;
    }

    public void showAll(){
        for (Note note:notes) {
            System.out.println(note.getPreview());
        }
    }
}
