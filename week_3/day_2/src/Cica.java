import java.util.Scanner;

public class Cica {

    public static void main(String[] args) {
        int firstNumber = 1;
        double doubleNumber = 1.5;

        // declaring a integer variable called secondNumber
        int secondNumber;
        // assigning the value 3 to secondNumber
        secondNumber = 3;

        // creating a character variable with the value a
        char letter = 'a';

        // create a new integer variable called thirdNumber, which is the sum of the values of firstNumber and secondNumber
        int thirdNumber = firstNumber + secondNumber;
        System.out.println(thirdNumber);

        // increase the value of thirdNumber by 1
        thirdNumber++;
        System.out.println(thirdNumber);

        // add 5 to the value of thirdNumber
        // the next two lines do the same
        thirdNumber = thirdNumber + 5;
        thirdNumber += 5;
        System.out.println(thirdNumber);

        // create a boolean variable to compare the two integers
        boolean isThirdBigger = thirdNumber != firstNumber;
        System.out.println(isThirdBigger);

        System.out.println();
        System.out.println("boolean operators");
        boolean isHungry = true;
        boolean isSleepy = false;
        System.out.println(isHungry || isSleepy);

        // printing out Strings and concatenating them together
        String name = "Furkesz";
        System.out.println("Hello " + name + "!");
        String anotherString = "Hello " + thirdNumber + "!";
        System.out.println(anotherString);

        // if statement for checking the value of the thirdNumber variable
        System.out.println();
        System.out.println("if statement");
        thirdNumber--;
        if (thirdNumber == 15) {
            System.out.println("third number is 15");
        } else if (thirdNumber < 15) {
            System.out.println("third number is lower than 15");
        } else if (thirdNumber > 15) {
            System.out.println("third number is bigger than 15");
        }

        // Scanner for getting input
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("please write me something here");
        String bejovo = scanner.nextLine();
        System.out.println("this was the input: " + bejovo);

        // Getting a number from the input
        System.out.println("please write a number here");
        int givenNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("your number is: " + givenNumber);

        // FOR - printing out the numbers from 0 - 10
        for(int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        // WHILE - printing the numbers from the 'a' variable
        int a = 4;
        System.out.println();
        System.out.println("while loop");
        while (a < 10) {
            System.out.println(a);
            a++;
        }

        // DO-WHILE - printing the numbers from the 'b' variable
        int b = 3;
        System.out.println("do-while loop");
        do {
            System.out.println(b);
            b++;
        } while (b < 10);

        // If-else for printing a different greeting per name
        System.out.println("please tell me your name");
        String myName = scanner.nextLine();
        String output;
        if (myName.equals("Furkesz")) {
            output = "Hi Furkesz";
        } else if (myName.equals("Bela")) {
            output = "Nice to meet you Bela";
        } else if (myName.equals("Karoly")) {
            output = "What is up Karoly";
        } else {
            output = "Please leave the room";
        }
        System.out.println("Output from if-else: " + output);


        // Switch for the same exercise as the previous one
        switch (myName) {
            case "Furkesz":
                output = "Hi Furkesz";
                break;
            case "Bela":
                output = "Nice to meet you Bela";
                break;
            case "Karoly":
                output = "What is up Karoly";
                break;
            default:
                output = "Please leave the room";
                break;
        }
        System.out.println("Output from switch: " + output);
    }
}