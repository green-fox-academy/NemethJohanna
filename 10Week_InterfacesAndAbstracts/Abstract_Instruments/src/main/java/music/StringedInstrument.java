package main.java.music;

public abstract class StringedInstrument extends Instrument {

    private int numberOfStrings;

    public StringedInstrument(String name, int numberOfStrings) {
        super(name);
        this.numberOfStrings = numberOfStrings;
    }

    protected abstract void sound();

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void play (){
        System.out.println(this.name + ", a " + this.getNumberOfStrings() + "-stringed instrument, that goes ");
        this.sound();
    }

}
