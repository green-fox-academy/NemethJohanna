import org.junit.Test;

import static org.junit.Assert.*;

public class F02_GreeterFunctionTest {

    @Test
    public void greetingWorkingCorrectly() {
        String result = "Greetings dear, Johi!";
        assertEquals(result, F02_GreeterFunction.greet("Johi"));
    }

}