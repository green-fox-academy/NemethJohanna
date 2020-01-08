import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class F01_PrintEachLine {
    public static void main(String[] args) {

        try {
            Path path = Paths.get("my-file.txt");
            List<String> lines = Files.readAllLines(path);
            for (int i = 0; i < lines.size(); i++) {
                System.out.println(lines.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Unable to read file: my-file.txt");
        }

    }
}
