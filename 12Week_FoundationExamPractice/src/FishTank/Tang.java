package FishTank;

public class Tang extends Fish {

    public Tang(String name) {
        this.name = name;
        this.weight = 0;
        this.color = "blue";
    }

    @Override
    public void feed() {
        //Tang, gains 1 gramm when fed and can suffer short-term memory loss.
        this.weight++;
        this.shortTermMemoryLoss = true;
    }
}
