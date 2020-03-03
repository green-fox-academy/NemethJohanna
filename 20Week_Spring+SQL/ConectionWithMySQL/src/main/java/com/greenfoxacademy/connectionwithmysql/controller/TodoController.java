package com.greenfoxacademy.connectionwithmysql.controller;

import com.greenfoxacademy.connectionwithmysql.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {

    private TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping(value = {"/", "/todo"})
    public String list(Model model) {
        model.addAttribute("todos", todoService.findAll());
        return "list";
    }

    @GetMapping(path = "/todo/isDone")
    public String listActiveTodos(Model model, @RequestParam boolean isDone) {
//        model.addAttribute("active", todoRepository.findAllById(!isDone));
        return "redirect:/";
    }
}
