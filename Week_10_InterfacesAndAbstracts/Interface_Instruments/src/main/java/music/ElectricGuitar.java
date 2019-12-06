package main.java.music;

public class ElectricGuitar extends StringedInstrument {

    public int getNumberOfStrings() {
        return 6;
    }

    private int numberOfStrings;
    private String name = "Electric guitar";

    public String getName() {
        return name;
    }

    public ElectricGuitar(int numberOfStrings) {
        super();
        this.numberOfStrings = 6;
    }

    public ElectricGuitar() {
        super();
    }

    public void sound(){
        System.out.print("Twang");
    }

    @Override
    public void play() {
        System.out.println(this.getName() + ", a " + this.getNumberOfStrings() + "-stringed instrument, that goes ");
        this.sound();
    }
}
