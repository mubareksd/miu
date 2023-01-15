package miu_48;

import static miu_48.QuestionA.largestPrimeFactor;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class QuestionATest {
    @Test
    public void testOne() {
        int n = 10;
        int expected = 5;
        assertEquals(expected, largestPrimeFactor(n));
    }

    @Test
    public void testTwo() {
        int n = 6936;
        int expected = 17;
        assertEquals(expected, largestPrimeFactor(n));
    }

    @Test
    public void testThree() {
        int n = 1;
        int expected = 0;
        assertEquals(expected, largestPrimeFactor(n));
    }
}
