import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class D04_MapIntroduction2 {
    public static void main(String[] args) {

        HashMap<String, String> list = new HashMap<>();
        list.put("978-1-60309-452-8" , "A Letter to Jo");
        list.put("978-1-60309-459-7" , "Lupus");
        list.put("978-1-60309-444-3" , "Red Panda and Moon Bear");
        list.put("978-1-60309-461-0" , "The Lab");

        //Print all the key-value pairs in the following format
        //A Letter to Jo (ISBN: 978-1-60309-452-8)
        for (Map.Entry<String, String> thing : list.entrySet()){
            System.out.printf("%s (ISBN: %s)\n" , thing.getValue(), thing.getKey());
        }

        //Remove the key-value pair with key 978-1-60309-444-3
        list.remove("978-1-60309-444-3");

        //Remove the key-value pair with value The Lab
        list.values().remove("The Lab");

        //Add the following key-value pairs to the map
        list.put("978-1-60309-450-4" , "They Called Us Enemy");
        list.put("978-1-60309-453-5" , "Why Did We Trust Him?");

        //Print whether there is an associated value with key 478-0-61159-424-8 or not
        System.out.println(list.containsKey("478-0-61159-424-8"));

        //Print the value associated with key 978-1-60309-453-5
        System.out.println(list.get("978-1-60309-453-5"));
    }
}
