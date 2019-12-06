package main.java.music;

public class Violin extends StringedInstrument {

    private String name = "Violin";

    @Override
    public int getNumberOfStrings() {
        return 4;
    }

    public String getName() {
        return name;
    }

    public Violin() {
    }

    @Override
    public void sound() {
        System.out.println("Screech");
    }

    @Override
    public void play() {
        System.out.print(this.getName() + ", a " + this.getNumberOfStrings() + "-stringed instrument, that goes ");
        this.sound();
    }
}
