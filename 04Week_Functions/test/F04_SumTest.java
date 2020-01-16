import org.junit.Test;

import static org.junit.Assert.*;

public class F04_SumTest {

    @Test
    public void sumOfGivenParameter_shouldReturnTheSumOfGivenNumber() {
        assertEquals(6, F04_Sum.sum(3));
    }

    @Test
    public void sum_shouldReturnZero_whenGivenParameterIsNegativeNumber() {
        assertEquals(0, F04_Sum.sum(0));
    }
}