package I04_GardenApp_2;

import java.util.ArrayList;
import java.util.List;

public class Garden {

    List<Plant> listOfPlants;

    public Garden() {
        listOfPlants = new ArrayList<>();
    }

    public void addPlant(Plant plant) {
        listOfPlants.add(plant);
    }

    public void watering(double wateringAmount) {

        System.out.printf("Watering with %.0f\n", wateringAmount);
        List<Plant> thirstyPlants = new ArrayList<>();
        for (int i = 0; i < listOfPlants.size(); i++) {
            if (listOfPlants.get(i).needWater()) {
                thirstyPlants.add(listOfPlants.get(i));
            }
        }
        for (int i = 0; i < thirstyPlants.size(); i++) {
            double waterAmountForOnePlant = wateringAmount / thirstyPlants.size();
            thirstyPlants.get(i).setCurrentWater(waterAmountForOnePlant * thirstyPlants.get(i).getAbsorbLevel());
        }
    }

    public void getInfo(){
        for (int i = 0; i < listOfPlants.size(); i++) {
            listOfPlants.get(i).introduce();
        }
    }

}


