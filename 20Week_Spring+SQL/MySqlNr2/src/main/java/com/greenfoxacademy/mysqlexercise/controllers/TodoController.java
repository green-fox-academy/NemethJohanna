package com.greenfoxacademy.mysqlexercise.controllers;

import com.greenfoxacademy.mysqlexercise.models.Todo;
import com.greenfoxacademy.mysqlexercise.services.AssigneeService;
import com.greenfoxacademy.mysqlexercise.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    public String list(Model model, @RequestParam(required = false) Boolean isActive, @RequestParam(required = false) String title) {
        model.addAttribute("todos", todoService.getActiveTodos(isActive));
        if (title != null) {
            model.addAttribute("todos", todoService.searchTodo(title));
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
    public String editTodo(@ModelAttribute("todo") Todo todo) {
        todoService.save(todo);

        return "redirect:/todo";
    }

}
