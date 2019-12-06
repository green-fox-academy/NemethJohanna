package main.java.animals;

public abstract class Animal {

    private String name;
    private int age;
    private String gender;
    private int weight;
    private int height;

    public void breed(){
    }

    public boolean canFly(){
        return true;
    }

    public abstract void breeding();

    public String getName() {
        return name;
    }
}
