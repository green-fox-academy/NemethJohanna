package AnimalProtection;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
        this.setHealCost((int) (Math.random() * 6));
    }


}
