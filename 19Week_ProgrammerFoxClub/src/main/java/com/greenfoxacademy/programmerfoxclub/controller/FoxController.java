package com.greenfoxacademy.programmerfoxclub.controller;

import com.greenfoxacademy.programmerfoxclub.service.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxController {

    private FoxService foxService;

    @Autowired
    public FoxController(FoxService foxService) {
        this.foxService = foxService;
    }

    @GetMapping(path = "/nutritionStore")
    public String nutrition(@RequestParam(required = false) String name, Model model){
        model.addAttribute("name", name);
        return "nutritionStore";
    }

    @PostMapping(path = "/nutritionStore")
    public String addNutrition(@RequestParam (required = false) String name, String food, String drink){
        foxService.getFox(name).setFood(food);
        foxService.getFox(name).setDrink(drink);
        return "redirect:/?name=" + name;
    }

    @GetMapping(path = "/trick")
    public String trick(@RequestParam (required = false) String name, Model model){
        model.addAttribute("name", name);
        return "trick";
    }

    @PostMapping (path = "/trick")
    public String setTrick(@RequestParam String name, String trick){
        foxService.getFox(name).addTrick(trick);
        return "redirect:/?name=" + name;
    }

}
