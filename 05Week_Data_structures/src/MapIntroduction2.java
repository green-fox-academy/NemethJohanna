import javafx.util.Pair;

import java.util.*;

public class MapIntroduction2 {
    public static void main(String[] args) {

        //Create a map where the keys are strings and the values are strings with the following initial values

        HashMap<String, String> map = new HashMap<>();
        map.put("978-60309-452-8", "A Letter to Jo");
        map.put("978-60309-459-7", "Lupus");
        map.put("978-60309-444-3", "Red Panda and Moon Bear");
        map.put("978-60309-461-0", "The Lab");

        //Print all the key-value pairs in the following format
        for (Map.Entry<String, String> mapx : map.entrySet()) {
            System.out.printf("%s (ISBN: %s)\n", mapx.getValue(), mapx.getKey());
        }
        System.out.println();

        //Remove the key-value pair with key 978-1-60309-444-3
        map.keySet().remove("978-1-60309-444-3");
        for(String key: map.keySet()) {
            System.out.println(map.get(key) + " (ISBN: " + key + ")");
        }
        System.out.println();

        //Remove the key-value pair with value The Lab
        map.values().remove("The Lab");
        for(String key: map.keySet()) {
            System.out.println(map.get(key) + " (ISBN: " + key + ")");
        }
        System.out.println();

        //Add the following key-value pairs to the map
        map.put("978-1-60309-450-4"	, "They Called Us Enemy\n");
        map.put("978-1-60309-453-5" , "Why Did We Trust Him?\n");

        for (Map.Entry<String, String> mapx : map.entrySet()) {
            System.out.printf("%s (ISBN: %s)\n", mapx.getValue(), mapx.getKey());
        }
        System.out.println();

        //Print whether there is an associated value with key 478-0-61159-424-8 or not
        System.out.println(map.containsKey("478-0-61159-424-8"));

        //Print the value associated with key 978-1-60309-453-5
        System.out.println(map.get("978-1-60309-453-5"));
    }
}