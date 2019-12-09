package main.java.music;

public class ElectricGuitar extends StringedInstrument {

    private static String name = "Electric guitar";
    private static int numberOfStrings = 6;

    public ElectricGuitar() {
        super(name, numberOfStrings);
    }

    public ElectricGuitar(int numberOfStrings){
        super(name, numberOfStrings);
    }

    public void sound() {
        System.out.print("Twang\n");
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
