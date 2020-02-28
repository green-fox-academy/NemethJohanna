package com.greenfoxacademy.programmerfoxclub.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Fox {

    private String name;
    private String food;
    private String drink;
    private List<Trick> ownTrickList;
    private List<String> actionList;

    public Fox(String name, String food, String drink, List<Trick> trickList) {
        this.setName(name);
        this.setFood(food);
        this.setDrink(drink);
        this.ownTrickList = new ArrayList<>();
        this.actionList = new ArrayList<>();
    }

    public void addTrick(Trick trick) {
        if (trick != null) {
            ownTrickList.add(trick);
        }
    }

    public void addAction (String action, String actionType){
        if (actionType.equals("food")) {
            actionList.add(date() + ": Food has been changed from: " + getFood() + " to: " + action);
        } else if (actionType.equals("drink")){
            actionList.add(date() + ": Drink has been changed from: " + getDrink() + " to: " + action);
        } else if (actionType.equals("trick")){
            actionList.add(date() + ": Learned to: " + action);
        }
    }

    public String date(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy. MMMM dd. HH:mm:ss");
        return now.format(formatter);
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

    public List<String> getActionList() {
        return actionList;
    }




}
