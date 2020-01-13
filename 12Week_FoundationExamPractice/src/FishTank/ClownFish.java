package FishTank;

public class ClownFish extends Fish {

    public ClownFish(String color) {
        this.name = "ClownFish";
        this.weight = 0;
        this.color = color;
    }

    @Override
    public void feed() {
        // ClownFish, gains 1 gram when fed and
        // has an additional color (color of the stripes).
        this.weight ++;


    }
}
