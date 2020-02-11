package com.greenfoxacademy.springstart.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class WebGreetCounter {

    private final AtomicLong counter = new AtomicLong(0);

    @GetMapping("/greeting/count")
    public String greeting(@RequestParam(value = "name", required = false) String name, Model model){
        return "Hello " + name + "!" + " This site was loaded " + counter.incrementAndGet() + " times since last server start.";
    }

}
