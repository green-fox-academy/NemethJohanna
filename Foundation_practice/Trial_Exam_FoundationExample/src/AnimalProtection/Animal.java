package AnimalProtection;

public abstract class Animal {
    private String ownerName;
    private String name;
    private boolean isHealthy;
    private int healCost;

    public Animal(String name) {
        this.name = name;
    }

    /* public Animal(String name; String ownerName; boolean isHealthy; int healCost){
        this.name = name;
        ..
        ..
        ..
     */

    public boolean isAdoptable(Animal animal) {
        return animal.isHealthy();
    }

    public void heal(){
        isHealthy = true;
    }

    @Override
    public String toString(){
        String toString = "";
        if (this.isHealthy = false){
            toString = this + " is not healthy, " + this.healCost + "$, and not adoptable";
        } else {
            toString = this + " is healthy, and adoptable";
        }
        return toString;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public boolean isHealthy() {
        return isHealthy;
    }

    public void setHealthy(boolean healthy) {
        isHealthy = healthy;
    }

    public int getHealCost() {
        return healCost;
    }

    public void setHealCost(int healCost) {
        this.healCost = healCost;
    }
}
