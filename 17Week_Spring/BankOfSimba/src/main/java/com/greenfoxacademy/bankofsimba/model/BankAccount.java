package com.greenfoxacademy.bankofsimba.model;

public class BankAccount {

    private String name;
    private Integer balance;
    private String animalType;
    private boolean isKing;
    private boolean isGood;

    public BankAccount(String name, Integer balance, String animalType, boolean isGood, boolean isKing) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.isGood = isGood;
        this.isKing = isKing;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public boolean isKing() {
        return isKing;
    }

    public void setKing(boolean king) {
        isKing = king;
    }

    public boolean isGood() {
        return isGood;
    }

    public void setGood(boolean good) {
        isGood = good;
    }

}
