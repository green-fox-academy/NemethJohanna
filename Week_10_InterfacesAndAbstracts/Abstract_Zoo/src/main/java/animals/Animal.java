package main.java.animals;

public abstract class Animal {

    private String name;
    private int age;
    private String gender;
    private int weight;
    private int height;

    //public abstract void Animal (String name);

    public abstract String breed();

    public String getName() {
        return name;
    }
}
