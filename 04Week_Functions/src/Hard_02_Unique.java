import java.util.Arrays;

public class Hard_02_Unique {
    public static void main(String[] args) {
        unique(new int[]{1, 11, 34, 11, 52, 61, 1, 34});
    }

    public static void unique(int[] listToFindUnique) {
        Arrays.sort(listToFindUnique);
        for (int i = 0; i < listToFindUnique.length; i++) {
            while (i < listToFindUnique.length - 1 && listToFindUnique[i] == listToFindUnique[i + 1]) {
                i++;
            }
            System.out.println(listToFindUnique[i]);
        }
    }
}
