package com.greenfoxacademy.reddit.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String url;
    private int score;
    @ManyToOne
    private User user;
    private LocalDate date;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "post")
    private List<Vote> voteList;

    public Post() {
        this.score = 1;
        this.date = LocalDate.now();
        this.voteList = new ArrayList<>();
    }

    public Post(String title, String url, User user) {
        this.title = title;
        this.url = url;
        this.score = 1;
        this.user = user;
        this.date = LocalDate.now();
        this.voteList = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<Vote> getVoteList() {
        return voteList;
    }

    public void setVoteList(List<Vote> voteList) {
        this.voteList = voteList;
    }

    public void addVote(Vote vote){
        voteList.add(vote);
    }
}
