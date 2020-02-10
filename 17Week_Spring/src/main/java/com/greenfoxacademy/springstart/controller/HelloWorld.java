package com.greenfoxacademy.springstart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorld {

    public String hello(){
        return "Hello World";
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello (Model model){
        model.addAttribute("hello", hello());
        return hello();
    }

}
