import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class OptionalLottery {
    // Create a method that find the 5 most common lottery numbers in lottery.csv

    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\Johanna Németh\\Desktop\\NemethJohanna\\07Week_File_Manipulation\\lottery.txt");

        fiveMostCommonNumbers(path);

    }

    public static void fiveMostCommonNumbers(Path path) {

        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(path);
        } catch (IOException e) {
            System.out.println("Unable to read file: my-file.txt");
        }

        ArrayList<String> lotteryNumberList = new ArrayList<>();

        for (int i = 0; i < lines.size(); i++) {
            String[] splitTheLinesBySemicolon = lines.get(i).split(";");
            lotteryNumberList.add(i, splitTheLinesBySemicolon[11]);
            lotteryNumberList.add(i, splitTheLinesBySemicolon[12]);
            lotteryNumberList.add(i, splitTheLinesBySemicolon[13]);
            lotteryNumberList.add(i, splitTheLinesBySemicolon[14]);
            lotteryNumberList.add(i, splitTheLinesBySemicolon[15]);
        }

        Map<String, Integer> mostCommonNumberMap = new HashMap<>();
        for (String numbers : lotteryNumberList) {
            if (!mostCommonNumberMap.containsKey(numbers)) {
                mostCommonNumberMap.put(numbers, 1);
            } else {
                mostCommonNumberMap.replace(numbers, mostCommonNumberMap.get(numbers) + 1);
            }
        }

        //System.out.println(mostCommonNumberMap);

        Map<String, Integer> fiveMostCommonNumberMap = new HashMap<>();

        int memoryValue = Collections.singleton(0);
        String memoryKey = "";
        for (int i = 1; i <= 5; i++) {

            for (Map.Entry<String, Collection<Integer>> numberCount : fiveMostCommonNumberMap.entrySet()) {
                if (numberCount.getValue().equals(Collections.max(lotteryNumberList))) {
                    memoryValue = mostCommonNumberMap.values();
                    memoryKey = mostCommonNumberMap.get(i).toString();
                    break;
                }
            }
            mostCommonNumberMap.remove(memoryKey, memoryValue);
            fiveMostCommonNumberMap.put(memoryKey, memoryValue);
        }

        System.out.println(fiveMostCommonNumberMap);

    }
}
