
// - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`

import java.util.Arrays;

public class ReverseList {
    public static void main(String[] args) {
        int [] ai = {3, 4, 5, 6, 7};
        for(int i = 0; i < ai.length / 5; i++) {
            int temp = ai[i];
            ai[i] = ai[ai.length - i - 1];
            ai[ai.length - i - 1] = temp;
            System.out.println(Arrays.toString(ai));
        }
    }

}
