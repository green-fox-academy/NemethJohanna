package com.greenfoxacademy.connectionwithmysql.service;

import com.greenfoxacademy.connectionwithmysql.model.Todo;
import com.greenfoxacademy.connectionwithmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private TodoRepository todoRepository;

    @Autowired
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public Iterable<Todo> getTodos() {
        return todoRepository.findAll();
    }

    public Iterable<Todo> getActiveTodos(Boolean isActive){
        if (isActive == null){
            return todoRepository.findAll();
        }
        return todoRepository.findAllByDone(isActive);
    }

    public Todo addTodo(Todo todo){
        return todoRepository.save(todo);
    }

    public Todo delete(long id) {
        return todoRepository.deleteById(id);
    }


//    public void addTodo(Todo todo) {
//        todoRepository.save(todo);
//    }

}
