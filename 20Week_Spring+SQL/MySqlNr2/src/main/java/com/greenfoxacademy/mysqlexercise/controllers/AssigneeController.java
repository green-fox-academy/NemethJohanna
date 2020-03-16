package com.greenfoxacademy.mysqlexercise.controllers;

import com.greenfoxacademy.mysqlexercise.models.Assignee;
import com.greenfoxacademy.mysqlexercise.services.AssigneeService;
import com.greenfoxacademy.mysqlexercise.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/assignee")
public class AssigneeController {

    private AssigneeService assigneeService;
    private TodoService todoService;

    @Autowired
    public AssigneeController(AssigneeService assigneeService, TodoService todoService) {
        this.assigneeService = assigneeService;
        this.todoService = todoService;
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

    @PostMapping(path = "/{id}/delete")
    public String deleteTodo(@PathVariable Long id) {
        assigneeService.delete(id);
        return "redirect:/assignee";
    }

    @GetMapping(path = "/{id}/edit")
    public String renderAssigneeEditPage(@PathVariable Long id, Model model){
        model.addAttribute("assignee", assigneeService.findAssigneeById(id));
        return "editAssignee";
    }

    @PostMapping(path = "/{id}/edit")
    public String editAssignee(@ModelAttribute("todo") Assignee assignee) {
        assigneeService.save(assignee);
        return "redirect:/assignee/";
    }

    @GetMapping(path = "/{id}")
    public String renderListPage(@PathVariable Long id, Model model, @ModelAttribute Assignee assignee){
        model.addAttribute("assignee", assigneeService.findAssigneeById(id));
        model.addAttribute("todos", todoService.findAllByAssignee(assignee));
        return "assigneedTodos";
    }

}
