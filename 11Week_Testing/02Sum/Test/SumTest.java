import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumTest {

    private static Sum sum;

    @BeforeClass
    public static void init() {
        sum = new Sum();
    }

    @Test
    public void sumOfElements_should_addNumbers() {
        int[] numbers = {1, 2, 3, 4, 5};

        int expectedResult = 15;

        int result = sum.sumOfElements(numbers);

        assertEquals(expectedResult, result);
    }

    @Test
    public void sumOfElements_should_return0_when_arrayIsEmpty(){
        int[] numbers = {};

        int expectedResult = 0;

        int result = sum.sumOfElements(numbers);

        assertEquals(expectedResult, result);
    }

    //a list that has one element in it
    @Test
    public void sumOfElements_should_returnTheElement_when_arrayHasOneElement(){
        int[] numbers = {5};
        int expectedResult = 5;

        int result = sum.sumOfElements(numbers);

        assertEquals(expectedResult, result);
    }

    //a null
    @Test
    public void sumOfElements_should_return0_when_nullIsGiven(){
        int expectedResult = 0;

        int result = sum.sumOfElements(null);

        assertEquals(expectedResult, result);
    }
}