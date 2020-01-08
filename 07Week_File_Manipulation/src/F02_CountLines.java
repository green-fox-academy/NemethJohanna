import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class F02_CountLines {
    public static void main(String[] args) {

        Path path = Paths.get("my-file.txt");
        System.out.println(numberOfLines(path));

    }

    public static int numberOfLines(Path path){
        int numberOfLines = 0;
        try{
            List<String> lines = Files.readAllLines(path);
            for (int i = 0; i < lines.size(); i++) {
                numberOfLines += i;
            }
        } catch (IOException e) {
            return 0;
        }
        return numberOfLines;
    }

}

