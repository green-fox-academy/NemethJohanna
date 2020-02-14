package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankAccountController {

    BankAccount simbaBank = new BankAccount("Simba", 2000, "lion");

    @GetMapping(path = "/account")
    public String showAccount(Model model, String name, Integer balance, String type) {
        model.addAttribute("name", simbaBank.getName());
        model.addAttribute("balance", simbaBank.getBalance());
        model.addAttribute("type", simbaBank.getAnimalType());
        return "bank";
    }



}
