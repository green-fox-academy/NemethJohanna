import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class D01_ListIntroduction1 {

    public static void main(String[] args) {

        // Create an empty list which will contain names (strings)
            ArrayList<String> names = new ArrayList<>();

        // Print out the number of elements in the list
            System.out.println("The number of elements is: " + names.size());

        // Add William to the list
            names.add("William");

        // Print out whether the list is empty or not
            System.out.println(names.isEmpty());

        //Add John to the list, Add Amanda to the list
            names.add("John");
            names.add("Amanda");

         //Print out the number of elements in the list
        System.out.println("The number of elements is: " + names.size());

        // Print out the 3rd element
        System.out.println("The third element is: " + names.get(2));


        //Iterate through the list and print out each name // William // John // Amanda
        Iterator namesIter = names.iterator();
        while (namesIter.hasNext()) {
            System.out.println(namesIter.next());
        }
        //Iterate through the list and print
        ListIterator listNames = names.listIterator();
        for (int i = 0; i < names.size(); i++) {
            System.out.printf("%d. %s\n" , i + 1 , names.get(i));
        }

        //Remove the 2nd element
        names.remove(1);

        //Iterate through the list in a reversed order and print out each name
        ListIterator listNames2 = names.listIterator();
        for (int i = names.size() - 1; i >= 0; i--) {
            System.out.println(names.get(i));
        }

        //Remove all elements
        names.clear();
        for (int i = 0; i < names.size(); i++) {
            System.out.println("The names are: " + names.get(i));
        }

    }
}
