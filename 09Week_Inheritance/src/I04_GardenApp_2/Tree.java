package I04_GardenApp_2;

public class Tree extends Plant {

    public Tree(String color){
        this.setColor(color);
        this.setThirstyLevel(10);
        this.setAbsorbLevel(0.4);
    }

    @Override
    public boolean needWater() {
        return getCurrentWater() < 10;
    }
}
