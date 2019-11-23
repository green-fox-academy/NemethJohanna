import java.util.ArrayList;
import java.util.List;

public class D05_PersonalFinance {
    public static void main(String[] args) {

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
        System.out.println("We spent: " + sum);

        //Which was our greatest expense?
        int max = 0;
        for (int i = 0; i < expenses.size(); i++) {
            if (expenses.get(i) > max){
                max = expenses.get(i);             }
        }
        System.out.println("The greatest expense is: " + max);

        //Which was our cheapest spending?
        int min = 0;
        for (int i = expenses.size() - 1; i >= 0; i--) {
            if (expenses.get(i) < min){
                min = expenses.get(i);             }
        }
        System.out.println("The cheapest spending is: " + min);

        //What was the average amount of our spendings?*/
        System.out.println("The average spending was: " + sum/expenses.size());
    }
}
