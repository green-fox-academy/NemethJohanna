package I04_GardenApp_2;

public abstract class Plant {

    private double currentWater;
    private String color;
    private int thirstyLevel;
    private double absorbLevel;

    public abstract boolean needWater();

    public void setCurrentWater(double currentWater) {
        this.currentWater = currentWater;
    }

    public double getAbsorbLevel() {
        return absorbLevel;
    }

    public void setAbsorbLevel(double absorbLevel) {
        this.absorbLevel = absorbLevel;
    }

    public double getCurrentWater() {
        return currentWater;
    }

    public void setCurrentWater(int currentWater) {
        this.currentWater = currentWater;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getThirstyLevel() {
        return thirstyLevel;
    }

    public void setThirstyLevel(int thirstyLevel) {
        this.thirstyLevel = thirstyLevel;
    }
}
