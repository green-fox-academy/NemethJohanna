package P03_Animal;

public class Main {

    /*Create an Animal class
Every animal has a hunger value, which is a whole number
Every animal has a thirst value, which is a whole number
when creating a new animal object these values are created with the default 50 value
Every animal can eat() which decreases their hunger by one
Every animal can drink() which decreases their thirst by one
Every animal can play() which increases both by one*/

    public static void main(String[] args) {

        Animal elephant = new Animal();
        Animal dog = new Animal();

        elephant.eat();
        elephant.play();
        dog.drink();
        dog.play();

        System.out.println(elephant.hungerValue);
        System.out.println(elephant.thirstValue);
        System.out.println(dog.hungerValue);
        System.out.println(dog.thirstValue);

    }
}
