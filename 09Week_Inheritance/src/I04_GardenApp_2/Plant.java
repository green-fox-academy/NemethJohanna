package I04_GardenApp_2;

public abstract class Plant {

    private double currentWater;
    private String color;
    private double absorbLevel;
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract boolean needWater();

    public void introduce(){
        if(this.needWater()){
            System.out.printf("The %s %s needs water\n", this.color, this.type);
        } else {
            System.out.printf("The %s %s doesn't need water\n", this.color, this.type);
        }
    }

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

}
