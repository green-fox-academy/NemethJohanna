package com.greenfoxacademy.mysql.controllers;

import com.greenfoxacademy.mysql.services.AssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/assignee")
public class AssigneeController {

    private AssigneeService assigneeService;

    @Autowired
    public AssigneeController(AssigneeService assigneeService) {
        this.assigneeService = assigneeService;
    }

    @GetMapping(value = {"/", ""})
    public String renderIndexPage(Model model){
        model.addAttribute("assignees", assigneeService.list());
        return "assignee";
    }

}
