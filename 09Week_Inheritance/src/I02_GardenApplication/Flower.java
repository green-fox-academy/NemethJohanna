package I02_GardenApplication;

public class Flower extends Plant {

    public Flower(String color) {
        super(color);
        this.setAbsorbLevel(0.75);
        this.setThirstyLevel(5);
        this.setType("flower");
    }

}
