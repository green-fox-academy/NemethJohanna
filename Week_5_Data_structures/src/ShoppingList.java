import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ShoppingList {
    public static void main (String[] args) {

         //We are going to represent a shopping list in a list containing strings.

        ArrayList<String> shoppingList = new ArrayList<>(Arrays.asList("eggs", "milk", "fish", "apples", "bread", "chicken"));

        System.out.println(shoppingList);

        //Do we have milk on the list?
        //Do we have bananas on the list?
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Do we have on the list? Write here what you are looking for: ");
        String search = Scanner.nextLine();
        if (shoppingList.contains(search)) {
            System.out.println("Yes, we have " + search + ".");
        } else {
            System.out.println("We don't have " + search + "!");
        }

    }
}
