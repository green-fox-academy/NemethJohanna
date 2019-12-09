package I02_GardenApplication;

public class Plant {

    private String color;
    private String type;
    private int currentWaterAmount;
    private double absorbLevel;
    private boolean isThirsty;
    private int thirstyLevel;

    public Plant(String color) {
        this.color = color;
        this.currentWaterAmount = 0;
    }

    public boolean setIsThirsty() {                         // public boolean isThirsty (){
        if (currentWaterAmount < this.thirstyLevel) {       //   return currentWaterAmount < absorbLevel;
            this.isThirsty = true;                          // }
        } else {
            this.isThirsty = false;
        }
        return this.isThirsty;
    }

    public String thirstyLevelToPrint() {                   // @Override
        if (this.setIsThirsty()) {                          // public String toString(){
            return "needs water";                           //
        } else {
            return "doesn't need water";
        }
    }

    public void introduce() {
        System.out.printf("The %s %s and %s\n", color, type, thirstyLevelToPrint());
    }

    public void setType(String type) {
        this.type = type;
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

    public boolean isThirsty() {
        if (currentWaterAmount < thirstyLevel) {
            this.isThirsty = true;
        } else {
            this.isThirsty = false;
        }
        return this.isThirsty;
    }

    public void setThirstyLevel(int thirstyLevel) {
        this.thirstyLevel = thirstyLevel;
    }
}
