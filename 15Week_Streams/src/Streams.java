import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
        // Write a Stream Expression to find the uppercase characters in a string!
        String budapest = "BuDaPeSt";
        List<Character> str = Arrays.asList('B', 'u', 'D', 'a', 'P', 'e', 'S', 't');
        //List<Character> chars = str.stream()
                //.map(n -> n.)
        System.out.println("6 --> uppercase characters: " + budapest);


        // EXERCISE 7
        // Write a Stream Expression to find the strings which starts with a given letter(as parameter), in the following list:
        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");
        List<String> strings = cities.stream()
                .filter(n -> n.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println("7 --> " + strings);


        // EXERCISE 8
        // Write a Stream Expression to concatenate a Character list to a string!
        List<Character> charsToString = Arrays.asList('B', 'U', 'D', 'A', 'P', 'E', 'S', 'T');
        String newString = charsToString.stream()
                .map(c -> c.toString())
                .reduce("", String::concat);

        System.out.println("8 --> " + newString);


        //EXERCISE 9
        // 
    }
}
