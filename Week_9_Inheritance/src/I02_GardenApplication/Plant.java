package I02_GardenApplication;

public class Plant {

    private String color;
    private int currentWaterAmount;
    private double absorbLevel;
    private int needWateringLimit;

    public void getType() {
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String type;

    public Plant (String color, int currentWaterAmount, double absorbLevel, int needWateringLimit){
        this.color = color;
        this.currentWaterAmount = 0;
        this.absorbLevel = absorbLevel;
        this.needWateringLimit = needWateringLimit;
    }

    public Plant() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCurrentWaterAmount() {
        return currentWaterAmount;
    }

    public void setCurrentWaterAmount(int currentWaterAmount) {
        this.currentWaterAmount = currentWaterAmount;
    }

    public double getAbsorbLevel() {
        return absorbLevel;
    }

    public void setAbsorbLevel(double absorbLevel) {
        this.absorbLevel = absorbLevel;
    }

    public int getNeedWateringLimit() {
        return needWateringLimit;
    }

    public int setNeedWateringLimit(int wateringLimit) {
        return wateringLimit;
    }

    public void introduce (){
        System.out.printf("The %s %s and ", color, type);
    }

    public int watering (int wateringAmount){
        if (getCurrentWaterAmount() < setNeedWateringLimit()){
            return getCurrentWaterAmount() += wateringAmount;
        }
        return getCurrentWaterAmount() += wateringAmount;
    }

    public int setNeedWateringLimit() {
        return 0;
    }
}
