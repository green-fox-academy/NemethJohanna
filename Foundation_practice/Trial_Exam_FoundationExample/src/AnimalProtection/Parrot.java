package AnimalProtection;

public class Parrot extends Animal {

    public Parrot(String name) {
        super(name);
        this.setHealCost((int)((Math.random() * 7) + 4));
    }
}
