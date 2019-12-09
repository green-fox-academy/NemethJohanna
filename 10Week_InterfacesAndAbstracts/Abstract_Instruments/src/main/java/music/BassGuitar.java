package main.java.music;

public class BassGuitar extends StringedInstrument {

    private static String name = "Bass guitar";
    private static int numberOfStrings = 4;

    public BassGuitar() {
        super(name, numberOfStrings);
    }
    public BassGuitar(int numberOfStrings){
        super(name, numberOfStrings);
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
}
