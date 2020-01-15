package AnimalProtection;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Cat1");
        Dog dog1 = new Dog("Dog1");
        Cat cat2 = new Cat("Cat2");
        Dog dog2 = new Dog("Dog2");
        Parrot parrot1  = new Parrot("Parrot1");
        Parrot parrot2  = new Parrot("parrot2");

        AnimalShelter shelter = new AnimalShelter();

        shelter.rescue(cat1);
        shelter.rescue(cat2);
        shelter.rescue(dog1);
        shelter.rescue(dog2);
        shelter.rescue(parrot1);
        shelter.rescue(parrot2);

        shelter.heal();
        shelter.heal();
        shelter.addAdopter("Joe");
        shelter.addAdopter("Amy");
        //shelter.addAdopter("John");

        shelter.findNewOwner();

        System.out.println(shelter);

    }
}
