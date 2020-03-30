package com.greenfoxacademy.restapi.controllers;

import com.greenfoxacademy.restapi.services.RestService;
import com.greenfoxacademy.restapi.models.*;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    private RestService restService;

    public MainController(RestService restService) {
        this.restService = restService;
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

//    @PostMapping(path = "/dountil/{action}")
//    public ResponseEntity doUntil(@PathVariable String action, @RequestBody DoUntil until){
//        if (until == null){
//            return ResponseEntity.status(404).body(new ErrorMessage("Please provide a number!"));
//        } else if (action.equals("sum") || action.equals("factor")) {
//            return ResponseEntity.status(202).body(restService.action(until, action));
//        } else {
//            return ResponseEntity.status(404).body(new ErrorMessage("Please provide an action!"));
//        }
//    }


}

