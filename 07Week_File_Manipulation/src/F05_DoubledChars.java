import javax.imageio.IIOException;
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

        Path path = Paths.get("duplicated-chars.txt");
        decryptDuplicatedChars(path);

    }

    private static void decryptDuplicatedChars(Path path) {
        try {
            List <String> lines = Files.readAllLines(path);
            for (int i = 0; i < lines.size(); i++) {
                for (int j = 0; j < lines.get(i).length(); j += 2) {
                    System.out.print(lines.get(i).charAt(j));
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}