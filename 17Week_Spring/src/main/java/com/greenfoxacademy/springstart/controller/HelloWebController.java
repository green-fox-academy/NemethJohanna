package com.greenfoxacademy.springstart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class HelloWebController {

    @RequestMapping(value = "/web/greeting", method = GET)
    public String greeting(Model model) {
        model.addAttribute("name", " World");
        return "greeting";
    }

}
