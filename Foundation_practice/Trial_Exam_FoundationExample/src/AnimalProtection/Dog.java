package AnimalProtection;

public class Dog extends Animal {

    public Dog() {
        this.healCost = (int)((Math.random() * 8) + 1);
    }
}
