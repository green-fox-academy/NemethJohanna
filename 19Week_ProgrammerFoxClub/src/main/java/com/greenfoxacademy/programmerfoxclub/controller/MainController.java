package com.greenfoxacademy.programmerfoxclub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping(path = "/")
    public String index(@RequestParam String name, Model model) {
        model.addAttribute("name", name);
        return "index";
    }

    @GetMapping(path = "/login")
    public String showLogin() {
        return "login";
    }

    @PostMapping(path = "/login")
    public String loginFox(@RequestParam (value = "name") String name) {
        return "redirect:/?name=" + name;
    }

}
