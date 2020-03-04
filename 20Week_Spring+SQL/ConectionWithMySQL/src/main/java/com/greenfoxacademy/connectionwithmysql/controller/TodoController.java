package com.greenfoxacademy.connectionwithmysql.controller;

import com.greenfoxacademy.connectionwithmysql.model.Todo;
import com.greenfoxacademy.connectionwithmysql.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class TodoController {

    private TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping(value = {"/", ""})
    public String list(Model model, @RequestParam (required = false) Boolean isActive) {
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

    

}
