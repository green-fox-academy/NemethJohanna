package FishTank;

public abstract class Fish {
    String name;
    int weight;
    String color;
    boolean shortTermMemoryLoss;


    public abstract void feed ();

    public void status (Fish fishType){
        //or example: Dory, weight: 9, color: blue, short-term memory loss: true
        System.out.printf("%s, weight: %d, color: %d, short-term memory loss: %b", this.name, this.weight, this.color, this.shortTermMemoryLoss);
    }
}
