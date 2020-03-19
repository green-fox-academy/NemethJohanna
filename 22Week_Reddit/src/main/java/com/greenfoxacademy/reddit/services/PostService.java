package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    private PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Iterable<Post> list(){
        return postRepository.findAll();
    }

    public void add(Post post){
        postRepository.save(post);
    }

    public void raiseScore(int id){
        postRepository.findById(id).get().setScore(10);
//        Optional<Post> optional = postRepository.findById(id);
//        if (optional.isPresent()){
//            optional.get().setScore(10);
//        }
    }

    public void decreaseScore(int id){
        Optional<Post> optional = postRepository.findById(id);
        if (optional.isPresent()){
            optional.get().setScore(5);
        }
    }

}
