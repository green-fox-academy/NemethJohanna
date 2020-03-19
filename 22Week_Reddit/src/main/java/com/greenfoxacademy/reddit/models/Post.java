package com.greenfoxacademy.reddit.models;

import javax.persistence.*;

@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String url;
    private int score;

    public Post() {
    }

    public Post(int id, String title, String url, int score) {
        this.id = id;
        this.title = title;
        this.url = url;
        this.score = score;
    }

    public Post(String title, String url, int score) {
        this.title = title;
        this.url = url;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
