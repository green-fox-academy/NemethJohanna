package MostCommonChar;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MostCommonChar {
    public static void main(String[] args) {
        /*Most Common Characters
        Write a function that takes a filename as a parameter.
        Return the 2 most common characters and their occurrences in the file's content.

        If the file does not exist throw an exception with the following message: "File does not exist!"

    Example
        Output
            {
              "e": 6,
              "l": 4
            }*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write here a filename: ");
        String userInput = scanner.nextLine();

        System.out.println(mostCommonCharacter(userInput));

    }
    public static String mostCommonCharacter(String input){
        Path path = Paths.get(input);

        List<String> text = new ArrayList<>();
        //char[] chars = input.toCharArray;

        try {
            for (int i = 0; i < text.size(); i++) {
                for (int j = 0; j < text.get(i).length(); j++) {

                }
            }
            text = Files.readAllLines(path);        // read the file
                                                    //
        } catch (IOException e){
            System.out.println("File does not exist");
        }
        return input;       //nem ezt kell ide írni
    }
}