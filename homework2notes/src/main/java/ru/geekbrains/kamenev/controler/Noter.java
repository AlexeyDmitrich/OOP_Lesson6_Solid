package ru.geekbrains.kamenev.controler;

import ru.geekbrains.kamenev.model.Note;
import ru.geekbrains.kamenev.model.NoteList;
import ru.geekbrains.kamenev.model.NoteMapper;
import ru.geekbrains.kamenev.model.Saver;

import java.util.ArrayList;
import java.util.List;

public class Noter {
    private final Creator creator = new Creator();
    private final NoteList<Note> notes = new NoteList<>();
    private final NoteMapper NoteMapper = new NoteMapper();

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

    private void saveUser(List<Note> notes) {
        List<String> lines = new ArrayList<>();

        for (Note item : notes) {
            lines.add(NoteMapper.map(item));
        }
        Saver.saveAllLines(lines);
    }
}
