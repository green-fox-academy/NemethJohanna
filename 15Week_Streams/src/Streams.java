import javax.xml.stream.events.Characters;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

        //EXERCISE 1
        //Write a Stream Expression to get the even numbers from the following list:
        List<Integer> evenNumbers = list.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("1 --> The even numbers: " + evenNumbers);

        //EXERCISE 2
        // Write a Stream Expression to get the squared value of the positive numbers from the following list:
        List<Integer> positiveSquared = list.stream()
                .filter(number -> number > 0)
                .map(n -> (int) Math.pow(n, 2))
                .collect(Collectors.toList());
        System.out.println("2 --> Positive numbers squared values are: " + positiveSquared);

        //EXERCISE 3
        // Write a Stream Expression to find which number squared value is more then 20 from the following list:
        List<Integer> squaredMoreThan20 = list.stream()
                .map(n -> (int) Math.pow(n, 2))
                .filter(number -> number > 20)
                .collect(Collectors.toList());
        System.out.println("3 --> The squared value is more than 20: " + squaredMoreThan20);


        //EXERCISE 4
        //Write a Stream Expression to get the average value of the odd numbers from the following list:
        OptionalDouble average = list.stream()
                .filter(number -> number % 2 != 0)
                .mapToInt(n -> n)
                .average();

        if (average.isPresent()) {
            System.out.println("4 --> The average is: " + average.getAsDouble());
        } else {
            System.out.println("4 --> Empty list");
        }


        // EXERCISE 5
        // Write a Stream Expression to get the sum of the odd numbers in the following list:
        List<Integer> numbers = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);
        long sumOfOddNumbers = numbers.stream()
                .filter(n -> n % 2 == 1)
                .mapToInt(n -> n)
                .sum();

        System.out.println("5 --> The sum of odd numbers: " + sumOfOddNumbers);


        // EXERCISE 6
        //Write a Stream Expression to find the uppercase characters in a string!
        String budapest = "BuDaPeSt";
        char[] charList = budapest.toCharArray();
        List<char[]> chars = Arrays.asList(charList);
       // chars.stream()
               // .filter(n -> Character.isUpperCase(chars))





    }
}
