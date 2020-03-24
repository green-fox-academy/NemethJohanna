package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.models.User;
import com.greenfoxacademy.reddit.models.Vote;
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

    public void setUser(String userName, Post post) {
        postRepository.save(post);
        Optional<User> user = userRepository.findByUserName(userName);
        if (user.isPresent()) {
            post.setUser(userRepository.findByUserName(userName).get());
            postRepository.save(post);
        }
    }

//    public void raiseScore(Vote vote) {
//        Optional<Post> post = postRepository.findById(vote.getPost().getId());
//        Optional<User> user = userRepository.findByUserName(vote.getUser().getUserName());
//        if (post.isPresent() && user.isPresent()) {
//            Post newPost = post.get();
//            if (!newPost.getVoteList().contains(vote)){
//                newPost.addVote(vote);
//                newPost.setScore(newPost.getScore() + 1);
//                postRepository.save(newPost);
//            }
//        }
//    }

    public void raiseScore(long postId, String userName) {
        Optional<Post> post = postRepository.findById(postId);
        Optional<User> user = userRepository.findByUserName(userName);
        if (post.isPresent() && user.isPresent()) {
            Post newPost = post.get();
            if (!newPost.getVoteList().contains(postId)) {
                Vote vote = new Vote(user.get(), post.get());
                newPost.addVote(vote);
                newPost.setScore(newPost.getScore() + 1);
//                postRepository.save(newPost);
            }
        }
    }

    public void decreaseScore(long postId, String userName) {
        Optional<Post> post = postRepository.findById(postId);
        if (post.isPresent()) {
            Post postScoreDecreasing = post.get();
            postScoreDecreasing.setScore(postScoreDecreasing.getScore() - 1);
            postRepository.save(postScoreDecreasing);
        }
    }

}
