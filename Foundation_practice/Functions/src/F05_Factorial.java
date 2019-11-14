import java.util.Scanner;

public class F05_Factorial {

// - Create a function called `factorio`
//   that returns it's input's factorial
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please writhe here a number: ");
        int userInput = scanner.nextInt();
        System.out.println("Your numbers factorial is: " + factorio(userInput));

    }
    public static int factorio (int number){

        int input = 1;
        for (int i = 1; i <= number; i++) {
            input *= i;
        }
        return input;

    }

}
