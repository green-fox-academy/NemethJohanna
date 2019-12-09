package main.java.animals;

public class Birds extends Animal implements Flyable{

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

    @Override
    public void land() {
        System.out.println("Landing....");
    }

    @Override
    public void fly() {
        System.out.println("Flying...");
    }
}
