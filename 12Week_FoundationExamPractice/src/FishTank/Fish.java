package FishTank;

public abstract class Fish {
    String name;
    int weight;
    String color;
    boolean shortTermMemoryLoss;

    public abstract void feed ();

    public void status (){
        //or example: Dory, weight: 9, color: blue, short-term memory loss: true
        System.out.printf("%s, weight: %d, color: %s, short-term memory loss: %b\n", this.name, this.weight, this.color, this.shortTermMemoryLoss);
    }
}
