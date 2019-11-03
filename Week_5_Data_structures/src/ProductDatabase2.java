import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ProductDatabase2 {
    public static void main (String [] args){

        //Create an application which solves the following problems.

        HashMap<String, Integer> products2 = new HashMap<>();
        products2.put("eggs", 200);
        products2.put("milk", 200);
        products2.put("fish", 400);
        products2.put("apples", 150);
        products2.put("bread", 50);
        products2.put("chicken", 550);

        // Which products cost less than 201? (just the name)
        for (Map.Entry <String , Integer> element : products2.entrySet()){
            if (element.getValue() < 201) {
                System.out.println(element.getKey());
            }
        }


        //Which products cost more than 150? (name + price)
        for (Map.Entry <String , Integer> element2 : products2.entrySet()){
            if (element2.getValue() > 150) {
                System.out.println(element2.getKey() + " is cost " + element2.getValue() + "  --> cost more than 150.");
            }
        }





    }
}
