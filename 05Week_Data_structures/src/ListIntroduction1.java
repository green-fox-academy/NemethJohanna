import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIntroduction1 {
    public static void main(String[] args) {

        //Create an empty list which will contain names (strings)
        ArrayList<String> names = new ArrayList<>();
        //Print out the number of elements in the list
        System.out.println(names.size());

        //Add William to the list
        names.add("William");
        //Print out whether the list is empty or not
        System.out.println(names.isEmpty());

        //Add John to the list
        names.add("John");
        //Add Amanda to the list
        names.add("Amanda");

        //Print out the number of elements in the list
        System.out.println(names.size());
        //Print out the 3rd element
        System.out.println(names.get(2));

        System.out.println();

        //Iterate through the list and print out each name
        Iterator indivNames = names.iterator();
        while(indivNames.hasNext()){
            System.out.println(indivNames.next());
        }

        //Iterate through the list and print
        ListIterator listNames = names.listIterator();
        for (int i = 0; i < names.size(); i++) {
            System.out.printf("%d. %s\n",i + 1, names.get(i));
        }

        System.out.println();

         //Remove the 2nd element
         names.remove(1);
         //Iterate through the list in a reversed order and print out each name
            Iterator removedNamesList = names.iterator();
            while(removedNamesList.hasNext()) {
                System.out.println(removedNamesList.next());
            }

         //Remove all elements
        names.clear();

        System.out.println();

        System.out.println(names.isEmpty());

    }
}
