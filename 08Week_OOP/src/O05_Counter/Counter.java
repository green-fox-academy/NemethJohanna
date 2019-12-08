package O05_Counter;

public class Counter {

    /*Create Counter class which has an integer field value

    or we can specify it when creating.

    Check if everything is working fine with the proper test
    Download CounterTest.java and place it next to your solution
    If something's red in it, ALT+Enter Add JUnit5 to classpath (5 aka
    JUnit FIVE not 4 or 3)
    Then run the tests with the green play button before the lines
    (run all of them before the classname)*/

    private int counter;
    private int initNr;

    //when creating it should have a default value 0
    public Counter(){
        this.counter = 0;
        this.initNr = 0;
    }

     // or we can add() without parameters just increasing the
     // counter's value by one.
    public void addOne(){
        this.counter++;
    }
    public Counter(int counter){
        this.counter = counter;
        this.initNr = counter;
    }

    // we can add(number) to this counter another whole number
    public void add(int number){
        this.counter += number;
    }

    // and we can get() the current value
    public int get(){
        return this.counter;
    }

    // also we can reset() the value to the initial value

    public int reset(){
        return this.counter = this.initNr;
    }

    public void add() {
    }
}
