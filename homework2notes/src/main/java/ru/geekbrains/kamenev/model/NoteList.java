package ru.geekbrains.kamenev.model;

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
        return null;
        // TODO: 18.04.2023 вернуть исключение
    }
    public void addNote(T note){
        notes.add(note);
    }
    public void delNote(T note){
        notes.remove(note);
    }
}
