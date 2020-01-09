package P05_Counter;

public class Counter {

    int originalNumber;
    int counter;

    public Counter(int counter) {
        this.counter = counter;
        this.originalNumber = counter;
    }

    public Counter(){
        this.counter = 0;
    }

    public void add (int numberToAdd){
        this.counter += numberToAdd;
    }

    public void add (){
        this.counter++;
    }

    public int get(){
        return this.counter;
    }

    public int reset(){
        return this.counter = originalNumber;
    }
}
