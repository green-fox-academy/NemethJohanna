package com.greenfoxacademy.springstart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class FizzBuzzController {

    private final AtomicLong counter = new AtomicLong(0);

    @GetMapping("/fizzBuzz")
    public String fizzBuzz(String name, Model model){
        String times = "";
        int fontSize = 0;

        if (counter.incrementAndGet() % 3 == 0) {
            times += "Fizz";
            fontSize += 24;
        } else if (counter.incrementAndGet() % 5 == 0) {
            times += "Buzz";
            fontSize += 24;
        } else if (counter.incrementAndGet() % 7 == 0) {
            times += "Woof";
            fontSize += 24;
        } else if (counter.incrementAndGet() % 3 == 0 && counter.incrementAndGet() % 5 == 0) {
            times += "FizzBuzz";
            fontSize += 48;
        } else if (counter.incrementAndGet() % 5 == 0 && counter.incrementAndGet() % 7 == 0) {
            times += "BuzzWoof";
            fontSize += 48;
        } else if (counter.incrementAndGet() % 3 == 0 && counter.incrementAndGet() % 7 == 0) {
            times += "FizzWoof";
            fontSize += 48;
        } else if (counter.incrementAndGet() % 3 == 0 && counter.incrementAndGet() % 5 == 0 && counter.incrementAndGet() % 7 == 0) {
            times += "FizzBuzzWoof";
            fontSize += 72;
        } else {
            times += counter.incrementAndGet();
            fontSize += 12;
        }

        return "fizzBuzz";

    }

}
