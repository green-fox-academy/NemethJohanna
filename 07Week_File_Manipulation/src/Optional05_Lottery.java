import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Optional05_Lottery {

    public static void main(String[] args) {
        Path path = Paths.get("lottery.txt");
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(path);
            fiveMostCommonNumbers(lines);
        } catch (IOException e) {
            System.out.println("Unable to read file: my-file.txt");
        }
        fiveMostCommonNumbers(lines);
    }

    public static void fiveMostCommonNumbers(List<String> lineList) {
        ArrayList<String> lotteryNumbers = new ArrayList<>();
        for (int i = 0; i < lineList.size(); i++) {
            String[] numbers = lineList.get(i).split(";");
            lotteryNumbers.add(i, numbers[11]);
            lotteryNumbers.add(i, numbers[12]);
            lotteryNumbers.add(i, numbers[13]);
            lotteryNumbers.add(i, numbers[14]);
            lotteryNumbers.add(i, numbers[15]);
        }

        Map<Integer, Integer> countLotteryNumbers = new HashMap<>();
        for (int i = 0; i < lotteryNumbers.size(); i++) {
            if (countLotteryNumbers.containsKey(i)) {
                countLotteryNumbers.replace(i, countLotteryNumbers.get(i) + 1);
            } else {
                countLotteryNumbers.put((Integer.valueOf(lotteryNumbers.get(i))), 1);
            }
        }

        ArrayList<Integer> fiveMostCommonNumbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            int mostCommonNumber = Collections.max(countLotteryNumbers.entrySet(), Map.Entry.comparingByValue()).getKey();
            countLotteryNumbers.remove(mostCommonNumber);
            fiveMostCommonNumbers.add(mostCommonNumber);
        }
        System.out.println(fiveMostCommonNumbers);
    }

}
