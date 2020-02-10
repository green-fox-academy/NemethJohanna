package com.greenfoxacademy.springstart.controller;

import com.greenfoxacademy.springstart.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    @GetMapping("/greeting")
    public Greeting greeting(){
        return new Greeting(1, "Hello World!");
    }

}
