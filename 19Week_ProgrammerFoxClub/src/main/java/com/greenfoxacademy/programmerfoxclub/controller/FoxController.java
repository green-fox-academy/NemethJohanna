package com.greenfoxacademy.programmerfoxclub.controller;

import com.greenfoxacademy.programmerfoxclub.model.Trick;
import com.greenfoxacademy.programmerfoxclub.service.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
        model.addAttribute("drinkList", foxService.getDrinkList());
        model.addAttribute("foodList", foxService.getFoodList());
        model.addAttribute("name", name);
        return "nutritionStore";
    }

    @PostMapping(path = "/nutritionStore")
    public String addNutrition(@RequestParam (required = false) String name, String food, String drink){
        foxService.setFood(name, food);
        foxService.setDrink(name, drink);
        return "redirect:/?name=" + name;
    }

    @GetMapping(path = "/trick")
    public String trick(@RequestParam (required = false) String name, Model model){
        model.addAttribute("trickList", foxService.getTrickTrickList());
        model.addAttribute("name", name);
        return "trick";
    }

    @PostMapping (path = "/trick")
    public String setTrick(@RequestParam String name, @ModelAttribute Trick trick){
        foxService.addTrick(trick, name);
        foxService.removeTrick(trick);
        return "redirect:/?name=" + name;
    }

    @GetMapping(path = "/actionhistory")
    public String actionHistory(Model model, @RequestParam String name){
        model.addAttribute("name", name);
        model.addAttribute("actionList", foxService.getActionList(name));
        return "actionHistory";
    }

    @PostMapping(path = "/actionhistory")
    public String getHistory(@RequestParam String name, String action, String actionType) {
        foxService.addAction(action, name, actionType);
//        foxService.getActionList(name);
        return "redirect:/?name=" + name;
    }

}
