package I02_GardenApplication;

public class Main {
    public static void main(String[] args) {

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
        annaGarden.getInfo();
        annaGarden.watering(70);
        annaGarden.getInfo();
    }
}
