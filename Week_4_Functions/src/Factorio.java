//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial.
// faktoriális = 5! = 1 * 2 * 3 * 4 * 5

public class Factorio {
    public static void main(String[] args) {

    int a = 5;
        System.out.println(factorial(a));
    }
    public static int factorial (int number) {
        int output = 1;
        for (int i = 1; i <= number; i++) {
            output *= i;
        }
        return output;
    }
}