package com.greenfoxacademy.restapi.models;

public class DoUntil {

    private int until;

    public DoUntil() {
    }

    public DoUntil(int number) {
        this.until = number;
    }

    public int sum(){
        int result = 0;
        for (int i = 1; i <= until; i++) {
            result += i;
        }
        return result;
    }

    public int factor(){
        int result = 1;
        for (int i = 1; i <= until; i++) {
            result *= i;
        }
        return result;
    }

    public int getUntil() {
        return until;
    }

    public void setUntil(int until) {
        this.until = until;
    }

}

