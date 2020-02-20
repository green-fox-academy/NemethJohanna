package com.greenfoxacademy.usefulutilities.controller;

import com.greenfoxacademy.usefulutilities.service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UtilityController {

    UtilityService service;

    @Autowired
    public UtilityController(UtilityService service) {
        this.service = service;
    }

    @GetMapping(path = "/useful")
    public String details() {
        return "links";
    }

    @GetMapping(path = "/useful/background")
    public String coloredBackground (Model model){
        model.addAttribute("backgroundColor", service.randomColor());
        return "background";
    }

    @GetMapping(path = "/useful/email")
    public String emailValidator(@RequestParam(required = false) String email, Model model){
        model.addAttribute("email", service.validateEmail(email));
        return "email";
    }

}
