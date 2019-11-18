package O03_Animal;

public class Main {
    public static void main(String[] args) {

        Animal dog = new Animal();
        Animal cat = new Animal();
        Animal monkey = new Animal();

        dog.eat();
        dog.drink();
        dog.play();
        dog.play();
        System.out.println(dog.hunger);

        cat.play();
        System.out.println(cat.thirst);

        monkey.eat();
        System.out.println(monkey.hunger);

    }
}
