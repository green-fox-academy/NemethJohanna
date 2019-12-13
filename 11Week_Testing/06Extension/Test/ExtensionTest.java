import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ExtensionTest {

    Extension extension = new Extension();

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

    @Test
    public void testMaxOfThree_first() {
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

    @Test
    public void testMaxOfThree_third() {
        assertEquals(5, extension.maxOfThree(3, 4, 5));
    }

    @Test
    public void testMedian_four() {
        assertEquals(5, extension.median(Arrays.asList(7,5,3,5)));
    }

    @Test
    public void testMedian_five() {
        assertEquals(3, extension.median(Arrays.asList(1,2,3,4,5)));
    }

    @Test
    public void testIsVowel_a() {
        assertTrue(extension.isVowel('a'));
    }

    @Test
    public void testIsVowel_u() {
        assertTrue(extension.isVowel('u'));
    }

    @Test
    public void testTranslate_bemutatkozik() {
        assertEquals("bevemuvutavatkovozivik", extension.translate("bemutatkozik"));
    }

    @Test
    public void testTranslate_lagopus() {
        assertEquals("lavagovopuvus", extension.translate("lagopus"));
    }
}