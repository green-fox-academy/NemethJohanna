package com.greenfoxacademy.bankofsimba.model;

public class BankAccount {

    private String name;
    private Integer balance;
    private String animalType;
    private Boolean isKing;
    private Boolean isGood;

//    public BankAccount(String name, Integer balance, String animalType, boolean isGood, boolean isKing) {
//        this.name = name;
//        this.balance = balance;
//        this.animalType = animalType;
//        this.isGood = (isGood == null ? false: true);
//        this.isKing = isKing;
//    }

    public BankAccount(String name, Integer balance, String animalType, Boolean isKing, Boolean isGood) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.isKing = isKing != null;
        this.isGood = isGood != null;
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

    public Boolean getIsKing() {
        return isKing;
    }

    public void setIsKing(Boolean king) {
        isKing = king;
    }

    public Boolean getIsGood() {
        return isGood;
    }

    public void setIsGood(Boolean good) {
        isGood = good;
    }

}
