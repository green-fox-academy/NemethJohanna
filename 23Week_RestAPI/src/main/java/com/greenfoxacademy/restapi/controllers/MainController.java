package com.greenfoxacademy.restapi.controllers;

import com.greenfoxacademy.restapi.models.Doubling;
import com.greenfoxacademy.restapi.models.ErrorMessage;
import com.greenfoxacademy.restapi.services.Services;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    private Services service;

    public MainController(Services service) {
        this.service = service;
    }


    @GetMapping(value = "/")
    public String renderIndex() {
        return "index";
    }

    @GetMapping(path = "/doubling")
    public ResponseEntity doubling(@RequestParam(required = false) Integer input) {
        if (input == null) {
            return ResponseEntity.status(200).body(new ErrorMessage("Please provide an input!"));
        } else {
            Doubling doubling = service.doubling(input);
            return ResponseEntity.status(200).body(doubling);
        }
    }

}
