import java.util.Scanner;

public class H09_DrawSquare {
    // Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%%
// %    %
// %    %
// %    %
// %    %
// %%%%%%
//
// The square should have as many lines as the number was

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("PLease write here a number: ");
        int nr = scanner.nextInt();

        for (int i = 1; i <= nr; i++) {
            for (int j = 1; j <= nr; j++) {
                if (j == 1 || i == 1 || j == nr || i == nr){
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
