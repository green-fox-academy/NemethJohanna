package FishTank;

public class Kong extends Fish {

    public Kong() {
        this.name = "Kong";
        this.weight = 0;
        this.color = "green";
    }

    @Override
    public void feed() {
        //Kong, gains 2 grams when fed.
        this.weight +=2;
    }
}
