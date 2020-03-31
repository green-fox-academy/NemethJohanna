package com.greenfoxacademy.restapi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @GetMapping(value = "/")
    public String renderIndex() {
        return "index";
    }

}

