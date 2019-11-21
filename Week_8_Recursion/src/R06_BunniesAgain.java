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

    // 6 bunnies
    //  bunnies line 1.  2.  3.  4.  5.  6.
    // ears number:  2   3   2   3   2   3

    // 5 bunnies
    //  bunnies line 1.  2.  3.  4.  5.
    // ears number:  2   3   2   3   2

//         return 2 + bunnyEar(n - 1);

    public static int bunnyEars (int n) {
        if (n == 0) {
            return 0;
        } else if (n % 2 == 0) {
            return 2 + bunnyEars(n - 1) + 3 + bunnyEars(n - 1);
        } else {
           // return 3 + bunnyEars( n - 1);
        }
        return 0;
    }

}
