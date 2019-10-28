// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stored number is lower
// You found the number: 8

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please guess the number: ");
        int GuessNumber = scanner.nextInt();
        scanner.nextLine();

        int number = 8;
            while (GuessNumber > number) {
                    System.out.println ("The stored number is lower. Please guess the number again: ");
                    scanner.nextLine();

            }




            }

}