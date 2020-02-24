package com.greenfoxacademy.programmerfoxclub.service;

import com.greenfoxacademy.programmerfoxclub.model.DrinkStore;
import com.greenfoxacademy.programmerfoxclub.model.FoodStore;
import com.greenfoxacademy.programmerfoxclub.model.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FoxService {
    private ArrayList<Fox> foxList;
    private FoodStore foodStore;
    private DrinkStore drinkStore;

    public FoxService() {
        foxList = new ArrayList<>();
        drinkStore = new DrinkStore();
        foodStore = new FoodStore();
    }

    public FoodStore getFoodStore() {
        return foodStore;
    }

    public DrinkStore getDrinkStore() {
        return drinkStore;
    }

    public void add (Fox fox){
        foxList.add(fox);
    }

//    public boolean check (Fox fox){
//        return foxList.contains(fox);
//    }
//
//    public List<Fox> findAll (){
//        return foxList;
//    }
//
//    public void addFood (){
//
//    }
//
//    public void addDrink(){
//
//    }

}

