package AnimalProtection;

public class Parrot extends Animal {

    public Parrot() {
        this.healCost = (int)((Math.random() * 7) + 4);
    }
}
