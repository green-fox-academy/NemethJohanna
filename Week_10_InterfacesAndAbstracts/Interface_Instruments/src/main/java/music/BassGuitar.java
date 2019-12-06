package main.java.music;

public class BassGuitar extends StringedInstrument {

    private String name = "\nBass guitar";
    private int numberOfStrings = 4;

    public BassGuitar() {
    }
    public BassGuitar(int numberOfStrings){
        super();
        setNumberOfStrings(numberOfStrings);
    }

    @Override
    public int getNumberOfStrings() {
        return numberOfStrings;
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

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }
}
