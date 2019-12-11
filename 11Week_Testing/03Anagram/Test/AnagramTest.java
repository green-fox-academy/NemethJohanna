import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    @Test
    public void isAnagram() {

        Anagram anagram = new Anagram();

        String word1 = "madam";
        String word2 = "madam";

        boolean expectedResult = true;

        boolean result = anagram.isAnagram(word1, word2);
        assertEquals(expectedResult, result);

    }
}