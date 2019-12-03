package I02_GardenApplication;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //ArrayList<Garden> garden = new ArrayList<>();

        Tree purpleTree = new Tree("purple", 7);
        Tree orangeTree = new Tree("orange", 8);
        Flower yellowFlower = new Flower("yellow", 2);
        Flower blueFlower = new Flower("blue", 3);


        Garden liliGarden = new Garden("Lili Garden");
        liliGarden.addFlowers(yellowFlower);
        liliGarden.addFlowers(blueFlower);
        liliGarden.addTrees(purpleTree);
        liliGarden.addTrees(orangeTree);

        liliGarden.watering();

    }
}
