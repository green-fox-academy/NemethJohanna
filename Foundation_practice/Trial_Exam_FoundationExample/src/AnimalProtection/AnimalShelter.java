package AnimalProtection;

import java.util.ArrayList;
import java.util.List;

public class AnimalShelter {

    private int budget;
    private List<Animal> animalList = new ArrayList<>();
    private List<String> adoptersName = new ArrayList<>();

    public void AnimalShelter() {
        this.budget = 50;
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
            if (animalList.get(i).isHealthy() == (false && animalList.get(i).getHealCost() > this.budget)) {
                animalList.get(i).heal();
                healedAnimals++;
                break;
            }
        }
        return healedAnimals;
    }

    public void addAdopter(String adoptersName) {
        this.adoptersName.add(adoptersName);
    }


    public void findNewOwner() {
        for (int i = 0; i < animalList.size(); i++) {
            animalList.remove((int) (Math.random() * (animalList.size() + 1)));
        }
        for (int i = 0; i < adoptersName.size(); i++) {
            adoptersName.remove((int) (Math.random() * (adoptersName.size() + 1)));
        }
    }

    public int earnDonation(int donationAmount) {
        return budget += donationAmount;
    }

    @Override
    public String toString() {
        String toString = "";
        toString += "Budget: " + budget + "$";
        toString += "There are " + animalList.size() + " animal(s) and " + adoptersName.size() + " potential adopter(s)";
        toString += animalList.toString();
        return toString;
    }

}
