package main.java.animals;

public class Reptiles extends Animal {

    private String name;

    public Reptiles(String name) {
        this.name = name;
    }

    @Override
    public String breed() {
        return "laying eggs.";
    }

    @Override
    public String getName() {
        return name;
    }
}
