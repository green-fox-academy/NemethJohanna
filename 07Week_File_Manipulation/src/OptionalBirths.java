import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class OptionalBirths {

    // Create a function that
    // - takes the name of a CSV file as a parameter,
    //   - every row is in the following format: <person name>;<birthdate in YYYY-MM-DD format>;<city name>
    // - returns the year when the most births happened.
    //   - if there were multiple years with the same number of births then return any one of them

    // You can find such a CSV file in this directory named births.csv
    // If you pass "births.csv" to your function, then the result should be either 2006, or 2016.

    public static void main(String[] args){

        Path path = Paths.get("C:\\Users\\Johanna Németh\\Desktop\\NemethJohanna\\07Week_File_Manipulation\\births.txt");
        mostBirthHappened(path);

    }

    public static void mostBirthHappened (Path path){

        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(path);
        } catch (IOException e) {
            System.out.println("Unable to read file: my-file.txt");
        }

        ArrayList<String> birthDates = new ArrayList<>();
        for (int i = 0; i < lines.size(); i++) {                                    // added the full dates to the list
            String[] splitTheLinesBySemicolon = lines.get(i).split(";");
            birthDates.add(i, splitTheLinesBySemicolon[2]);
        }

        ArrayList<String> birthYears = new ArrayList<>();                           // add the years to a new list!!!
        for (int i = 0; i < birthDates.size(); i++) {                               // hyphen = kötőjel
            String[] splitTheLinesByHyphen = birthDates.get(i).split("-");
            birthYears.add(i, splitTheLinesByHyphen[1]);
        }

        for (int i = 0; i < birthYears.size(); i++) {
            int j;
            for (j = 0; j < i; j++)
                if (birthYears.get(i).equals(birthYears.get(j)))
                    break;
            if (i == j)
                System.out.print(birthDates.get(i) + "\n");
        }
    }

}
