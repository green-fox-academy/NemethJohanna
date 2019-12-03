package I02_GardenApplication;

public class Tree extends Plant {

    private double absorbLevel;

    public Tree(String color, int currentWaterAmount){
        super(color, currentWaterAmount);
        this.absorbLevel = 0.4;
    }

    public void watering (int wateringAmount) {

        super.watering();
    }


}
