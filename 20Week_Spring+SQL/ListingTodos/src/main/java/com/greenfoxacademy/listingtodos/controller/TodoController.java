package com.greenfoxacademy.listingtodos.controller;

import com.greenfoxacademy.listingtodos.repository.TodoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController{

    private TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping (value = {"/", "/list"})
    @ResponseBody
    public String list (Model model){
        model.addAttribute("print", "This is my first Todo");
        return "This is my first todo";
    }
}
