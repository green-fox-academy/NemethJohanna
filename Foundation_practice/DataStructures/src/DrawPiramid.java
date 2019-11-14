import java.util.Scanner;

public class DrawPiramid {
    // Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write here a number: ");
        int userInput = scanner.nextInt();

        for (int i = 0; i < userInput * 2 - 1; i++) {
            for (int j = 0; j < userInput; j++) {
                System.out.println("*");
            }
        }

    }
}
