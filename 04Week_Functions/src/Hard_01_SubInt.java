import java.util.ArrayList;
import java.util.List;

public class Hard_01_SubInt {
    public static void main(String[] args) {
        //  Example:
        System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
        //  should print: `[0, 1, 4]`

    }

    public static List<Integer> subInt(int numberIsElement, int[] listToCheck) {
        ArrayList<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < listToCheck.length; i++) {
            char[] chars = String.valueOf(listToCheck[i]).toCharArray();


        }

        return indexes;
    }
}
