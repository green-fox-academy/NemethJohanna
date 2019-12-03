package I02_GardenApplication;

public class Flower extends Plant {

    private double absorbLevel;

    public Flower(String color, int currentWaterAmount){
        super(color, currentWaterAmount);
        this.absorbLevel = 0.75;
    }




}
