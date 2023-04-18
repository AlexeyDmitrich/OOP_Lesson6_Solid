package ru.geekbrains.kamenev.model;

import java.time.LocalDateTime;

public class Note {
    private int id;
    private String head;
    private String body;
    private LocalDateTime today = LocalDateTime.now();

    public Note(int id, String head, String body) {
        this.id = id;
        this.head = head;
        this.body = body;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
