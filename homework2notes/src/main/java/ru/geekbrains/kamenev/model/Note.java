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

    public String getPreview(){
        StringBuilder res = new StringBuilder();
        res
                .append(id)
                .append("\n")
                .append(today)
                .append("\n")
                .append(head)
                .append("\n")
                .append(body.substring(0,body.length()/5))
                .append("\n");
        return res.toString();
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getToday() {
        return today.toString();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res
                .append(id)
                .append("\n")
                .append(today)
                .append("\n")
                .append(head)
                .append("\n")
                .append(body)
                .append("\n");
        return res.toString();
    }
}
