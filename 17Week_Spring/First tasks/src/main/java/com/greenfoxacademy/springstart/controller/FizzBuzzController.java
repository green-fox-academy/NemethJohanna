package com.greenfoxacademy.springstart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.concurrent.atomic.AtomicLong;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class FizzBuzzController {

    private final AtomicLong counter = new AtomicLong(0);

    @RequestMapping(value = "/fizzBuzz", method = GET)
    public String fizzBuzz(String name, Model model){
        String times;
        int fontSize;
        long count = counter.incrementAndGet();

        if (count % 3 == 0 && count % 5 == 0 && count % 7 == 0) {
            times = "FizzBuzzWoof";
            fontSize = 72;
        } else if (count % 3 == 0 && count % 5 == 0) {
            times = "FizzBuzz";
            fontSize = 48;
        } else if (count % 5 == 0 && count % 7 == 0) {
            times = "BuzzWoof";
            fontSize = 48;
        } else if (count % 3 == 0 && count % 7 == 0) {
            times = "FizzWoof";
            fontSize = 48;
        } else if (count % 3 == 0) {
            times = "Fizz";
            fontSize = 24;
        } else if (count % 5 == 0) {
            times = "Buzz";
            fontSize = 24;
        } else if (count % 7 == 0) {
            times = "Woof";
            fontSize = 24;
        } else {
            times = Long.toString(count);
            fontSize = 18;
        }

        model.addAttribute("times", times);
        model.addAttribute("fontSize", fontSize);

        return "fizzBuzz";

    }

}
