import java.util.Scanner;

public class DivideByZero {
    // Create a function that takes a number
    // divides ten with it,
    // and prints the result.
    // It should print "fail" if the parameter is 0

    public static void main (String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write here a number: ");
        int userInput = scanner.nextInt();

        try {
            System.out.println(10 / userInput);
        } catch (ArithmeticException zero) {
            System.out.println("fail");
        }


//        if (userInput > 10) {
//            System.out.println("fail");
//        } else if (userInput < 1) {
//            System.out.println("fail");
//        } else {
//            System.out.println("10 divided by " + userInput + " is " + 10 / userInput + ".");
//        }


    }
}
