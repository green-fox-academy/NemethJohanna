package main.java.music;

public class BassGuitar extends StringedInstrument {

    private int numberOfStrings;

    public BassGuitar(int numberOfStrings) {
        super();
        this.numberOfStrings = 4;
    }

    public BassGuitar() {

    }

    public void play (){
        this.sound();
    }

    @Override
    public void sound() {
        System.out.println("Duum-duum-duum");
    }
}
