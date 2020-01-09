package P08_DiceSet;

public class Main {

    public static void main(String[] args) {
        // You have a `DiceSet` class which has a list for 6 dice
        // You can roll all of them with roll()
        // Check the current rolled numbers with getCurrent()
        // You can reRoll with reRoll()
        // Your task is to roll the dice until all of the dice are 6

        DiceSet diceSet = new DiceSet();
        diceSet.roll();
        for (int i = 0; i < 6; i++) {
            while (diceSet.getCurrent(i) != 6){
                diceSet.reRoll(i);
            }
            System.out.println(diceSet.getCurrent());
        }

    }
}
