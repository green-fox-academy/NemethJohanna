package com.greenfoxacademy.mysql.controllers;

import com.greenfoxacademy.mysql.models.Assignee;
import com.greenfoxacademy.mysql.services.AssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        return "assigneeList";
    }

    @GetMapping(path = "/add")
    public String getAddForm() {
        return "addAssignee";
    }

    @PostMapping(path = "/add")
    public String addAssignee(Model model, @ModelAttribute Assignee assignee) {
        model.addAttribute("add", assigneeService.addAssignee(assignee));
        return "redirect:/assignee/";
    }

    @GetMapping(path = "/{id}/edit")
    public String renderAssigneeEditPage(@PathVariable Integer id, Model model){
        model.addAttribute("assignees", assigneeService.findAssigneeById(id));
        return "editassignee";
    }

    @PostMapping(path = "/{id}/edit")
    public String editAssignee(@ModelAttribute("todo") Assignee assignee) {
        assigneeService.save(assignee);
        return "redirect:/assigneeList";
    }
}
