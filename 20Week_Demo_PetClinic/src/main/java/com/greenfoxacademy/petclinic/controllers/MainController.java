package com.greenfoxacademy.petclinic.controllers;

import com.greenfoxacademy.petclinic.models.Owner;
import com.greenfoxacademy.petclinic.services.OwnerService;
import com.greenfoxacademy.petclinic.services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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
    public String welcome() {
        return "welcome";
    }

    @GetMapping(path = "/findowner")
    public String listOwners(Model model) {
        model.addAttribute("owners", ownerService.list());
//        model.addAttribute("pets", petService.list());
        return "findowner";
    }

    @GetMapping(path = "/listowner")
    public String list (Model model){
        model.addAttribute("owners", ownerService.list());
        model.addAttribute("pets", petService.list());
        return "listowner";
    }

    @GetMapping(path = "/addowner")
    public String add(){
        return "addowner";
    }

    @PostMapping(path = "/add")
    public String addNewOwner(Model model, @ModelAttribute Owner owner){
        model.addAttribute("addOwner", ownerService.addOwner(owner));
        return "redirect:/";
    }

//    @GetMapping(path = "/ownerinformation")
//    public String ownerInformation(Model model, String name, String address, String city, String phone){
//        model.addAttribute("name", ownerService.get());
//        return "'ownerinformation'" + ${name};
//    }


    @GetMapping(path = "/veterinarians")
    public String veter() {
        return "veterinarians";
    }

    @GetMapping(path = "/error")
    public String error() {
        return "error";
    }


}
