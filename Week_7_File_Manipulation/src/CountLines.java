import com.oracle.xmlns.internal.webservices.jaxws_databinding.ExistingAnnotationsType;
import sun.invoke.empty.Empty;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.

public class CountLines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write here a filename: ");
        String userInput = scanner.nextLine();

        Path paths = Paths.get(userInput);

        List<String> inputSize = new ArrayList<>();

        try {
            inputSize = Files.readAllLines(paths);
            System.out.println(inputSize.size());
        } catch (IOException e) {
            System.out.println("zero");
        }
    }




}

