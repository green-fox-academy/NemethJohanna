import main.java.animals.*;

public class Zoo {
    public static void main(String[] args) {

        Reptiles reptile = new Reptiles("crocodile");
        Mammals mammal = new Mammals("koala");
        Birds bird = new Birds("parrot");

        System.out.println("How do you breed?");
        System.out.println("A " + reptile.getName() + " is breeding by " + reptile.breed());
        System.out.println("A " + mammal.getName() + " is breeding by " + mammal.breed());
        System.out.println("A " + bird.getName() + " is breeding by " + bird.breed());

        bird.fly();
    }
}
