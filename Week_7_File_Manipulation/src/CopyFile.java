import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CopyFile {

    // Write a function that copies the contents of a file into another
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

    public static void main (String [] args){
        String copyFrom = "CopyFrom.txt";
        String copyTo = "CopyTo.txt";
        boolean result = copyContents(copyFrom, copyTo);
        System.out.println(result);
    }

    public static boolean copyContents (String copyFrom, String copyTo) {

//        Path pathCopyFrom = Paths.get("CopyFrom.txt.txt");
//        Path pathCopyTo = Paths.get("CopyTo.txt");

        try {
            Files.copy(Paths.get(copyFrom), Paths.get(copyTo));
        } catch (IOException e) {
            return false;
        }
        return true;
    }
}
