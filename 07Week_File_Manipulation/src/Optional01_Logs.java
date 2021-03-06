import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Optional01_Logs {

    // Read all data from 'log.txt'.
    // Each line represents a log message from a web server
    // Write a function that returns an array with the unique IP addresses.
    // Write a function that returns the GET / POST request ratio.

    public static void main(String[] args) {

        Path path = Paths.get("C:\\Users\\Johanna Németh\\Desktop\\NemethJohanna\\07Week_File_Manipulation\\Log.txt");
        findUniqueIpAddresses(path);
        System.out.println();
        getPostRatio(path);

    }

    public static void findUniqueIpAddresses(Path path) {
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(path);
        } catch (IOException e) {
            System.out.println("Unable to read file: my-file.txt");
        }

        ArrayList<String> uniqueIpAddresses = new ArrayList<>();

        for (int i = 0; i < lines.size(); i++) {
            String[] splitTheLinesBySpace = lines.get(i).split(" ");
            uniqueIpAddresses.add(i, splitTheLinesBySpace[8]);
        }

        ArrayList<String> uniqueUnique = new ArrayList<>();
        Collections.sort(uniqueIpAddresses);
        for (int i = 0; i < uniqueIpAddresses.size(); i++) {
            int k;
            for (k = 0; k < i; k++) {
                if (uniqueIpAddresses.get(i).equals(uniqueIpAddresses.get(k))){
                    break;
                }
            }
            if (i == k){
                uniqueUnique.add(uniqueIpAddresses.get(i));
            }
        }
    }

    public static void getPostRatio(Path path) {
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(path);
        } catch (IOException e) {
            System.out.println("Unable to read file: my-file.txt");
        }

        ArrayList<String> getPost = new ArrayList<>();

        for (int i = 0; i < lines.size(); i++) {
            String[] splitTheLinesBySpace = lines.get(i).split(" ");
            getPost.add(i, splitTheLinesBySpace[11]);
        }

        int getSize = 0;
        int postSize = 0;

        for (String s : getPost) {
            if (s.equals("GET")) {
                getSize++;
            } else if (s.equals("POST")) {
                postSize++;
            }
        }
        System.out.printf("The GET / POST ratio is: %d / %d", getSize, postSize);
    }

}
