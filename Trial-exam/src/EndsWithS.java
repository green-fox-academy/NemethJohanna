import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EndsWithS {
    public static void main(String[] args) {

        String fileName = "text.txt";
        String letter = "s";

        System.out.println(nrOfWords(fileName));

    }

    public static int nrOfWords(String fileName) {
        int nrOfWords = 0;                                      // var counter = 0;

        Path path = Paths.get(fileName);
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(path);                   // for (var line : lines){
        } catch (IOException e) {                               //      var cleanLine = line.replaceAll("[^a-zA-Z ]", "");
            System.out.println("The file does not exist!");     //      (A-Z-ig eltávolít minden karaktert)
            e.printStackTrace();                                //      var words = cleanLine.split(regex: " ");
        }                                                       //      for (var word : words){
                                                                //          if(word.endsWith("s")){
                                                                //          counter++;
        for (int i = 0; i < lines.size(); i++) {
            String words = lines.get(i);
            String[] wordsList = words.split(" ");
            for (int j = 0; j < wordsList.length; j++) {
                if (wordsList[j].endsWith("s") ||
                        wordsList[j].endsWith("s,") ||
                        wordsList[j].endsWith("s.") ||
                        wordsList[j].endsWith("s:")) {
                    nrOfWords++;
                }
            }
        }
        return nrOfWords;                                       // return counter;
    }
}
