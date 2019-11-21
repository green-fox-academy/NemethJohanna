import java.lang.reflect.Array;
import java.util.Arrays;

public class A11_SwapElements {
    // - Create an array variable named `abc`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `abc`

    public static void main(String[] args) {

        String[] abc = {"first" , "second" , "third"};

        String orig = abc[0];
        abc[0] = abc [2];
        abc[2] = orig;

        System.out.println(Arrays.toString(abc));

        for (int i = 0; i < abc.length; i++) {
            System.out.println(abc[i]);
        }
        System.out.println();

    }
}