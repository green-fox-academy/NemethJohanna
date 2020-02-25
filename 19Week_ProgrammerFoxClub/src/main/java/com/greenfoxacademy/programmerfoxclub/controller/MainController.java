package com.greenfoxacademy.programmerfoxclub.controller;

import com.greenfoxacademy.programmerfoxclub.model.Fox;
import com.greenfoxacademy.programmerfoxclub.service.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private FoxService foxService;

    @Autowired
    public MainController(FoxService foxService) {
        this.foxService = foxService;
    }

    @GetMapping(path = "/")
    public String index(@RequestParam String name, Model model) {
        model.addAttribute("fox", foxService.getFox(name));
        return "index";
    }

    @GetMapping(path = "/login")
    public String showLogin() {
        return "login";
    }

    @PostMapping(path = "/login")
    public String loginFox(@RequestParam (value = "name") String name) {
        foxService.add(new Fox(name, "nothing", "nothing", null));
//        foxService.add(new Fox(name, foxService.getFoodStore().getFoodList().get(0), foxService.getDrinkStore().getDrinkList().get(0), null));
        return "redirect:/?name=" + name;
    }

    @GetMapping(path = "/nutrition")
    public String nutrition(@RequestParam (name = "name") String name, Model model){
        model.addAttribute("name", name);
        return "nutrition";
    }

}
