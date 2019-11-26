package MostCommonChar;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

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

        mostCommonCharacter("CountChar.txt");
    }

    public static String mostCommonCharacter(String lines) {

        Path path = Paths.get("CountChar.txt");
        List<String> line = new ArrayList<>();

        try {
            line = Files.readAllLines(path);
        } catch (IOException e) {
            System.out.println("File does not exist!");
        }
        //System.out.println(line);

        String maxAppear = "";
        for (int i = 0; i < line.size(); i++) {
            maxAppear += line.get(i);
        }
//        String secondMaxValue = "";
//        for (int i = 0; i < line.size(); i++) {
//            secondMaxValue += line.get(i);
//        }

        char[] charArray = maxAppear.toCharArray();
        //char[] charArray2 = secondMaxValue.toCharArray();
        HashMap<Character, Integer> letterCounts = new HashMap<>();

        for (int i = 0; i < charArray.length; i++) {
            if (letterCounts.containsKey(charArray[i])) {
                letterCounts.replace(charArray[i], letterCounts.get(charArray[i]) + 1);
            } else {
                letterCounts.put(charArray[i], 1);
            }
        }

//        Character temp = ' ';
//        Integer tempInt = 0;
//        for (int i = 0; i < 3; i++) {
//            for (Map.Entry<Character, Integer> values : letterCounts.entrySet()){
//                if(values.getValue() == Collections.max(letterCounts.values())) {
//                    temp = values.getKey();
//                    tempInt = values.getValue();
//                    break;
//                }
//            }
//        }
//        letterCounts.remove(temp, tempInt);
//        System.out.println( temp + " : " + tempInt);

        int maxValue = (Collections.max(letterCounts.values()));
        int maxValue2 = (Collections.max(letterCounts.values()));

        for (Map.Entry<Character, Integer> entry : letterCounts.entrySet()) {
                if (entry.getValue() == maxValue) {
                    System.out.println("\"" + entry.getKey() + "\" : " + entry.getValue());
                }
                if (entry.getValue() == maxValue2) {
                    System.out.println("\"" + entry.getKey() + "\" : " + entry.getValue());
                }
        }

        return lines;
    }
}