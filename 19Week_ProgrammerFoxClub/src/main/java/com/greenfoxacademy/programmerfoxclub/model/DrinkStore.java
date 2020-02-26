package com.greenfoxacademy.programmerfoxclub.model;

import java.util.ArrayList;
import java.util.List;

public class DrinkStore {

    private List<String> drinkList;

    public DrinkStore(){
        drinkList = new ArrayList<>();
        drinkList.add("water");
        drinkList.add("milk");
        drinkList.add("wine");
    }

    public List<String> getDrinkList() {
        return drinkList;
    }

    public void setDrinkList(List<String> drinkList) {
        this.drinkList = drinkList;
    }
}
