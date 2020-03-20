package com.greenfoxacademy.reddit.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "users")
public class User {

    private long id;
    private String userName;

}
