import java.util.HashMap;
import java.util.Map;
import java.util.function.DoubleToIntFunction;

public class ShoppingList2 {
    public static void main (String[] args) {

        HashMap<String , Double> priceList = new HashMap<>();
        priceList.put("milk" , 1.07);
        priceList.put("rice" , 1.59);
        priceList.put("eggs" , 3.14);
        priceList.put("cheese" , 12.0);
        priceList.put("chicken breast" , 9.40);
        priceList.put("apples" , 2.31);
        priceList.put("tomato" , 2.58);
        priceList.put("potato" , 1.75);
        priceList.put("onion" , 1.10);


        HashMap<String , Integer> BobsList = new HashMap<>();

        BobsList.put("milk" , 3);
        BobsList.put("rice" , 2);
        BobsList.put("eggs" , 2);
        BobsList.put("cheese" , 1);
        BobsList.put("chicken breast" , 4);
        BobsList.put("apples" , 1);
        BobsList.put("tomato" , 2);
        BobsList.put("potato" , 1);


        HashMap<String , Integer> AliceList = new HashMap<>();

        AliceList.put("rice" , 1);
        AliceList.put("eggs" , 5);
        AliceList.put("chicken breast" , 2);
        AliceList.put("apples" , 1);
        AliceList.put("tomato" , 10);


        //How much does Bob pay?
        double sumBob = 0;
        for (Map.Entry<String, Integer> data : BobsList.entrySet()) {
            sumBob += priceList.get(data.getKey()) * data.getValue();
        }
        System.out.println("Bod paid: " + (sumBob));


        //How much does Alice pay?
        double sumAlice = 0;
        for (Map.Entry<String, Integer> data : AliceList.entrySet()) {
            sumAlice += priceList.get(data.getKey()) * data.getValue();
        }
        System.out.println("Alice paid: " + (sumAlice));


        //Who buys more Rice?
        if (BobsList.get("rice") < AliceList.get("rice")) {
            System.out.println("Alice buys more rice!");
        }
        else if (BobsList.get("rice") == AliceList.get("rice")) {
            System.out.println("They buy the same amount of rice!");
        } else {
            System.out.println("Bob buys more rice!");
        }


        //Who buys more Potato?
        if ((BobsList.containsKey("potato") && AliceList.containsKey("potato")) == true) {
            if (BobsList.size() > AliceList.size()) {
                System.out.println("Bob buy more different product.");
            } else if (BobsList.size() < AliceList.size()) {
                System.out.println("Alice buy more different product.");
            } else {
                System.out.println("They buy the same amount of potato.");
            }
        }
        else if ((BobsList.containsKey("potato")) == false) {
            System.out.println("Alice buy more potato.");
        }
        else if ((AliceList.containsKey("potato")) == false) {
            System.out.println("Bob buy more potato.");
        }

        //Who buys more different product?
        if ((BobsList.size()) > AliceList.size()) {
            System.out.println("Bob buys more different products.");
        } else if ((BobsList.size()) < AliceList.size()) {
            System.out.println("Alice buys more different products.");
        } else {
            System.out.println("They buy the same amount of products.");
        }


        //Who buys more products? (piece)
        int sumBobs = 0;
        for (Integer pieceBob : BobsList.values()) {
            sumBobs += pieceBob;
        }

        int sumAlices = 0;
        for (Integer pieceAlice : AliceList.values()) {
            sumAlices += pieceAlice;
        }

        if (sumBobs > sumAlices) {
            System.out.println("Bob buys more pieces of products.");
        } else if (sumBobs < sumAlices) {
            System.out.println("Alice buys more pieces of products.");
        } else {
            System.out.println("They buy the same size of products.");
        }








    }
}

