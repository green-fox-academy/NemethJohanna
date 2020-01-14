package SwearWords;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwearWords {
    public static void main(String[] args) {

        String fileName = "C:\\Users\\Johanna Németh\\Desktop\\NemethJohanna\\Foundation_practice\\Trial_Exam_FoundationExample\\src\\SwearWords.txt";
        System.out.println(removeWords(fileName));

    }

    public static int removeWords(String fileName) {
        int nrOfWords = 0;
        Path filePath = Paths.get(fileName);
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(filePath);
        } catch (IOException e) {
            System.out.println("Unable to read file: SwearWords.txt");
            e.printStackTrace();
        }

        List<String> words = Arrays.asList("fuck", "bloody", "cock", "shit", "fucker", "fuckstick", "asshole", "dick", "piss", "cunt");

        for (int i = 0; i < lines.size(); i++) {
            String[] splitText = lines.get(i).split(" ");
            for (int j = 0; j < splitText.length; j++) {
                for (int k = 0; k < words.size(); k++) {
                    if (splitText[j].equals(words.get(k))){
                        lines.remove(splitText[j]);
                        nrOfWords++;
                    }
                }
            }
        }
        return nrOfWords;

    }
}
