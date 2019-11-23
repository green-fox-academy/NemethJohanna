import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class D03_ListIntroduction2 {
    public static void main(String[] args) {

        ArrayList<String> listA = new ArrayList<>();
        listA.add("Apple");
        listA.add("Avocado");
        listA.add("Blueberries");
        listA.add("Durian");
        listA.add("Lychee");

        ArrayList<String> listB = new ArrayList<>();
        listB = listA;

        //Print out whether List A contains Durian or not
        System.out.println(listA.contains("Durian"));

        //Remove Durian from List B
        listB.remove("Durian");

        //Add Kiwifruit to List A after the 4th element
        listA.add(4, "Kiwifruit");

        //Compare the size of List A and List B
        int sizeA = listA.size();
        int sizeB = listB.size();
        if (sizeA > sizeB){
            System.out.println("The listA size is bigger.");
        } else if (sizeA < sizeB){
            System.out.println("The listB size is bigger");
        } else {
            System.out.println("They are the same size");
        }

        //Get the index of Avocado from List A
        System.out.println("The avocado's index is: " + listA.indexOf("Avocado"));

        //Get the index of Durian from List B
        System.out.println("The durian's index is: " + listB.indexOf("Durian"));

        //Add Passion Fruit and Pomelo to List B in a single statement
        listB.addAll(Arrays.asList("Passion Fruit" , "Pomelo"));

        //Print out the 3rd element from List A
        System.out.println("The listA's third element is: " + listA.get(2));

    }
}
