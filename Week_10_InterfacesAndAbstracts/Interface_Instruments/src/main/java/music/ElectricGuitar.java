package main.java.music;

public class ElectricGuitar extends StringedInstrument {

    private String name = "Electric guitar";
    private int numberOfStrings = 6;

    public ElectricGuitar() {
        super();
    }

    public ElectricGuitar(int numberOfStrings){
        super();
        setNumberOfStrings(numberOfStrings);
    }

    public void sound() {
        System.out.print("Twang");
    }

    @Override
    public void play() {
        System.out.print(this.getName() + ", a " + this.getNumberOfStrings() + "-stringed instrument, that goes ");
        this.sound();
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String getName() {
        return name;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }
}
