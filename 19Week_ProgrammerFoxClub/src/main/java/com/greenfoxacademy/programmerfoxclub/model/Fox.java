package com.greenfoxacademy.programmerfoxclub.model;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Fox {

    private String name;
    private FoodStore food;
    private DrinkStore drink;
    private List<String> tricks;

    public Fox(String name, FoodStore food, DrinkStore drink, List<String> tricks) {
        this.setName(name);
        this.setFood(food);
        this.setDrink(drink);
        this.tricks = tricks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FoodStore getFood() {
        return food;
    }

    public void setFood(FoodStore food) {
        this.food = food;
    }

    public DrinkStore getDrink() {
        return drink;
    }

    public void setDrink(DrinkStore drink) {
        this.drink = drink;
    }

    public List<String> getTricks() {
        return tricks;
    }

    public void setTricks(List<String> tricks) {
        this.tricks = tricks;
    }
}
