import java.util.Scanner;

public class F04_Summing {
// Create the usual class wrapper and main method on your own.

// Write a function called `sum` that returns the sum of numbers from zero to the given parameter
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write here a number: ");
        int userInput = scanner.nextInt();
        System.out.println(sum(userInput));

    }

    public static int sum (int input){
        int sum = 0;
        for (int i = 0; i <= input; i++) {
            sum += i;
        }

        return sum;
    }

}
