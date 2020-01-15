package AnimalProtection;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
        this.setHealCost((int)((Math.random() * 8) + 1));
    }
}
