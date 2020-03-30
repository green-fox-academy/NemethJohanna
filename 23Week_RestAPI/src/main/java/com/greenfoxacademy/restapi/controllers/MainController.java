package com.greenfoxacademy.restapi.controllers;

import com.greenfoxacademy.restapi.models.*;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

//    private Services service;
//
//    public MainController(Services service) {
//        this.service = service;
//    }


    @GetMapping(value = "/")
    public String renderIndex() {
        return "index";
    }

    @GetMapping(path = "/doubling")
    public ResponseEntity doubling(@RequestParam(required = false) Integer input) {
        if (input == null) {
            return ResponseEntity.status(200).body(new ErrorMessage("Please provide an input!"));
        } else {
            Doubling doubling = new Doubling(input);
            return ResponseEntity.status(200).body(doubling);
        }
    }

    @GetMapping(path = "/greeter")
    public ResponseEntity greeting(@RequestParam(required = false) String name, @RequestParam(required = false) String title){
        if (name == null && title == null){
            return ResponseEntity.status(400).body(new ErrorMessage("Please provide a name and a title!"));
        } else if (name == null){
            return ResponseEntity.status(400).body(new ErrorMessage("Please provide a name!"));
        } else if (title == null){
            return ResponseEntity.status(400).body(new ErrorMessage("Please provide a title!"));
        } else {
            return ResponseEntity.status(200).body(new WelcomeMessage(name, title));
        }
    }

    @GetMapping(path = "/appenda/{appendable}")
    public ResponseEntity appendA(@PathVariable String appendable){
        if (appendable == null){
            return ResponseEntity.status(404).body(new ErrorMessage("No appendable provided!"));
        } else {
            AppendA append = new AppendA(appendable);
            return ResponseEntity.status(200).body(append);
        }
    }

    @PostMapping(path = "/dountil/{action}")
    public ResponseEntity doUntil(@PathVariable String action, @RequestParam(required = false) Integer number){

        if (number == null){
            return ResponseEntity.status(404).body(new ErrorMessage("Please provide a number!"));
        } else {
            DoUntil doUntil = new DoUntil(action, number);
            return ResponseEntity.status(202).body(doUntil);
        }
    }


}

