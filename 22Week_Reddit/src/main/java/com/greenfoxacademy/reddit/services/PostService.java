package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.models.User;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import com.greenfoxacademy.reddit.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    private PostRepository postRepository;
    private UserRepository userRepository;

    @Autowired
    public PostService(PostRepository postRepository, UserRepository userRepository) {
        this.postRepository = postRepository;
        this.userRepository = userRepository;
    }

    public List<Post> list() {
        return postRepository.findAllByOrderByScoreDesc();
    }

    public void setUser(String userName, Post post){
        postRepository.save(post);
        Optional<User> user = userRepository.findByUserName(userName);
        if (user.isPresent()){
            post.setUser(userRepository.findByUserName(userName).get());
            postRepository.save(post);
        }
    }

    public void raiseScore(long id, String userName) {
        Optional<Post> post = postRepository.findById(id);
        if (post.isPresent()) {
            Post postScoreRaising = post.get();
            postScoreRaising.setScore(postScoreRaising.getScore() + 1);
            postRepository.save(postScoreRaising);
        }
    }

    public void decreaseScore(long id, String userName) {
        Optional<Post> post = postRepository.findById(id);
        if (post.isPresent()) {
            Post postScoreDecreasing = post.get();
            postScoreDecreasing.setScore(postScoreDecreasing.getScore() - 1);
            postRepository.save(postScoreDecreasing);
        }
    }

}
