// Create the usual class wrapper and main method on your own.

// Write a function called `sum` that returns the sum of numbers from zero to the given parameter
import java.util.Scanner;

public class F04_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write here a number: ");
        int givenNumber = scanner.nextInt();
        System.out.println(sum(givenNumber));
        }

   public static int sum (int number) {
        int output = 0;
        for (int i = 0; i <=number; i++) {
            output += i;
        }
        return output;
    }
}
