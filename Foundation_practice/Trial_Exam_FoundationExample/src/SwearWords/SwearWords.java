//package SwearWords;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.ArrayList;
//import java.util.List;
//
//public class SwearWords {
//    public static void main(String[] args) {
///*Write a method which can read and parse a file containing not so family friendly text.
//The method must remove all the given words from the file and return the amount of the removed words.
//
//Example
//
//Output
//        //"fuck", "bloody", "cock", "shit", "fucker", "fuckstick", "asshole", "dick", "piss", "cunt"
//17*/
//
//        Path filePath = Paths.get("reversed-lines.txt");
//        List<String> lines = new ArrayList<>();
//        try {
//            lines = Files.readAllLines(filePath);
//            removeWords(lines);
//        } catch (IOException e) {
//            System.out.println("Unable to read file: reversed-lines.txt");
//            e.printStackTrace();
//        }
//    }
//
//    public static int removeWords(List<String> line) {
//        int nrOfWords = 0;
//
//        for (int i = 0; i < line.size(); i++) {
//            for (int j = 0; j < line.get(i).length(); j--) {
//                List<String> words = new ArrayList<String>();
//                if (line.get(i)(j))
//                line.remove();
//
//            }
//            System.out.println();
//        }
//
//        return nrOfWords;
//    }
//
//}
