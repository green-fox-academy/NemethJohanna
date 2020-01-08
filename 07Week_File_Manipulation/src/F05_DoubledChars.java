import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class F05_DoubledChars {
        public static void main(String[] args) throws IOException {
            // Create a method that decrypts the duplicated-chars.txt

            Path path = Paths.get("duplicated-chars.txt");
            List<String> wrongText = new ArrayList<>();

            try {
            wrongText = Files.readAllLines(path);
                    for (int i = 0; i < wrongText.size(); i++) {
                            for (int j = 0; j < wrongText.get(i).length(); j += 2) {
                                    System.out.print(wrongText.get(i).charAt(j));
                            }
                            System.out.println();
                    }
            } catch (IOException ex) {
                ex.getStackTrace();
            }
        }
}