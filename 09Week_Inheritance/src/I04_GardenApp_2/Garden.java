package I04_GardenApp_2;

import java.util.ArrayList;
import java.util.List;

public class Garden {

    List<Plant> listOfPlants;

    public Garden (){
        listOfPlants = new ArrayList<>();
    }

    public void addPlant(Plant plant){
        listOfPlants.add(plant);
    }

    public void watering(double wateringAmount){
        List<Plant> thirstyPlants = new ArrayList<>();
        for (int i = 0; i < listOfPlants.size(); i++) {
            if (listOfPlants.get(i).needWater()){
                thirstyPlants.add(listOfPlants.get(i));
            }

        }

    }
}
