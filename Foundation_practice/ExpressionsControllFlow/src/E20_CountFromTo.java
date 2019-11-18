import java.util.Scanner;

public class E20_CountFromTo {
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

    public static void main (String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please write here a number: ");
        int num1 = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please write here another number: ");
        int num2 = scanner2.nextInt();

        if (num2 <= num1){
            System.out.println("The second number should be bigger");
        } else if (num2 > num1){
            for (int i = num1 + 1; i < num2; i++) {
                System.out.println(i);
            }
        }


    }
}
