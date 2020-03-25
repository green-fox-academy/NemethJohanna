package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.models.User;
import com.greenfoxacademy.reddit.models.Vote;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import com.greenfoxacademy.reddit.repositories.UserRepository;
import com.greenfoxacademy.reddit.repositories.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    private PostRepository postRepository;
    private UserRepository userRepository;
    private VoteRepository voteRepository;

    @Autowired
    public PostService(PostRepository postRepository, UserRepository userRepository, VoteRepository voteRepository) {
        this.postRepository = postRepository;
        this.userRepository = userRepository;
        this.voteRepository = voteRepository;
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

    public void raiseScore(long postId, String userName) {
        Optional<Post> post = postRepository.findById(postId);
        Optional<User> user = userRepository.findByUserName(userName);
        Optional<Vote> vote = voteRepository.findByUserAndPost(user.get(), post.get());
        if (post.isPresent() && user.isPresent()) {
            Post newPost = post.get();
            if (!newPost.getVoteList().contains(postId)) {
                Vote vote1 = new Vote(user.get(), post.get(), true);
                if (!vote.isPresent()){
                    newPost.addVote(vote1);
                    newPost.setScore(newPost.getScore() + 1);
                    postRepository.save(newPost);
                }
            }
        }
    }

    public void decreaseScore(long postId, String userName) {
        Optional<Post> post = postRepository.findById(postId);
        Optional<User> user = userRepository.findByUserName(userName);
        Optional<Vote> vote = voteRepository.findByUserAndPost(user.get(), post.get());
        if (post.isPresent() && user.isPresent()) {
            Post newPost = post.get();
            if (!newPost.getVoteList().contains(postId)) {
                Vote vote1 = new Vote(user.get(), post.get(), false);
                if (!vote.isPresent()){
                    newPost.addVote(vote1);
                    newPost.setScore(newPost.getScore() - 1);
                    postRepository.save(newPost);
                }
            }
        }
    }

}
