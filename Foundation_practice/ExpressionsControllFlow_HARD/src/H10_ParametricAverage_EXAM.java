import java.util.Scanner;

public class H10_ParametricAverage_EXAM {
    // Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write here a number: ");
        int nr = scanner.nextInt();
        System.out.println("Please write here " + nr + " numbers: ");

        for (int i = 0; i < nr; i++) {
            scanner.nextInt();
        }

        int sum;
        int average;

        System.out.println("The sum of the: " + nr + " number is: " + sum + ", the average is: " + average);

    }
}
