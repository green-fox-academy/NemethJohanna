package I02_GardenApplication;

import java.util.ArrayList;
import java.util.List;

public class Garden {

    private String name;
    private List<I02_GardenApplication.Plant> plants;

    public Garden(String name) {
        this.name = name;
        plants = new ArrayList<>();
    }

    public void addPlants(Plant plant) {
        this.plants.add(plant);
    }

    public void getInfo() {
        for (int i = 0; i < this.plants.size(); i++) {
            plants.get(i).introduce();
        }
    }

    // a plant osztályba kellene rakni, hogy máshonnan is lehessen locsolni!
    public void watering(int wateringAmount) {
        System.out.printf("\nWatering with %d\n", wateringAmount);

        List<Plant> thirstyPlants = new ArrayList<>();

        for (int i = 0; i < plants.size(); i++) {
            if (plants.get(i).setIsThirsty()) {
                thirstyPlants.add(plants.get(i));
            }
        }

        for (int i = 0; i < thirstyPlants.size(); i++) {
            int waterForOnePlant = wateringAmount / thirstyPlants.size();
            thirstyPlants.get(i).setCurrentWaterAmount((int) (waterForOnePlant * thirstyPlants.get(i).getAbsorbLevel()));
        }

    }

}
