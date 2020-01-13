package FishTank;

public class Kong extends Fish {

    public Kong(String name) {
        this.name = name;
        this.weight = 0;
        this.color = "green";
    }

    @Override
    public void feed() {
        //Kong, gains 2 grams when fed.
        this.weight +=2;
    }
}
