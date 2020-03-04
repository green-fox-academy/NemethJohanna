package com.greenfoxacademy.petclinic.controllers;

import com.greenfoxacademy.petclinic.services.OwnerService;
import com.greenfoxacademy.petclinic.services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/petclinic")
public class MainController {

    private OwnerService ownerService;
    private PetService petService;

    @Autowired
    public MainController(OwnerService ownerService, PetService petService) {
        this.ownerService = ownerService;
        this.petService = petService;
    }

    @GetMapping(path = {"/", ""})
    public String welcome(){
        return "index";
    }

    @GetMapping(path = "/owners")
    public String listOwners(Model model){
        model.addAttribute("owners", ownerService.list());
        model.addAttribute("pets", petService.list());
        return "listOwners";
    }



}
