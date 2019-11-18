import java.util.Scanner;

public class E14_OddEven {
    // Write a program that reads a number from the standard input,
    // Then prints "Odd" if the number is odd, or "Even" if it is even.

    public static void  main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write here a number: ");
        int userInput = scanner.nextInt();

        if (userInput % 2 == 0){
            System.out.println("The number is an odd number.");
        } else{
            System.out.println("The number is an even number.");
        }

    }
}
