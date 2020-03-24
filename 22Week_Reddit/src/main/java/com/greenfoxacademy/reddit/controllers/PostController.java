package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.models.User;
import com.greenfoxacademy.reddit.models.Vote;
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
    public String renderSignIn() {
        return "signIn";
    }

    @PostMapping(path = "/sign-in")
    public String signIn(String userName){
        userService.saveUser(userName);
        return "redirect:/" + userName + "/list";
    }

    @GetMapping(path = "/{userName}/list")
    public String getList(Model model, @ModelAttribute User user){
        model.addAttribute("userName", user.getUserName());
        model.addAttribute("posts", postService.list());
        return "index";
    }

    @GetMapping(path = "/{userName}/submit")
    public String renderAddPage(Model model, @ModelAttribute User user, @PathVariable String userName){
        model.addAttribute("userName", userName);
        model.addAttribute("post", new Post());
        return "submit";
    }

    @PostMapping(path = "/{userName}/submit")
    public String addNewPost(@ModelAttribute Post post, @PathVariable String userName){
        userService.savePost(post, userName);
        postService.setUser(userName, post);
        return "redirect:/" + userName + "/list";
    }

    @PostMapping(path = "/{userName}/{postId}/raise-score")
    public String raise(@PathVariable long postId, @PathVariable String userName, @ModelAttribute Vote vote){
        postService.raiseScore(postId, userName);
//        postService.raiseScore(vote);
        return "redirect:/" + userName + "/list";
    }

    @PostMapping(path = "/{userName}/{postId}/decrease-score")
    public String decrease(@PathVariable long postId, @PathVariable String userName){
        postService.decreaseScore(postId, userName);
        return "redirect:/" + userName + "/list";
    }


}
