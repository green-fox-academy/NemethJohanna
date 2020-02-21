package com.greenfoxacademy.greenfoxclass.controller;

import com.greenfoxacademy.greenfoxclass.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(path = "/gfa")
    public String main() {
        return "index";
    }

    @GetMapping(path = "/gfa/list")
    public String listStudents(Model model) {
        model.addAttribute("list", studentService.findAll());
        return "list";
    }

    @GetMapping(path = "/gfa/add")
    public String addStudent(@ModelAttribute String name, Model model) {
        model.addAttribute("student", name);
        return "addnewstudent";
    }

    @PostMapping(path = "/gfa/add")
    public String addToTheList(String studentsName) {
        studentService.save(studentsName);
        return "redirect:/gfa/list";
    }

}