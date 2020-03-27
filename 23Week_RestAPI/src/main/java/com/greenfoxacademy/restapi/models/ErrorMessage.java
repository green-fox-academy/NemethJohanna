package com.greenfoxacademy.restapi.models;

public class ErrorMessage {

    private String error;

    public ErrorMessage(String message) {
        this.error = message;
    }

    public ErrorMessage() {
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
