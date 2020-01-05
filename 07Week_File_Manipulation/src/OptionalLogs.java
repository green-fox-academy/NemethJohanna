import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class OptionalLogs {

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

        for (int i = 0; i < uniqueIpAddresses.size(); i++) {
            int j;
            for (j = 0; j < i; j++)
                if (uniqueIpAddresses.get(i).equals(uniqueIpAddresses.get(j)))
                break;
            if (i == j)
                System.out.print(uniqueIpAddresses.get(i) + "\n");
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

        for (int i = 0; i < getPost.size(); i++) {
            if (getPost.get(i).equals("GET")) {
                getSize++;
            } else if (getPost.get(i).equals("POST")) {
                postSize++;
            }
        }
        System.out.printf("The GET / POST ratio is: %d / %d", getSize, postSize);
    }

}
