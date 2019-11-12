import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class DoubledChars {
        public static void main(String[] args) throws IOException {
            // Create a method that decrypts the duplicated-chars.txt

            File file = new File("duplicated-chars.txt");
            while (file.exists() != true) {
                 file.createNewFile();
            }


            Path path = Paths.get("duplicated-chars.txt");
            try {
                List<String> lines = Files.readAllLines(path);
                for (String line : Files.readAllLines(path)) {
                    System.out.println(line);
                }
            } catch (IOException ex) {
                ex.getStackTrace();
            }
        }
}
