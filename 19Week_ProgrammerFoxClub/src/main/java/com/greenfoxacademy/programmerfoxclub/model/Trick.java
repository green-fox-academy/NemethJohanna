package com.greenfoxacademy.programmerfoxclub.model;

public class Trick {

    private String trickName;
    private String action;

    public Trick() {
    }

    public Trick(String trick){
        this.trickName = trick;
    }

    public void setTrickName(String trickName) {
        this.trickName = trickName;
    }

    public String getTrickName() {
        return trickName;
    }

    @Override
    public String toString() {
        return trickName;
    }
}
