import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hard_06_SortList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(12);
        list.add(24);
        list.add(9);
        list.add(5);

        bubble(list);
        advancedBubble(list, true);
    }

    public static void bubble(List<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            Collections.sort(list);
        }
        System.out.println(list);
    }

    public static void advancedBubble(List<Integer> list, boolean trueOrFalse){
        if (trueOrFalse == true){
            for (int i = 0; i < list.size(); i++) {
                list.sort(Collections.reverseOrder());
            }
            System.out.println(list);
        }
    }

}
