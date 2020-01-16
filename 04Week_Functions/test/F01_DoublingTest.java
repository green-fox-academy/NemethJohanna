import static org.junit.Assert.*;

public class F01_DoublingTest {

    @org.junit.Test
    public void doublingWorkingCorrectly_when_wholeNumberAdded() {
        assertEquals(20, F01_Doubling.doubling(10));
    }

    public void doubling() {
        assertEquals(20, F01_Doubling.doubling(10));
    }
}