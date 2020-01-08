import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class F04_WriteMultipleLines {
    public static void main(String[] args) {

        String wordToWrite = "apple";
        String fileName ="multiple-file.txt";
        int number = 5;
        writeMultipleLines(fileName, wordToWrite, number);

    }

    private static void writeMultipleLines(String fileName, String wordToWrite, int number) {
        List<String> lines = new ArrayList<>();
        try {
            for (int i = 0; i < number; i++) {
                lines.add(wordToWrite);
            }
            Files.write(Paths.get(fileName), lines);
        } catch (IOException e){
        }
    }

}
