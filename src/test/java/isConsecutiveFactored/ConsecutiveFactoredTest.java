package isConsecutiveFactored;

import static isConsecutiveFactored.ConsecutiveFactored.isConsecutiveFactored;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ConsecutiveFactoredTest {
    @Test
    void testOne() {
        int n = 24;
        int expected = 1;
        assertEquals(expected, isConsecutiveFactored(n));
    }

    @Test
    void testTwo() {
        int n = 105;
        int expected = 0;
        assertEquals(expected, isConsecutiveFactored(n));
    }

    @Test
    void testThree() {
        int n = 90;
        int expected = 1;
        assertEquals(expected, isConsecutiveFactored(n));
    }

    @Test
    void testFour() {
        int n = 23;
        int expected = 0;
        assertEquals(expected, isConsecutiveFactored(n));
    }

    @Test
    void testFive() {
        int n = 15;
        int expected = 0;
        assertEquals(expected, isConsecutiveFactored(n));
    }

    @Test
    void testSix() {
        int n = 2;
        int expected = 0;
        assertEquals(expected, isConsecutiveFactored(n));
    }

    @Test
    void testSeven() {
        int n = 0;
        int expected = 0;
        assertEquals(expected, isConsecutiveFactored(n));
    }

    @Test
    void testEight() {
        int n = -12;
        int expected = 0;
        assertEquals(expected, isConsecutiveFactored(n));
    }
}
