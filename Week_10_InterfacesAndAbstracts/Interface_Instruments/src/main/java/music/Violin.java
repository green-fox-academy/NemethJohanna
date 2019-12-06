package main.java.music;

public class Violin extends StringedInstrument{

    private int numberOfStrings;

    public Violin(int numberOfStrings) {
        super();
        this.numberOfStrings = 4;
    }

    public Violin() {
    }

    @Override
    public void sound() {
        System.out.println("Screech");
    }

    @Override
    public void play() {
        this.sound();
    }
}
