package miu_50;

import static miu_50.QuestionB.isDigitIncreasing;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class QuestionBTest {
    @Test
    public void testOne() {
        int n = 7;
        int expected = 1;
        assertEquals(expected, isDigitIncreasing(n));
    }

    @Test
    public void testTwo() {
        int n = 36;
        int expected = 1;
        assertEquals(expected, isDigitIncreasing(n));
    }

    @Test
    public void testThree() {
        int n = 984;
        int expected = 1;
        assertEquals(expected, isDigitIncreasing(n));
    }

    @Test
    public void testFour() {
        int n = 7404;
        int expected = 1;
        assertEquals(expected, isDigitIncreasing(n));
    }
}
