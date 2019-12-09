package main.java.music;

public class Violin extends StringedInstrument {

    private static String name = "Violin";
    private static int numberOfStrings = 4;

    public Violin() {
        super(name, numberOfStrings);
    }

    @Override
    public int getNumberOfStrings() {
        return 4;
    }

    public String getName() {
        return name;
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
