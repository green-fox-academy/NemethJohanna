package I03_AircraftCarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {

    private String name;
    private List<Aircraft> aircrafts;

    public Carrier(String name) {
        this.name = name;
        aircrafts = new ArrayList<>();
    }

    //It should take a new aircraft and add it to its storage
    public void add (Aircraft aircraft){
        this.aircrafts.add(aircraft);
    }

    // It should fill all the aircraft with ammo and subtract the needed ammo from the ammo storage
    // If there is not enough ammo then it should start to fill the aircrafts with priority first
    // If there is no ammo when this method is called, it should throw an exception.
    public void fill(){

    }

    // It should take another carrier as a reference parameter and fire all the ammo from the aircrafts to it,
    // then subtract all the damage from its health points
    public void fight(String carrier){}


    // It should return a string about itself and all of its aircrafts' statuses in the following format:
    public void getStatus(){}


}
