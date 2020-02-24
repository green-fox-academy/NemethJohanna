package com.greenfoxacademy.programmerfoxclub.model;

import java.util.ArrayList;
import java.util.List;

public class DrinkStore {

    private List<String> drink;

    public DrinkStore(List<String> drink){
        drink = new ArrayList<>();
        drink.add("water");
        drink.add("milk");
        drink.add("wine");
    }

}
