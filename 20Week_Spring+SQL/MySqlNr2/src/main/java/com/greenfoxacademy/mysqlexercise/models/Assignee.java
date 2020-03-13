package com.greenfoxacademy.mysqlexercise.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "assignees")
public class Assignee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String name;
    private String email;
//    private List<Todo> todoList;

    public Assignee() {
    }

    public Assignee(String name, String email) {
        this.name = name;
        this.email = email;
//        this.todoList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//    public List<Todo> getTodoList() {
//        return todoList;
//    }
//
//    public void setTodo (Todo todo){
//        this.todoList.add(todo);
//        todo.setAssignee(this);
//    }
//
//    public void setTodoList(List<Todo> todoList) {
//        this.todoList = todoList;
//    }
}
