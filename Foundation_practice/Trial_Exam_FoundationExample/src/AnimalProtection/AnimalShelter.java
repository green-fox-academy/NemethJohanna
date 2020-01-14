package AnimalProtection;

import java.util.ArrayList;
import java.util.List;

public class AnimalShelter {

    int budget;
    List<Animal> animalList;
    List<String> adoptersName;

    public void AnimalShelter() {
        this.budget = 50;
        animalList = new ArrayList<>();
    }

    public int rescue(Animal animalToRescue) {
        animalList.add(animalToRescue);
        int animalListSize = 0;
        for (int i = 0; i < animalList.size(); i++) {
            animalListSize++;
        }
        return animalListSize;
    }

    public int heal(Animal animal) {
        int healedAnimals = 0;
        for (int i = 0; i < animalList.size(); i++) {
            if (animalList.get(i).isHealthy = false && animalList.get(i).healCost > this.budget) {
                animalList.get(i).heal();
                healedAnimals++;
                break;
            }
        }
        return healedAnimals;
    }

    public void addAdopter(String name) {
        adoptersName.add(name);
    }

    /*this method pairs a random name with a random adoptable Animal if it is possible
        and removes both of them from the lists*/

//    public void findNewOwner(){
//        for (int i = 0; i < animalList.size(); i++) {
//            animalList.get((int)(Math.random() * (animalList.size() + 1))).
//        }
//    }

    public int earnDonation(int donationAmount){
        return budget += donationAmount;
    }

    @Override
    public String toString(){
        String toString = "";

        return toString;
    }

}
