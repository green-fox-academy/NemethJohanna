import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CountLettersTest {

    @Test
    public void letterCount() {

        CountLetters countLetters = new CountLetters();

        String countTheLetters = "GreenFox";

        HashMap<Character, Integer> expectedResult = new HashMap<>();
        expectedResult.put('G', 1);
        expectedResult.put('r', 1);
        expectedResult.put('e', 2);
        expectedResult.put('n', 1);
        expectedResult.put('F', 1);
        expectedResult.put('o', 1);
        expectedResult.put('x', 1);

       String result = countLetters.letterCount(countTheLetters);

        assertEquals(expectedResult, result);
    }
}