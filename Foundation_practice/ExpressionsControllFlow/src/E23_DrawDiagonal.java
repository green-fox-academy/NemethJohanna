import sun.font.FontRunIterator;

import java.util.Scanner;

public class E23_DrawDiagonal {
    // Write a program that reads a number from the standard input, then draws a
// square like this:
//
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
//
// The square should have as many lines as the number was

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please write here a number: ");
        int num = scanner1.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i == j || i == 1 || j == 1 || i == num || j == num) {
                    System.out.print("@");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
