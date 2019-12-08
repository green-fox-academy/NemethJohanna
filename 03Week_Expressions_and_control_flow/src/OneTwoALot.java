import java.util.Scanner;
public class OneTwoALot {

    // Write a program that reads a number form the standard input,
// If the number is zero or smaller it should print: Not enough
// If the number is one it should print: One
// If the number is two it should print: Two
// If the number is more than two it should print: A lot
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write here a number: ");
        int givenNumber = scanner.nextInt();
        scanner.nextLine();

        if (givenNumber == 0) {
            System.out.println("Not enough");
        } else if (givenNumber < 0) {
            System.out.println("Not enough!");
        } else if (givenNumber == 1){
            System.out.println("ONE");
        } else if (givenNumber == 2){
            System.out.println("TWO");
        } else {
            System.out.println("A LOT");
        }
    }
}
