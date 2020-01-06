import java.util.*;

class QuoteSwap {
    public static void main(String... args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

        quoteSwap(list);

    }

    public static void quoteSwap(ArrayList<String> list) {

        Collections.swap(list, 2, 5);

        for (String print : list){
            System.out.print(print + " ");
        }

    }
}
