package com.greenfoxacademy.reddit.models;

import javax.persistence.*;

@Entity
@Table (name = "votes")
public class Vote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    private User user;
    @ManyToOne
    private Post post;
    private String plusOrMinus;

    public Vote(User user, Post post, String plusOrMinus) {
        this.user = user;
        this.post = post;
        this.plusOrMinus = plusOrMinus;
    }

    public Vote() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public String getPlusOrMinus() {
        return plusOrMinus;
    }

    public void setPlusOrMinus(String plusOrMinus) {
        this.plusOrMinus = plusOrMinus;
    }
}
