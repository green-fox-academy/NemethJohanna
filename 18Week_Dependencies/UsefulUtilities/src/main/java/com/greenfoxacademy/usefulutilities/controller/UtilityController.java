package com.greenfoxacademy.usefulutilities.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UtilityController {

    @Autowired
    @GetMapping("/useful")
    public String details (){

        return "useful";
    }
}
