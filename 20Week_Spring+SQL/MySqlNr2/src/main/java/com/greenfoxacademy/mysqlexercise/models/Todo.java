package com.greenfoxacademy.mysqlexercise.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "todos")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private boolean isUrgent;
    private boolean isDone;
//    private Date date;
    @ManyToOne
    private Assignee assignee;

    public Todo(boolean done, String title, boolean urgent, Assignee assignee) {
        this.title = title;
        this.isUrgent = urgent;
        this.isDone = done;
        this.assignee = assignee;
    }

    public Todo(String title) {
        this.title = title;
        this.isUrgent = false;
        this.isDone = false;
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

    public boolean getIsUrgent() {
        return isUrgent;
    }

    public void setIsUrgent(boolean urgent) {
        isUrgent = urgent;
    }

    public boolean getIsDone() {
        return isDone;
    }

    public void setIsDone(boolean done) {
        isDone = done;
    }

    public Assignee getAssignee() {
        return assignee;
    }

    public void setAssignee(Assignee assignee) {
        this.assignee = assignee;
    }

}
