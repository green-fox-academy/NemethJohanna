import java.util.Scanner;

public class D14_Armstrong {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write here a number:");
        int numberToCheck = scanner.nextInt();

        isArmstrong(numberToCheck);

    }

    public static void isArmstrong (int numberToCheck){

        int originalNumber, remainder, result = 0;
        originalNumber = numberToCheck;
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, String.valueOf(numberToCheck).length());
            originalNumber /= 10;
        }
        if (result == numberToCheck)
            System.out.printf("The %d is an Armstrong number.", numberToCheck);
        else
            System.out.printf("The %d is not an Armstrong number.", numberToCheck);
    }

}
