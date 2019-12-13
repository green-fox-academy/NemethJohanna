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
        if (Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U').contains(character)){
            return true;
        } else return false;
    }

    String translate(String wordToTranslate) {
        String translate = wordToTranslate;
        int length = translate.length();
        for (int i = 0; i < length; i++) {
            char inputsCharacters = translate.charAt(i);
            if (isVowel(inputsCharacters)) {
                translate = String.join(inputsCharacters + "v" + inputsCharacters, translate.split("" + inputsCharacters));
                i += length;
                length ++;
            }
            if (!isVowel(inputsCharacters)){
                return "Error";
            }
        }
        return translate;
    }
}