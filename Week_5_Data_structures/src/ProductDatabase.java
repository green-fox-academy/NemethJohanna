import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductDatabase {
    public static void main(String[] args) {

        /*We are going to represent our products in a map where the keys are strings representing the product's name and the values are numbers representing the product's price.
        Create a map with the following key-value pairs.*/

        HashMap<String, Integer> products = new HashMap<>();
        products.put("eggs", 200);
        products.put("milk", 200);
        products.put("fish", 400);
        products.put("apples", 150);
        products.put("bread", 50);
        products.put("chicken", 550);


        //How much is the fish?
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Write here the product that you would like to know the price: ");
        String search = Scanner.nextLine();
        if (products.containsKey(search)) {
            System.out.println("The " + search + "'s price is: " + products.get(search));
        } else {
            System.out.println("We don't have " + search + "!");
        }


        //What is the most expensive product?
        int mostExpensivePrice = Collections.max(products.values());
        String mostExpensiveProduct = "";
        for (Map.Entry <String , Integer> element : products.entrySet()){
            if (element.getValue() == mostExpensivePrice) {
                mostExpensiveProduct += element.getKey();
            }
        }
        System.out.println("The most expensive product is: " + mostExpensiveProduct);


        //What is the average price?
        int sum = 0;
        for (int prices : products.values()) {
            sum += prices;
        }
        System.out.println("The average price is: " + (sum / products.size()));


        //How many products' price is below 300?
        int mini = 0;
        for (Integer prices : products.values()) {
            if (prices < 300) {
                mini += 1;
            }
        }
        System.out.println("There are " + mini + " products below 300.");


        //Is there anything we can buy for exactly 125?
            if (products.containsKey(125)) {
                System.out.println("We can buy" + products.get(125) + " for exactly 125.");
            }
            else {
                System.out.println("We can buy nothing for 125.");}
        }

        //What is the cheapest product?
        /*int min = 1000000000;
        String cheapestProduct = "";
        for (Map.Entry<String, Integer> itemPrice) : products.entrySet()) {
            if (itemPrice.getValue() < min) {
                min = itemPrice.getValue();
                cheapestProduct = itemPrice.getKey();
            }
        }
        System.out.println("The cheapest product is: " + cheapestProduct);*/

    }
