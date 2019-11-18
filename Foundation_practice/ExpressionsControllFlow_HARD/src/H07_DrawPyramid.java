import java.util.Scanner;

public class H07_DrawPyramid {
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
        System.out.println("PLease write here two numbers, separate by spaces: ");
        int nr = scanner.nextInt();

        for (int i = 0; i < nr; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
