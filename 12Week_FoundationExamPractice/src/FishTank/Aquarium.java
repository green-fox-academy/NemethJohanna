package FishTank;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    List<Fish> aquarium;
    String name;

    public Aquarium(String name) {
        this.name = name;
        aquarium = new ArrayList<>();
    }


    public void addFish(Fish fish) {
        //It has an addFish() a method where you can add fishes to the aquarium.
        aquarium.add(fish);
    }

    public void removeFish() {
        //It has a removeFish() a method that removes the big fishes:
        //      A big fish's weight is at least 11 grams.
        for (int i = 0; i < aquarium.size(); i++) {
            if (aquarium.get(i).weight >= 11){
                aquarium.remove(i);
            }
        }
    }

    public void feed() {
        //It has a feed() method that feeds all the fishes in the aquarium:
        //  Increases the weight of every fish with the amount of grams they gain when fed.

    }

    public void getStatus() {
        //The aquarium has a getStatus() method it should print the status for each fish.

    }


}
