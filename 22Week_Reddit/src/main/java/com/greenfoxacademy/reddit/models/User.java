package com.greenfoxacademy.reddit.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String userName;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "user")
    private List<Post> postList;

    public User(String userName) {
        this.userName = userName;
        this.postList = new ArrayList<>();
    }

    public User() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<Post> getPost() {
        return postList;
    }

    public void addPost (Post post){
        postList.add(post);
    }

}
