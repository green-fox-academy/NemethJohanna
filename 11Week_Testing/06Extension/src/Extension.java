import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Extension {
    int add(int number1, int number2) {
        if (Integer.MAX_VALUE - number1 < number2) {
            System.err.printf("%d + %d is bigger than Integer max value\n", number1, number2);
            return Integer.MAX_VALUE;
        }
        return number1 + number2;
    }

    int maxOfThree(int a, int b, int c) {
        if ((a > b && a > c) || (a == b && a > c) || (a == b && a == c)){
            return a;
        } else if ((b > a && b > c) || (a < b && a == c)) {
            return b;
        } else return c;
    }

    double median(List<Integer> pool) {
        final List<Integer> list = pool;
        Collections.sort(list);
        if (list.size() % 2 == 1) {
            return list.get(list.size() / 2);
        } else if ((list.size() == 0)) {
            return 0;
        } else {
            double medianPart = ((list.get((list.size() / 2) - 1)) + (list.get(list.size() / 2)));
            return medianPart / 2;
        }
    }

    boolean isVowel(char character) {
        return Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U').contains(character);
    }

    String translate(String wordToTranslate) {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < wordToTranslate.length(); i++) {
            char c = wordToTranslate.charAt(i);
            if (isVowel(c)) {
                temp.append(c).append("v").append(c);
            } else {
                temp.append(c);
            }
        }
        return temp.toString();
    }
}