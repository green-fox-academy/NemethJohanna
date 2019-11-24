import java.util.Scanner;

public class Calculator {
    public static void main(String... args) {
        // Create a simple calculator application which reads the parameters from the prompt
        // and prints the result to the prompt.
        // It should support the following operations,
        // create a method named "calculate()":
        // +, -, *, /, % and it should support two operands.
        // The format of the expressions must be: {operation} {operand} {operand}.
        // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

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
