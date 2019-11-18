import java.util.Scanner;

public class E22_DrawTriangle {
    // Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please write here a number: ");
        int num = scanner1.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}