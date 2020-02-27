package com.greenfoxacademy.programmerfoxclub.model;

import java.util.ArrayList;
import java.util.List;

public class Fox {

    private String name;
    private String food;
    private String drink;
    private List<Trick> ownTrickList;

    public Fox(String name, String food, String drink, List<Trick> trickList) {
        this.setName(name);
        this.setFood(food);
        this.setDrink(drink);
        this.ownTrickList = new ArrayList<>();
    }

    public void addTrick (Trick trick){
        if (!ownTrickList.equals(trick)){
            ownTrickList.add(trick);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public List<Trick> getOwnTrickList() {
        return ownTrickList;
    }

}
