import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class F06_ReversedLines {

    public static void main(String[] args) throws IOException {
        // Create a method that decrypts reversed-lines.txt

        Path filePath = Paths.get("reversed-lines.txt");
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(filePath);
            reversedLines(lines);
        } catch (IOException e) {
            System.out.println("Unable to read file: reversed-lines.txt");
            e.printStackTrace();
        }
    }
    public static void reversedLines (List<String> lineList) {
            for (int i = 0; i < lineList.size(); i++) {
                for (int j = lineList.get(i).length() - 1; j >= 0; j--) {
                    System.out.print(lineList.get(i).charAt(j));
                }
                System.out.println();
            }

    }
}