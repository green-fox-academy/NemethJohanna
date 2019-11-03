import java.util.*;

public class PersonalFinance {

    public static void main (String[] args) {
        //We are going to represent our expenses in a list containing integers.


        //Create a list with the following items.
        ArrayList<Integer> expenses = new ArrayList<>();
        expenses.add(500);
        expenses.add(1000);
        expenses.add(1250);
        expenses.add(175);
        expenses.add(800);
        expenses.add(120);

        //How much did we spend?
        int sum = 0;
        for (int i = 0; i < expenses.size(); i++) {
            sum += expenses.get(i);
        }
        System.out.println(sum);

        //Which was our greatest expense?
        System.out.println(Collections.max(expenses));

        //Which was our cheapest spending?
        System.out.println(Collections.min(expenses));

        //What was the average amount of our spendings?
        System.out.println(sum/expenses.size());

    }
}