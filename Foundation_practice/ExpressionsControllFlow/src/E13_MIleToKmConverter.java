import java.util.Scanner;

public class E13_MIleToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write here a number: ");
        double userInput = scanner.nextInt();
        //scanner.nextLine();

        userInput = userInput * 1.609344;
        System.out.println("This is " + userInput + " km.");

    }
}
