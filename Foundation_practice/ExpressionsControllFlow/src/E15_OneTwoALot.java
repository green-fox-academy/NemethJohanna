import java.util.Scanner;

public class E15_OneTwoALot {
    // Write a program that reads a number form the standard input,
// If the number is zero or smaller it should print: Not enough
// If the number is one it should print: One
// If the number is two it should print: Two
// If the number is more than two it should print: A lot
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write here a number: ");
        int userInput = scanner.nextInt();

        if (userInput <= 0){
            System.out.println("NOt enough");
        } else if (userInput == 1){
            System.out.println("One");
        } else if (userInput == 2){
            System.out.println("Two");
        } else {
            System.out.println("A lot");
        }



    }
}
