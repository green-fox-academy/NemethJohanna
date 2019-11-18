import java.util.Scanner;

public class H05_PrintBigger {
    // Write a program that asks for two numbers and prints the bigger one

    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("PLease write here two numbers, separate by spaces: ");
        int nr1 = scanner.nextInt();
        int nr2 = scanner.nextInt();

        if (nr1 > nr2) {
            System.out.println(nr1 + " is the bigger number.");
        } else if (nr2 > nr1){
            System.out.println(nr2 + " is the bigger number.");
        } else {
            System.out.println("The two numbers are equals.");
        }

    }

}
