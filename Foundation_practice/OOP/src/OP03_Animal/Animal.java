package OP03_Animal;

public class Animal {

    /*Create an Animal class
    - Every animal has a hunger value, which is a whole number +
    - Every animal has a thirst value, which is a whole number +
    - when creating a new animal object these values are created with the default 50 value +
    - Every animal can eat() which decreases their hunger by one
    - Every animal can drink() which decreases their thirst by one
    - Every animal can play() which increases both by one*/

    int hunger;
    int thirst;

    public Animal (){
        this.hunger = 50;
        this.thirst = 50;
    }

    public Animal (int hunger, int thirst) {
    }

    public void eat (){
        hunger--;
    }

    public void drink(){
        thirst--;
    }

    public void play(){
        hunger++;
        thirst++;
    }

}
