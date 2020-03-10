package com.greenfoxacademy.mysql.services;


import com.greenfoxacademy.mysql.models.Todo;
import com.greenfoxacademy.mysql.repositories.TodoRepository;
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

    public Iterable<Todo> getActiveTodos(Boolean isActive) {
        if (isActive == null) {
            return todoRepository.findAll();
        }
        return todoRepository.findAllByIsDone(isActive);
    }

    public Todo addTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    public void delete(long id) {
        todoRepository.deleteById(id);
    }

    public void save(Todo todo) {
        todoRepository.save(todo);
    }

    public Todo findTodoById(Long id) {
        Optional<Todo> optional = todoRepository.findById(id);

//        if (optional.isPresent()){
//            return optional.get();
//        } else {
//            return null;
//        }
        return optional.orElse(null);
    }

}