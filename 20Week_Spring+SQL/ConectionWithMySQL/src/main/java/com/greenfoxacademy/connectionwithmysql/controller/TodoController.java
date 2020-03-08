package com.greenfoxacademy.connectionwithmysql.controller;

import com.greenfoxacademy.connectionwithmysql.model.Todo;
import com.greenfoxacademy.connectionwithmysql.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.standard.expression.GreaterOrEqualToExpression;

@Controller
@RequestMapping("/todo")
public class TodoController {

    private TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping(value = {"/", ""})
    public String list(Model model, @RequestParam (required = false) Boolean isActive){
        model.addAttribute("todos", todoService.getActiveTodos(isActive));
        return "list";
    }

    @GetMapping(path = "/add")
    public String getAddForm(){
        return "add";
    }

    @PostMapping(path = "/add")
    public String addTodo(Model model, @ModelAttribute Todo todo){
        model.addAttribute("add", todoService.addTodo(todo));
        return "redirect:/todo/";
    }

    @PostMapping(path = "/{id}/delete")
    public String deleteTodo(@PathVariable long id) {
        todoService.delete(id);
        return "redirect:/todo";
    }

    @GetMapping(path = "/{id}/edit")
    public String renderEditPage(Model model, Long id){
//        model.addAttribute("todo", todoService.findTodoById(id));
        return "edit";
    }

    @PostMapping(path = "/{id}/edit")
    public String editTodo(@PathVariable long id, Model model, @ModelAttribute Todo todo){
        todoService.edit(todo);
        return "redirect:/todo";
    }

}
