package AnimalProtection;

import java.util.ArrayList;
import java.util.List;

public class AnimalShelter {

    private int budget;
    private List<Animal> animalList = new ArrayList<>();
    private List<String> adoptersName = new ArrayList<>();

    public AnimalShelter() {
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

    public int heal() {
        int healedAnimals = 0;
        for (int i = 0; i < animalList.size(); i++) {
            if ((!animalList.get(i).isHealthy()) && (animalList.get(i).getHealCost() < budget)) {
                this.animalList.get(i).heal();
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
        List<Animal> adoptableAnimals = new ArrayList<>();
        int random = (int) (Math.random() * adoptableAnimals.size());
        for (int i = 0; i < animalList.size(); i++) {
            if (animalList.get(i).isAdoptable()) {
                animalList.remove(random);
                break;
            }
        }
        for (int i = 0; i < adoptersName.size(); i++) {
            adoptersName.remove((int) (Math.random() * (adoptersName.size())));
            break;
        }
    }

    public int earnDonation(int donationAmount) {
        return budget += donationAmount;
    }

    @Override
    public String toString() {
        String toString = "";
        toString += "Budget: " + budget + "$\n";
        toString += "There are " + animalList.size() + " animal(s) and " + adoptersName.size() + " potential adopter(s).\n";
        for (int i = 0; i < animalList.size(); i++) {
            toString += animalList.get(i).toString();
        }
        return toString;
    }

}
