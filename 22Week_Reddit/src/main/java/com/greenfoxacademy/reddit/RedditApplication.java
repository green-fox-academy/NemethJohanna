package com.greenfoxacademy.reddit;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditApplication implements CommandLineRunner {

    private PostRepository postRepository;

    @Autowired
    public RedditApplication(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(RedditApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Post post1 = new Post("Read news", "https://index.hu/", 15);
        Post post2 = new Post("Learn coding", "https://www.udemy.com/", 10);
        Post post3 = new Post("Watch youtube", "https://www.youtube.com/", 12);

        postRepository.save(post1);
        postRepository.save(post2);
        postRepository.save(post3);

    }
}
