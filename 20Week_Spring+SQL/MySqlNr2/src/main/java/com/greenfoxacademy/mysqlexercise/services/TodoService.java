package com.greenfoxacademy.mysqlexercise.services;

import com.greenfoxacademy.mysqlexercise.models.Assignee;
import com.greenfoxacademy.mysqlexercise.models.Todo;
import com.greenfoxacademy.mysqlexercise.repositories.AssigneeRepository;
import com.greenfoxacademy.mysqlexercise.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TodoService {

    private TodoRepository todoRepository;
    private AssigneeRepository assigneeRepository;

    @Autowired
    public TodoService(TodoRepository todoRepository, AssigneeRepository assigneeRepository) {
        this.todoRepository = todoRepository;
        this.assigneeRepository = assigneeRepository;
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

    public Iterable<Todo> searchTodo(String title){
        return todoRepository.findByTitleContains(title);
    }

    public Iterable<Todo> findAllByAssignee (Assignee name){
        return todoRepository.findAllByAssignee(name);
    }

}