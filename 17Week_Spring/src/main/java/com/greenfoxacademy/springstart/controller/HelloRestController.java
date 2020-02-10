package com.greenfoxacademy.springstart.controller;

import com.greenfoxacademy.springstart.Greeting;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", required = false) String name, Model model){
        return new Greeting(1, "Hello " + name + "!");
    }

}
