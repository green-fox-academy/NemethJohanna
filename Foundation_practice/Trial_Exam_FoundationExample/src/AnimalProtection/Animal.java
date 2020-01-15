package AnimalProtection;

public abstract class Animal {
    private String ownerName;
    private String name;
    private boolean isHealthy;
    private int healCost;

    public Animal(String name) {
        this.name = name;
        this.isHealthy = false;
    }

    public boolean isAdoptable() {
        if (this.isHealthy){
            return true;
        } else {
            return false;
        }
    }

    public void heal(){
        setHealthy(true);
    }

    @Override
    public String toString(){
        String toString = "";
        if (this.isHealthy){
            toString += this.getName() + " is healthy, and adoptable\n";
        } else {
            toString += this.getName() + " is not healthy, " + this.healCost + "$, and not adoptable\n";
        }
        return toString;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getName(){
        return name;
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
