package com.greenfoxacademy.programmerfoxclub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreenFoxController {

    @GetMapping(path = "/index")
    public String index(){

        return "index";
    }
}
