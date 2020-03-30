package com.greenfoxacademy.restapi.controllers;


import com.greenfoxacademy.restapi.models.DoUntil;
import com.greenfoxacademy.restapi.models.ErrorMessage;
import com.greenfoxacademy.restapi.models.Result;
import com.greenfoxacademy.restapi.services.RestService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RestControll {

    private RestService restService;

    public RestControll(RestService restService) {
        this.restService = restService;
    }

    @PostMapping(path = "/dountil/{action}")
    public ResponseEntity doUntil(@PathVariable String action, @RequestBody DoUntil until){
        if (until == null){
            return ResponseEntity.status(404).body(new ErrorMessage("Please provide a number!"));
        } else if (action.equals("sum") || action.equals("factor")) {
            return ResponseEntity.status(200).body(new Result(restService.action(until, action)));
        } else {
            return ResponseEntity.status(404).body(new ErrorMessage("Please provide an action!"));
        }
    }
}
