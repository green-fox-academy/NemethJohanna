package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankAccountController {

    @GetMapping(path = "/account")
    public String showAccount(Model model, String name, Integer balance, String type) {
        model.addAttribute("name", "Simba");
        model.addAttribute("balance", 2000);
        model.addAttribute("type", "lion");
        return "bank";
    }



}
