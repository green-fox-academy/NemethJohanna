package I04_GardenApp_2;

public class Flower extends Plant {

    public Flower(String color){
        this.setColor(color);
        this.setThirstyLevel(5);
        this.setAbsorbLevel(0.75);
    }

    public boolean needWater(){
        return getCurrentWater() < 5;
    }
}
