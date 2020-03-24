package com.greenfoxacademy.reddit.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "votes")
public class Vote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
//    private List<Post> postList;
    private int  value;

    public Vote(List<Post> postList, int value) {
//        this.postList = postList;
        this.value = value;
    }

    public Vote() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

//    public List<Post> getPostList() {
//        return postList;
//    }
//
//    public void setPostList(List<Post> postList) {
//        this.postList = postList;
//    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
