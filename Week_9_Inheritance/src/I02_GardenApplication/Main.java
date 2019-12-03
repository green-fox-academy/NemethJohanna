package I02_GardenApplication;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Garden> garden = new ArrayList<>();

        Tree purpleTree = new Tree("purple");
        Tree orangeTree = new Tree("orange");
        Flower yellowFlower = new Flower("yellow");
        Flower blueFlower = new Flower("blue");

        Garden annaGarden = new Garden("Anna Garden");
        annaGarden.addPlants(yellowFlower);
        annaGarden.addPlants(blueFlower);
        annaGarden.addPlants(purpleTree);
        annaGarden.addPlants(orangeTree);

        annaGarden.getInfo();

        annaGarden.watering(40);

        annaGarden.watering(70);
    }
}
