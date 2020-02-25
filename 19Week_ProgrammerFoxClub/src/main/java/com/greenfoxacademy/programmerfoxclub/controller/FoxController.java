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
    public String nutrition(@RequestParam(name = "name") String name, Model model){
        model.addAttribute("name", name);
        return "nutritionStore";
    }

    @PostMapping(path = "/nutritionStore")
    public String addNutrition(@RequestParam () Model model, String name){
        model.addAttribute("food", foxService.getFoodStore());
        model.addAttribute("drink", foxService.getDrinkStore());
        return "redirect:/?name=" + name;
    }


}
