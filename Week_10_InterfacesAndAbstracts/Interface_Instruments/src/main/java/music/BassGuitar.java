package main.java.music;

public class BassGuitar extends StringedInstrument {

    private String name = "\nBass guitar";

    public BassGuitar() {
    }

    @Override
    public int getNumberOfStrings() {
        return 4;
    }

    @Override
    public void sound() {
        System.out.println("Duum-duum-duum");
    }

    public void play() {
        System.out.print(this.getName() + ", a " + this.getNumberOfStrings() + "-stringed instrument, that goes ");
        this.sound();
    }

    public String getName() {
        return name;
    }
}
