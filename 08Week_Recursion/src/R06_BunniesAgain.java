import java.util.ArrayList;
import java.util.List;

public class R06_BunniesAgain {
    public static void main(String[] args) {
        //We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears.
        // The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot.
        // Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

        int bunnies = 6;
        System.out.println(bunnyEars(bunnies));

    }

    // 4 bunnies --> 2 * 2 + 2 * 3 = 10 ears
    // 10 bunnies --> 5 * 2 + 5 * 3 = 25 ears
    //  bunnies line    1.  2.  3.  4.
    // nr of ears :     2   3   2   3

    // 5 bunnies --> 2 * 2 + 3 * 3 --> 12 ears
    // 7 bunnies --> 3 * 2 + 4 * 3 --> 18 ears
    //  bunnies line    1.  2.  3.  4.  5.
    // nr of ears :     2   3   2   3   2

    public static int bunnyEars (int n) {
        if (n == 0) {
            return 0;
        } else if (n % 2 == 0) {
            return n / 2 * bunnyEars(n - 1)  + n / 2 * bunnyEars(n - 2);
        } else {
           // return 3 + bunnyEars( n - 1);
        }
        return 0;
    }

}
