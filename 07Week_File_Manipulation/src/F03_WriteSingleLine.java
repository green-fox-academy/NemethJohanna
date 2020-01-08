import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class F03_WriteSingleLine {
    public static void main(String[] args) {

        Path path = Paths.get("my-file.txt");
        String myName = "Johi";
        writeLine(path, myName);
    }

    private static void writeLine(Path path, String nameToWrite) {
        try {
            Files.write(path, Collections.singleton(nameToWrite));
        } catch (IOException e) {
            System.out.println("Unable to write file: my-file.txt");
        }
    }
    
}
