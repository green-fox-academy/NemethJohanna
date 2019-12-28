package I03_AircraftCarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {

    private String name;
    private int healthPoints;
    private int storageAmmo;
    private List<Aircraft> aircrafts;

    public Carrier(String name, int storageAmmo, int healthPoints) {
        this.name = name;
        this.storageAmmo = storageAmmo;
        this.healthPoints = healthPoints;
        aircrafts = new ArrayList<>();
    }

    //It should take a new aircraft and add it to its storage
    public void add (Aircraft aircraft){
        this.aircrafts.add(aircraft);
    }

    // It should fill all the aircraft with ammo and subtract the needed ammo from the ammo storage
    // If there is not enough ammo then it should start to fill the aircrafts with priority first
    // If there is no ammo when this method is called, it should throw an exception.
    public void fill() throws NoAmmoException{
        for (int i = 0; i < aircrafts.size(); i++) {
            aircrafts.get(i).refill(storageAmmo);

        }
    }

    // It should take another carrier as a reference parameter and fire all the ammo from the aircrafts to it,
    // then subtract all the damage from its health points
    public void fight(Carrier carrier){

    }


    // It should return a string about itself and all of its aircrafts' statuses in the following format:
    public void getStatus(){
        for (int i = 0; i < aircrafts.size(); i++) {
            aircrafts.get(i).getStatus();
        }
    }


}
