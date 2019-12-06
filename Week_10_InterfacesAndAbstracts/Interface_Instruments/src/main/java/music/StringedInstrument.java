package main.java.music;

public abstract class StringedInstrument extends Instrument {

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    private int numberOfStrings;

    public StringedInstrument(String name, int numberOfStrings) {
        super(name);
        this.numberOfStrings = numberOfStrings;
    }

    public StringedInstrument() {
        super();
    }

    protected abstract void sound();

    public void play (){
        System.out.println(this.name + ", a " + this.getNumberOfStrings() + "-stringed instrument, that goes ");
        this.sound();
    }

}
