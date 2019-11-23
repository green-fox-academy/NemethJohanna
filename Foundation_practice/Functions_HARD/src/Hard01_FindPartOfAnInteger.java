import java.util.ArrayList;

public class Hard01_FindPartOfAnInteger {
    public static void main(String[] args) {
        //  Create a function that takes a number and an array of integers as a parameter
        //  Returns the indices of the integers in the array of which the first number is a part of
        //  Or returns an empty array if the number is not part of any of the integers in the array

        //  Example:
        //System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
        //  should print: `[0, 1, 4]`
        //System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
        //  should print: '[]'

        int n = 1;
        int[] array = new int[]{1, 11, 34, 52, 61};
        System.out.println(subInt(n, array));
    }

    public static ArrayList subInt(int n, int[] array) {
        ArrayList<Integer> arrays = new ArrayList<Integer>();

        for (int i = 0; i < array.length; i++) {                        //  végig megyek for ciklussal a listán
            char[] chars = String.valueOf(array[i]).toCharArray();      //  a listám i-dik elemének az értékét karakterekre bontom
            for (int j = 0; j < chars.length; j++) {                    //  végig megyek a karakterek hosszán
                char nToChar = Integer.toString(n).charAt(0);           //  az n int-et karakterré alakítom
                if (chars[j] == nToChar) {                              //  feltétel meghatározás
                    arrays.add(i);                                      //  hozzáadom az új listához
                    break;
                }
            }
        }
        return arrays;
    }
}
