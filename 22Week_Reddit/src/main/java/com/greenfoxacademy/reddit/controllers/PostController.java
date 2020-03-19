package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostController {

    private PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping(value = {"/", ""})
    public String indexPage(Model model) {
        model.addAttribute("posts", postService.list());
        return "index";
    }

    @GetMapping(path = "/submit")
    public String renderAddPage(){
        return "submit";
    }

    @PostMapping(path = "/submit")
    public String addNewPost(@ModelAttribute Post post){
        postService.add(post);
        return "redirect:/";
    }

    @PostMapping(path = "/{id}/raise-score")
    public String raise(@PathVariable int id){
        postService.raiseScore(id);
        return "redirect:/";
    }

    @PostMapping(path = "/{id}/decrease-score")
    public String decrease(@PathVariable int id){
        postService.decreaseScore(id);
        return "redirect:/";
    }

}
