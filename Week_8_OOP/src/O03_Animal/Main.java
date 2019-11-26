package O03_Animal;

public class Main {
    public static void main(String[] args) {

        Animal dog = new Animal(10);
        Animal cat = new Animal(10);
        Animal monkey = new Animal(10);

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
