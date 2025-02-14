package ru.geekbrains.kamenev.model;

import ru.geekbrains.kamenev.exceptions.NotFoundException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NoteList<T extends Note> implements Iterable<T>{
    List<T> notes = new ArrayList<T>();

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int counter = 0;
            @Override
            public boolean hasNext() {
                if (counter<notes.size()) return true;
                return false;
            }

            @Override
            public T next() {
                return notes.get(counter++);
            }
        };
    }

    public T findNote(int id){
        for (T note:notes) {
            if (note.getId()==id){
                return note;
            }
        }
        throw new NotFoundException();
    }
    public void addNote(T note){
        notes.add(note);
    }
    public void delNote(T note){
        notes.remove(note);
    }
}
