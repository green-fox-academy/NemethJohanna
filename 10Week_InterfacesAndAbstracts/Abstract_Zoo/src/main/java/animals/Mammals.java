package main.java.animals;

public class Mammals extends Animal {

    private String name;

    public Mammals(String name) {
        this.name = name;
    }

    @Override
    public String breed() {
        return "pushing miniature versions out.";
    }

    @Override
    public String getName() {
        return name;
    }
}
