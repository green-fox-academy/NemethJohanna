package com.greenfoxacademy.mysqlexercise.controllers;

import com.greenfoxacademy.mysqlexercise.models.Assignee;
import com.greenfoxacademy.mysqlexercise.models.Todo;
import com.greenfoxacademy.mysqlexercise.services.AssigneeService;
import com.greenfoxacademy.mysqlexercise.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;

@Controller
@RequestMapping("/todo")
public class TodoController {

    private TodoService todoService;
    private AssigneeService assigneeService;

    @Autowired
    public TodoController(TodoService todoService, AssigneeService assigneeService) {
        this.assigneeService = assigneeService;
        this.todoService = todoService;
    }

    @GetMapping(value = {"/", ""})
    public String list(Model model, @RequestParam(required = false) Boolean isActive,
                       @RequestParam(required = false, name="search") String search,
                       @RequestParam(required = false, name="key") String key) throws ParseException {
        model.addAttribute("todos", todoService.getActiveTodos(isActive));
        if (search != null && key != null) {
            model.addAttribute("todos", todoService.search(search, key));
        }
        return "todoList";
    }

    @GetMapping(path = "/add")
    public String getAddForm() {
        return "addTodo";
    }

    @PostMapping(path = "/add")
    public String addTodo(Model model, @ModelAttribute Todo todo) {
        model.addAttribute("add", todoService.addTodo(todo));
        return "redirect:/todo/";
    }

    @PostMapping(path = "/{id}/delete")
    public String deleteTodo(@PathVariable long id) {
        todoService.delete(id);
        return "redirect:/todo";
    }

    @GetMapping(path = "/{id}/edit")
    public String renderEditPage(@PathVariable Long id, Model model) {
        model.addAttribute("todo", todoService.findTodoById(id));
        model.addAttribute("assignees", assigneeService.list());
        return "editTodo";
    }

    @PostMapping(path = "/{id}/edit")
    public String editTodo(@ModelAttribute("todo") Todo todo, String name) {
        todoService.save(todo, name);
        return "redirect:/todo";
    }

    @GetMapping(path = "/{id}")
    public String renderListPage(@PathVariable Long id, Model model, @ModelAttribute Todo todo){
        model.addAttribute("assignee", todoService.findTodoById(id).getAssignee());
        return "assigneedTodos";
    }

}
