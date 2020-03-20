package com.greenfoxacademy.reddit.repositories;

import com.greenfoxacademy.reddit.models.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PostRepository extends CrudRepository <Post, Long> {

    Optional<Post> findById(int id);
    Iterable<Post> findByOrderByScoreDesc();

}
