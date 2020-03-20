package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.models.User;
import com.greenfoxacademy.reddit.services.PostService;
import com.greenfoxacademy.reddit.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    private PostService postService;
    private UserService userService;

    @Autowired
    public PostController(PostService postService, UserService userService) {
        this.userService = userService;
        this.postService = postService;
    }

    @GetMapping(value = {"/", "", "/sign-in"})
    public String renderSignIn(Model model, @ModelAttribute User user) {
        model.addAttribute("userName", user.getUserName());
        return "signIn";
    }

    @PostMapping(path = "/{userName}/list")
    public String list(Model model, @PathVariable String userName){
        model.addAttribute("posts", postService.list());
        return "index";
    }

//    @PostMapping(path = "/{userName}")
//    public String signIn(@ModelAttribute User userName){
//        return "redirect:/" + userName + "/";
//    }

    @GetMapping(path = "/{userName}/submit")
    public String renderAddPage(@PathVariable String userName, Model model){
        model.addAttribute("userName", userName);
        return "submit";
    }

    @PostMapping(path = "/{userName}/submit")
    public String addNewPost(@ModelAttribute Post post, @PathVariable User userName){
//        userService.
        postService.add(post, userName);
        return "redirect:/" + userName + "/list";
    }

    @PostMapping(path = "/{id}/raise-score")
    public String raise(@PathVariable long id){
        postService.raiseScore(id);
        return "redirect:/";
    }

    @PostMapping(path = "/{id}/decrease-score")
    public String decrease(@PathVariable long id){
        postService.decreaseScore(id);
        return "redirect:/";
    }


}
