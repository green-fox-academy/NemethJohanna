package com.greenfoxacademy.connectionwithmysql.service;

import com.greenfoxacademy.connectionwithmysql.model.Todo;
import com.greenfoxacademy.connectionwithmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

    public Iterable<Todo> getActiveTodos(Boolean isActive) {
        if (isActive == null) {
            return todoRepository.findAll();
        }
        return todoRepository.findAllByDone(isActive);
    }

    public Todo addTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    public void delete(long id) {
        todoRepository.deleteById(id);
    }

    public void edit(Todo todo) {
//        for (Todo todo :Todo)
    }

//    public Todo findTodoById(Long id) {
//        Optional<Todo> findById = todoRepository.findById(id);
//        return findOneById.
//    }
}
