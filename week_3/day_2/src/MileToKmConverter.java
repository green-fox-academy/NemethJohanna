import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write here a number as miles: ");
        double givenNumber = scanner.nextInt();
        scanner.nextLine();

        givenNumber = givenNumber * 1.609344;
        System.out.println("This is " +  givenNumber + "km.");




    }
}