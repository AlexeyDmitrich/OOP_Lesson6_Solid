package ru.geekbrains.kamenev.model;

import java.util.List;

public interface Saveble {
    List<String> readAllLines();

    void saveAllLines(List<String> lines);
}
