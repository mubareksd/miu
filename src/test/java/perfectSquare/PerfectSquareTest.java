package perfectSquare;

import static perfectSquare.PerfectSquare.nextPerfectSquare;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PerfectSquareTest {
    @Test
    void testOne() {
        int n = 6;
        int expected = 9;
        assertEquals(expected, nextPerfectSquare(n));
    }

    @Test
    void testTwo() {
        int n = 36;
        int expected = 49;
        assertEquals(expected, nextPerfectSquare(n));
    }

    @Test
    void testThree() {
        int n = 0;
        int expected = 1;
        assertEquals(expected, nextPerfectSquare(n));
    }

    @Test
    void testFour() {
        int n = -5;
        int expected = 0;
        assertEquals(expected, nextPerfectSquare(n));
    }
}
