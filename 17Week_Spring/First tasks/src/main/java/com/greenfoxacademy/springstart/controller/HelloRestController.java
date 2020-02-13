package com.greenfoxacademy.springstart.controller;

import com.greenfoxacademy.springstart.Greeting;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRestController {

    private final AtomicLong counter = new AtomicLong(0);

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", required = false) String name, Model model){
        return new Greeting(counter.incrementAndGet(), "Hello " + name + "!");
    }

}
