package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class BankAccountController {

    private List<BankAccount> banks = new ArrayList<>(Arrays.asList(
            new BankAccount("Timon", 300, "meerkat", true, false),
            new BankAccount("Pumba", 500, "warthog", true, false),
            new BankAccount("Nala", 1500, "lion", true, true),
            new BankAccount("Simba", 2000, "lion", true, true),
            new BankAccount("Zordon", 1800, "lion", false, false)
    ));

    BankAccount simba = new BankAccount("Simba", 2000, "lion", true, true);

    @GetMapping(path = "/show")
    public String showAccount(Model model, String name, Integer balance, String type) {
        model.addAttribute("name", simba.getName());
        model.addAttribute("balance", simba.getBalance());
        model.addAttribute("type", simba.getAnimalType());
        return "bank";
    }

    @GetMapping(path = "/utext")
    public String showUText(Model model) {
        String text = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
        model.addAttribute("name", text);
        return "HTMLception";
    }

    @GetMapping(path = "/list")
    public String listBankAccounts(Model model) {
        model.addAttribute("banks", banks);
        return "bankList";
    }

}
