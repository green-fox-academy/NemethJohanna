import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ExtensionTest {

    Extension extension = new Extension();


// ADD TESTS
    @Test
    public void testAdd_2and3is5() {
        assertEquals(5, extension.add(2, 3));
    }

    @Test
    public void add_should_returnIntegerMaxValue_when_sumIsBiggerThanMaximum() {
        int max = Integer.MAX_VALUE;
        int number = 5;
        int expectedResult = Integer.MAX_VALUE;

        int result = extension.add(max, number);

        assertEquals(expectedResult, result);
    }

    @Test
    public void testAdd_1and4is5() {
        assertEquals(5, extension.add(1, 4));
    }


// MAX OF THREE TESTS
    @Test
    public void testMaxOfThree_returnMAx_whenThreeDifferentNumberAdded() {
        assertEquals(5, extension.maxOfThree(5, 4, 3));
    }

    @Test
    public void testMaxOfThree_returnTheNumber_whenTheTwoBiggestAreEquals (){
        assertEquals(5, extension.maxOfThree(5, 5, 2));
    }

    @Test
    public void testMaxOfThree_returnTheNumber_whenTheTwoBiggestAreEquals_FirstLastAreEquals (){
        assertEquals(5, extension.maxOfThree(5, 2, 5));
    }

    @Test
    public void testMaxOfThree_returnTheNumber_whenTheTwoBiggestAreEquals_SecondLastAreEquals (){
        assertEquals(5, extension.maxOfThree(2, 5, 5));
    }

    @Test
    public void testMaxOfThree_returnTheNumber_whenEveryNumbersAreEquals (){
        assertEquals(5, extension.maxOfThree(5, 5, 5));
    }


// MEDIAN TESTS
    @Test
    public void testMedian_should_return_withTheMediumNumber_whenTheListIsEvenLong() {
        assertEquals(5.5, extension.median(Arrays.asList(1, 3, 8, 3, 10, 15)));
    }

    @Test
    public void testMedian_should_return_withTheMediumNumber_whenTheListIsOddLong() {
        assertEquals(3, extension.median(Arrays.asList(1,2,3,4,5)));
    }

    @Test
    public void testMedian_should_return_withTheMediumNumber_whenTheListContainsNegativeElement() {
        assertEquals(-0.5, extension.median(Arrays.asList(1, -2, -5, 7)));
    }

    @Test
    public void testMedian_should_return_withTheNumber_whenTheListHasOneElement() {
        assertEquals(5, extension.median(Arrays.asList(5)));
    }

    @Test
    public void testMedian_should_return0_whenTheListIsEmpty() {
        assertEquals(0, extension.median(Arrays.asList()));
    }


// VOWEL TESTS
    @Test
    public void testIsVowel_shouldReturnTrue_whenTheCharacterIsVowel() {
        assertTrue(extension.isVowel('a'));
    }

    @Test
    public void testIsVowel_shouldReturnTrue_whenTheCharacterIsVowelAndUpperCase() {
        assertTrue(extension.isVowel('A'));
    }

    @Test
    public void testIsVowel_shouldReturnFalse_whenTheCharacterIsConsonant() {
        assertFalse(extension.isVowel('b'));
    }

    @Test
    public void testIsVowel_shouldReturnFalse_whenTheCharacterIsNotALetter() {
        assertFalse(extension.isVowel('?'));
    }

    @Test
    public void testIsVowel_shouldReturnFalse_whenTheCharacterIsASpace() {
        assertFalse(extension.isVowel(' '));
    }


// TRANSLATE TESTS
    @Test
    public void testTranslate_shouldWorkCorrectly_whenASimpleWordAdded() {
        assertEquals("tevelevefovon", extension.translate("telefon"));
    }

}