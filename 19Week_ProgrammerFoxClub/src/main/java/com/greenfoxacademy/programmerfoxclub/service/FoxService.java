package com.greenfoxacademy.programmerfoxclub.service;

import com.greenfoxacademy.programmerfoxclub.model.Drink;
import com.greenfoxacademy.programmerfoxclub.model.Food;
import com.greenfoxacademy.programmerfoxclub.model.Fox;
import com.greenfoxacademy.programmerfoxclub.model.Trick;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class FoxService {
    private ArrayList<Fox> foxList;

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

    private List<Trick> trickTrickList = new ArrayList<>(Arrays.asList(
            new Trick("coding"),
            new Trick("dancing"),
            new Trick("singing"),
            new Trick("reading"),
            new Trick("writing")));

    public void removeTrick (Trick trick){
        for (int i = 0; i < getTrickTrickList().size(); i++) {
            if (getTrickTrickList().get(i).getTrickName().equals(trick.getTrickName())){
                getTrickTrickList().remove(i);
            }
        }
    }

    public void addAction (String action, String name, String actionType){
        getFox(name).addAction(action, actionType);
    }

    public void addFox(Fox fox) {
        foxList.add(fox);
    }

    public void setFood (String name, String food){
        getFox(name).addAction(food, "food");
        getFox(name).setFood(food);
    }

    public void setDrink (String name, String drink){
        getFox(name).addAction(drink, "drink");
        getFox(name).setDrink(drink);
    }

    public Fox getFox(String name) {
        for (Fox fox : foxList) {
            if (fox.getName().equals(name)) {
                return fox;
            }
        }
        return null;
    }

    public void addTrick (Trick trick, String name){
        if (trick.getTrickName() != null){
            getFox(name).addAction(trick.toString(), "trick");
            getFox(name).addTrick(trick);
        }
    }

    public List<String> getActionList (String name){
        List<String> reservedList = new ArrayList<>();
        for (int i = getFox(name).getActionList().size() - 1; i >= 0; i--) {
            reservedList.add(getFox(name).getActionList().get(i));
        }
        return reservedList;
    }

    public FoxService() {
        foxList = new ArrayList<>();
    }

    public List<Drink> getDrinkList() {
        return drinkList;
    }

    public List<Food> getFoodList() {
        return foodList;
    }

    public List<Trick> getTrickTrickList() {
        return trickTrickList;
    }

}

