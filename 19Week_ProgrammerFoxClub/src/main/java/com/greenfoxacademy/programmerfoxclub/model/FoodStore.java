package com.greenfoxacademy.programmerfoxclub.model;

import java.util.ArrayList;
import java.util.List;

public class FoodStore {

    private List<String> foodList;

    public FoodStore(){
        foodList = new ArrayList<>();
        foodList.add("meat");
        foodList.add("grass");
        foodList.add("seeds");
    }

    public List<String> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<String> foodList) {
        this.foodList = foodList;
    }
}
