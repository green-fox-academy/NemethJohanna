
import java.util.*;

public class D05_ElementFinder {
    public static void main(String... args){
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(containsSeven(arrayList));
    }

    public static boolean containsSeven(ArrayList<Integer> arrayList){
        boolean result = arrayList.contains(7);
        if(result){
            System.out.println("Hoorray");
        } else {
            System.out.println("Nooooooo");
        }

        return result;
    }
}
