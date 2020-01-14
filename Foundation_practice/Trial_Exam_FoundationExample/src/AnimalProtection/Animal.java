package AnimalProtection;

public abstract class Animal {
    String ownerName;
    boolean isHealthy;
    int healCost;

    public Animal() {
    }

    public boolean isAdoptable(Animal animal) {
        return animal.isHealthy;
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
}
