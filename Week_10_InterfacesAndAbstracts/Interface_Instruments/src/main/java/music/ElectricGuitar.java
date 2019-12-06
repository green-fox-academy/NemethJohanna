package main.java.music;

public class ElectricGuitar extends StringedInstrument {

    public int getNumberOfStrings() {
        return 6;
    }

    private String name = "Electric guitar";

    public String getName() {
        return name;
    }

    public ElectricGuitar() {
        super();
    }

    public void sound() {
        System.out.print("Twang");
    }

    @Override
    public void play() {
        System.out.print(this.getName() + ", a " + this.getNumberOfStrings() + "-stringed instrument, that goes ");
        this.sound();
    }
}
