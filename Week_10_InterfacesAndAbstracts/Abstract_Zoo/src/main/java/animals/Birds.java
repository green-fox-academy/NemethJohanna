package main.java.animals;

public class Birds extends Animal {

    private String name;

    public Birds(String name) {
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
