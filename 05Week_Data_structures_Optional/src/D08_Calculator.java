import java.util.Scanner;

public class D08_Calculator {
    public static void main(String... args) {

        Scanner Scanner = new Scanner(System.in);
        System.out.println("Please type in the expression (f.e.: + 2 3): ");
        String input = Scanner.nextLine();
        System.out.println("The result is: " + calculate(input));
    }
    public static int calculate (String input){
        String[] splitInput = input.split(" ", 3);
        String operation = splitInput[0];
        int operand1 = Integer.valueOf(splitInput[1]);
        int operand2 = Integer.valueOf(splitInput[2]);

        int result = 0;
        if (operation.equals("+")){
            result = operand1 + operand2;
        } else if (operation.equals("-")){
            result = operand1 - operand2;
        } else if (operation.equals("*")){
            result = operand1 * operand2;
        } else if (operation.equals("/")){
            result = operand1 / operand2;
        } else {
            System.out.println("Invalid operation!");
        }
        return result;
    }
}
