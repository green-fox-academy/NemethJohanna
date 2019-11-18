import java.util.Scanner;

public class E24_GuessTheNumber {
    // Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The storied number is lower
// You found the number: 8

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Guess the number: ");
        int userNr = scanner1.nextInt();

        int guessNr = 8;

        while (userNr != guessNr) {
            if (userNr > guessNr) {
                System.out.println("The stored number is lower. Please guess again: ");
                int b = scanner1.nextInt();
                userNr = b;
            } else if (userNr < guessNr) {
                System.out.println("The stored number is higher. Please guess again: ");
                 int c = scanner1.nextInt();
                 userNr = c;
            }
        }
        System.out.println("You found the number: " + guessNr);

    }
}
