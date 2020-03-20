package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    private PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> list() {
//        return postRepository.findAll();
        return postRepository.findAllByOrderByScoreDesc();
    }

    public void add(Post post) {
        postRepository.save(post);
    }

    public void raiseScore(long id) {
        Optional<Post> post = postRepository.findById(id);
        if (post.isPresent()) {
            Post postScoreRaising = post.get();
            postScoreRaising.setScore(postScoreRaising.getScore() + 1);
            postRepository.save(postScoreRaising);
        }
    }

    public void decreaseScore(long id) {
        Optional<Post> post = postRepository.findById(id);
        if (post.isPresent()) {
            Post postScoreDecreasing = post.get();
            postScoreDecreasing.setScore(postScoreDecreasing.getScore() - 1);
            postRepository.save(postScoreDecreasing);
        }
    }

}
