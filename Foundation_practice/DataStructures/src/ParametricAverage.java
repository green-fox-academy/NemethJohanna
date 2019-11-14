import java.util.Scanner;

public class ParametricAverage {
    // Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write here a number that will the number of your numbers: ");
        int numberOfNumbers = scanner.nextInt();

        for (int i = 0; i < numberOfNumbers; i++) {
            scanner.nextInt(i);
        }

    }
}
