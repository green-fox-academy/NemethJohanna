package I04_GardenApp_2;

public class Flower extends Plant {

    public Flower(String color){
        this.setColor(color);
        this.setAbsorbLevel(0.75);
        this.setType("Flower");
    }

    @Override
    public boolean needWater(){
        return getCurrentWater() < 5;
    }

}
