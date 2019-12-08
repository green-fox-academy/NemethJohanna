import java.util.ArrayList;
import java.util.Arrays;

public class ListIntroduction2 {
    public static void main(String[] args) {

        //Create a list ('List A') which contains the following values
        //Apple, Avocado, Blueberries, Durian, Lychee
        ArrayList<String> list_A = new ArrayList<>();
        list_A.add("Apple");
        list_A.add("Avocado");
        list_A.add("Blueberries");
        list_A.add("Durian");
        list_A.add("Lychee");

        //Create a new list ('List B') with the values of List A
        ArrayList<String> list_B = new ArrayList<>();
        list_B.addAll(list_A);

        //Print out whether List A contains Durian or not
        System.out.println(list_A.contains("Durian"));

        //Remove Durian from List B
        list_B.remove("Durian");

        //Add Kiwifruit to List A after the 4th element
        list_A.add(5 , "Kiwifruit");

        //Compare the size of List A and List B
        System.out.println(list_A.equals(list_B));

        //Get the index of Avocado from List A
        System.out.println(list_A.indexOf("Avocado"));

        //Get the index of Durian from List B
        System.out.println(list_B.indexOf("Durian"));

        //Add Passion Fruit and Pomelo to List B in a single statement
        list_B.addAll(Arrays.asList("Passion Fruit" , "Pomelo"));
        System.out.println(list_B);

        //Print out the 3rd element from List A*/
        System.out.println(list_A.get(2));

    }
}
