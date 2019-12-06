import main.java.animals.*;

public class Zoo {
    public static void main(String[] args) {

        Reptiles reptile = new Reptiles("Crocodile");
        Mammals mammal = new Mammals("Koala");
        Birds bird = new Birds("Parrot");

        System.out.println("How do you breed?");
        System.out.println("A " + reptile.getName() + " is breeding by " + reptile.breed());
        System.out.println("A " + mammal.getName() + " is breeding by " + mammal.breed());
        System.out.println("A " + bird.getName() + " is breeding by " + bird.breed());



    }
}
