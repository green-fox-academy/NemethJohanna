package I04_GardenApp_2;

public class Main {
    public static void main(String[] args) {

        Flower yellowFlower = new Flower("yellow");
        Flower blueFlower = new Flower("blue");
        Tree purpleTree = new Tree("purple");
        Tree orangeTree = new Tree("orange");

        Garden garden = new Garden();

        garden.addPlant(yellowFlower);
        garden.addPlant(blueFlower);
        garden.addPlant(purpleTree);
        garden.addPlant(orangeTree);

        

    }
}
