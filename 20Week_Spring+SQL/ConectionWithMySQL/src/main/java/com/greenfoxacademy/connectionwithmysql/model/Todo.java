package com.greenfoxacademy.connectionwithmysql.model;

import javax.persistence.*;

@Entity
@Table(name = "todos")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private boolean urgent;
    private boolean done;

    public Todo(String title) {
        this.title = title;
        this.urgent = false;
        this.done = false;
    }

    public Todo() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isUrgent() {
        return urgent;
    }

    public void setUrgent(boolean urgent) {
        this.urgent = urgent;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

//    @Override
//    public String toString() {
//        return "Todo{" +
//                "id=" + id +
//                ", title='" + title + '\'' +
//                ", urgent=" + urgent +
//                ", done=" + done +
//                '}';
//    }
}
