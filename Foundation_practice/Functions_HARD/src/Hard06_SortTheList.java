import javax.swing.*;
import java.util.*;

public class Hard06_SortTheList {
     public static void main(String[] args) {
         //  Create a function that takes a list of numbers as parameter
         //  Returns a list where the elements are sorted in ascending numerical order
         //  Make a second boolean parameter, if it's `true` sort that list descending

         //  Example:
         //  System.out.println(bubble(new int[]{34, 12, 24, 9, 5}));
         //  should print [5, 9, 12, 24, 34]
         //  System.out.println(advancedBubble(new int[]{34, 12, 24, 9, 5}, true));
         //  should print [34, 24, 12, 9, 5]

         List<Integer> numList = Arrays.asList(34, 12, 24, 9, 5);
         List<Integer> number = bubble(numList);
         System.out.println(number);

         boolean statement = true;
         List<Integer> number2 = advancedBubble(numList, statement);
         System.out.println(number2);
     }

     public static List<Integer> bubble (List<Integer> input){
        List<Integer> asc = input;
        Collections.sort(asc);
        return new ArrayList(asc);
        }

     public static ArrayList advancedBubble(List<Integer> input, boolean trueStatement){
        if (trueStatement) {
            List<Integer> desc = input;
            //Collections.sort(desc);
            Collections.reverse(desc);
        }
        return new ArrayList(input);
     }
}