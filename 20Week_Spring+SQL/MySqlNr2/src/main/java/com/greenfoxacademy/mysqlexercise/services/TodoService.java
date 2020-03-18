package com.greenfoxacademy.mysqlexercise.services;

import com.greenfoxacademy.mysqlexercise.models.Assignee;
import com.greenfoxacademy.mysqlexercise.models.Todo;
import com.greenfoxacademy.mysqlexercise.repositories.AssigneeRepository;
import com.greenfoxacademy.mysqlexercise.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

@Service
public class TodoService {

    private TodoRepository todoRepository;
    private AssigneeRepository assigneeRepository;

    @Autowired
    public TodoService(TodoRepository todoRepository, AssigneeRepository assigneeRepository) {
        this.assigneeRepository = assigneeRepository;
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

    public void save(Todo todo, String name) {
        Optional<Assignee> assignee = assigneeRepository.findByName(name);
        todo.setAssignee(assignee);
        todoRepository.save(todo);
    }

    public Todo findTodoById(Long id) {
        Optional<Todo> optional = todoRepository.findById(id);
        return optional.orElse(null);
    }

    public Iterable<Todo> search(String search, String key) throws ParseException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        if (key.equals("title")){
            return todoRepository.findByTitleContains(search);
        } else if (key.equals("dueDate")){
            LocalDate dueDate = LocalDate.parse(search, formatter);
            return todoRepository.findByDueDate(dueDate);
        } else if (key.equals("creationDate")){
            LocalDate creationDate = LocalDate.parse(search, formatter);
            return todoRepository.findByCreationDate(creationDate);
        } else if (key.equals("name")){
            return todoRepository.findByAssignee(assigneeRepository.findByName(search));
        } else {
            return null;
        }
    }

    public Iterable<Todo> findByAssignee(Optional<Assignee> name) {
        return todoRepository.findByAssignee(name);
    }

}