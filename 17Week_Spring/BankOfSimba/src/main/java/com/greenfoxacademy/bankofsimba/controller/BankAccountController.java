package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BankAccountController {

    BankAccount simbaBank = new BankAccount("Simba", 2000, "lion");

    @RequestMapping(path = "/account", method = RequestMethod.GET)
    public String showAccount(Model model, String name, int balance, String type) {
        model.addAttribute("name", name);
        model.addAttribute("balance", balance);
        model.addAttribute("type", type);
        return "BankAccount";
    }



}
