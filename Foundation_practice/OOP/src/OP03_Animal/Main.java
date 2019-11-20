package OP03_Animal;

public class Main {
    public static void main(String[] args) {
    /*Create an Animal class
        - Every animal has a hunger value, which is a whole number
        - Every animal has a thirst value, which is a whole number
        - when creating a new animal object these values are created with the default 50 value
        - Every animal can eat() which decreases their hunger by one
        - Every animal can drink() which decreases their thirst by one
        - Every animal can play() which increases both by one*/

        Animal dog = new Animal();
        Animal cat = new Animal();
        Animal horse = new Animal();
        Animal pig = new Animal();
        Animal cow = new Animal();

        dog.play();
        cat.eat();
        pig.drink();
        dog.eat();
        dog.eat();
        cow.play();

        System.out.println(dog.hunger + ", " + dog.thirst);
        System.out.println(cat.hunger + ", " + cat.thirst);
        System.out.println(horse.hunger + ", " + horse.thirst);
        System.out.println(pig.hunger + ", " + pig.thirst);
        System.out.println(cow.hunger + ", " + cow.thirst);


    }
}
