import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class OptionalBirths {

    public static void main(String[] args) {

        Path path = Paths.get("C:\\Users\\Johanna Németh\\Desktop\\NemethJohanna\\07Week_File_Manipulation\\births.txt");
        mostBirthHappened(path);

    }

    public static Integer mostBirthHappened(Path path) {

        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(path);
        } catch (IOException e) {
            System.out.println("Unable to read file: my-file.txt");
        }

        ArrayList<String> birthDates = new ArrayList<>();
        for (int i = 0; i < lines.size(); i++) {
            String[] splitTheLinesBySemicolon = lines.get(i).split(";");
            birthDates.add(i, splitTheLinesBySemicolon[1]);
        }

        ArrayList<String> birthYears = new ArrayList<>();
        for (int i = 0; i < birthDates.size(); i++) {
            String[] splitTheLinesByHyphen = birthDates.get(i).split("-");
            birthYears.add(i, splitTheLinesByHyphen[0]);
        }

        Map<String, Integer> mostCommonYearMap = new HashMap<>();
        for (String years : birthYears) {
            if (!mostCommonYearMap.containsKey(years)) {
                mostCommonYearMap.put(years, 1);
            } else {
                mostCommonYearMap.replace(years, mostCommonYearMap.get(years) + 1);
            }
        }

        int maxYear = Collections.max(mostCommonYearMap.values());

        for (Map.Entry<String, Integer> yearCount : mostCommonYearMap.entrySet()) {
            if (yearCount.getValue() == maxYear) {
                System.out.println(yearCount.getKey());
            }
        }

        return maxYear;
    }

}
