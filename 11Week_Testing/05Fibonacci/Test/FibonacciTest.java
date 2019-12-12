import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    @Test
    public void fibonacciFunctionShouldPrintTheCorrectValue() throws FibonacciException {
        Fibonacci fibonacci = new Fibonacci();
        int memberOfTheFibonacciSequence = 6;
        int expectedResult = 8;

        int result = fibonacci.fibonacciFunction(memberOfTheFibonacciSequence);

        assertEquals(expectedResult, result);
    }

    @Test
    public void fibonacciFunctionShouldReturnError_when_inputIsNegative() throws FibonacciException {
        Fibonacci fibonacci = new Fibonacci();
        int negativeNumber = -5;
        int expectedResult = 0;

        int result = fibonacci.fibonacciFunction(negativeNumber);

        assertEquals(expectedResult, result);
    }

    @Test(expected = FibonacciException.class)
    public void fibonacciFunctionShouldReturnError_when_tooIntegerIsBigger() throws FibonacciException {
        Fibonacci fibonacci = new Fibonacci();
        int max = Integer.MAX_VALUE;

        fibonacci.fibonacciFunction(max);
    }
}