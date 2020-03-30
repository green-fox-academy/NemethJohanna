package com.greenfoxacademy.restapi.models;

public class DoUntil {

    private String action;
    private int number;
    private int result;

    public DoUntil() {
    }

    public DoUntil(String action, int number) {
        if (action.equals("sum")){
            for (int i = 1; i <= number; i++) {
                this.result += i;
            }
        } else if (action.equals("factor")){
            for (int i = 1; i <= number; i++) {
                this.result *= i;
            }
        }
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

