package com.greenfoxacademy.restapi.models;

public class Doubling {

    private int received;
    private int result;

    public Doubling(int received) {
        this.received = received;
        this.result = received * 2;
    }

    public Doubling(int received, int result) {
        this.received = received;
        this.result = result;
    }

    public Doubling() {
    }

    public int getReceived() {
        return received;
    }

    public void setReceived(int received) {
        this.received = received;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
