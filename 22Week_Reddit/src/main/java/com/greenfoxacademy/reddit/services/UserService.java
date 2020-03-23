package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.User;
import com.greenfoxacademy.reddit.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

//    public Optional<User> getUserName(String userName){
//        return userRepository.findByUserName(userName);
//    }

    public void saveUser(String userName) {
        Optional<User> user = userRepository.findByUserName(userName);
        if (user.isPresent()) {
            user.get();
        } else {
            User user2 = new User(userName);
            userRepository.save(user2);
        }
    }

//    public void savePost(String userName, Post post) {
//        if (userName != null){
//            userRepository.findByUserName(userName).addPost(post);
//        }
//    }


}
