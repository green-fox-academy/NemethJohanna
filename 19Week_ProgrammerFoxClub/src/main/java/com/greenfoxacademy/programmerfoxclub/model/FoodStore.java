package com.greenfoxacademy.programmerfoxclub.model;

import java.util.ArrayList;
import java.util.List;

public class FoodStore {

    private List<String> food;

    public FoodStore(){
        food = new ArrayList<>();
        food.add("meat");
        food.add("grass");
        food.add("seeds");
    }

}
