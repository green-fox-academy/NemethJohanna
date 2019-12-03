package I02_GardenApplication;

import java.util.ArrayList;
import java.util.List;

public class Garden {

    private String name;
    private List<Tree> trees;
    private List<Flower> flowers;
    private List<Plant> plants;

    public Garden(String name){
        this.name = name;
        plants = new ArrayList<>();
        trees = new ArrayList<>();
        flowers = new ArrayList<>();
    }

    public void addPlants (Plant plants) {

        if (plants instanceof Tree){
            trees.add((Tree)plants);
        } else if (plants instanceof Flower){
            flowers.add((Flower)plants);
        }
    }

    public void getInfo(){
        for (int i = 0; i < plants.size(); i++) {
        }
    }

    public int watering (int wateringAmount){

    }
}
