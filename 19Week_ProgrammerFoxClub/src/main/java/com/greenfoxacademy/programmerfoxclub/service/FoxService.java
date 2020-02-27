package com.greenfoxacademy.programmerfoxclub.service;

import com.greenfoxacademy.programmerfoxclub.model.Drink;
import com.greenfoxacademy.programmerfoxclub.model.Food;
import com.greenfoxacademy.programmerfoxclub.model.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class FoxService {
    private ArrayList<Fox> foxList;
    private ArrayList<String> trickList;

    private List<Drink> drinkList = new ArrayList<>(Arrays.asList(
            new Drink("milk"),
            new Drink("water"),
            new Drink("tea"),
            new Drink("wine")));

    private List<Food> foodList = new ArrayList<>(Arrays.asList(
            new Food("meat"),
            new Food("grass"),
            new Food("seeds"),
            new Food("worms")));

    public FoxService() {
        foxList = new ArrayList<>();
        trickList = new ArrayList<>();
    }

    public ArrayList<Fox> getFoxList() {
        return foxList;
    }

    public void addFox(Fox fox) {
        foxList.add(fox);
    }

    public Fox getFox(String name) {
        for (Fox fox : foxList) {
            if (fox.getName().equals(name)) {
                return fox;
            }
        }
        return null;
    }

    public List<Drink> getDrinkList() {
        return drinkList;
    }

    public List<Food> getFoodList() {
        return foodList;
    }

}

