package O08_DiceSet;

public class Main {
    public static void main(String[] args) {
        // You have a `DiceSet` class which has a list for 6 dice
        // You can roll all of them with roll()
        // Check the current rolled numbers with getCurrent()
        // You can reRoll with reRoll()
        // Your task is to roll the dice until all of the dice are 6


    // Addig dobok a 6 db kockával, amíg mindegyik értéke 6 lesz.
    // while loop-ot használok benne, if != 6-tal, akkor dobjon újra.

        DiceSet diceSet = new DiceSet();

        diceSet.roll();
        for (int i = 0; i < 6; i++) {
            while (diceSet.getCurrent(i) != 6)
                if (i != 6){
                    diceSet.reRoll(i);
                } else {
                    System.out.println(diceSet.getCurrent());
                }
            System.out.println(diceSet.getCurrent());
        }


//        System.out.println(diceSet.getCurrent());
//        System.out.println(diceSet.roll());
//        System.out.println(diceSet.getCurrent());
//        System.out.println(diceSet.getCurrent(5));
//        diceSet.reRoll();
//        System.out.println(diceSet.getCurrent());
//        diceSet.reRoll(4);
//        System.out.println(diceSet.getCurrent());

    }
}