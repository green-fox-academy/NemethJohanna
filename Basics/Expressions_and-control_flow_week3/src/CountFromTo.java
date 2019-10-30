// Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5

import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write here the first number: ");
        int Number1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please write here the second number: ");
        int Number2= scanner.nextInt();
        scanner.nextLine();

        if (Number1 >= Number2) {
            System.out.println("The second number should be bigger!");
        }
        // If it is bigger it should count from the first number to the second by one
        if (Number1 < Number2) {
            for (int a = Number1; a < Number2; a++) {
                System.out.println(a);
            };
        }
    }
}
