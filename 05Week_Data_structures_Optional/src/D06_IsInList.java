import java.util.*;

public class D06_IsInList {
    public static void main(String... args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
        //checkNums(list);
        System.out.println(checkNums(list));
    }

    private static boolean checkNums(ArrayList<Integer> list) {
        boolean isTrue = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.contains(4) && list.contains(8) && list.contains(12) && list.contains(16)){
                isTrue = true;
            }
        }
        return isTrue;
    }
}
