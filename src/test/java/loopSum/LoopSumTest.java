package loopSum;

import static loopSum.LoopSum.loopSum;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LoopSumTest {
    @Test
    void testOne() {
        int[] a = { 1, 2, 3 };
        int n = 2;
        int expected = 3;
        assertEquals(expected, loopSum(a, n));
    }

    @Test
    void testTwo() {
        int[] a = { -1, 2, -1 };
        int n = 7;
        int expected = -1;
        assertEquals(expected, loopSum(a, n));
    }

    @Test
    void testThree() {
        int[] a = { 1, 4, 5, 6 };
        int n = 4;
        int expected = 16;
        assertEquals(expected, loopSum(a, n));
    }

    @Test
    void testFour() {
        int[] a = { 3 };
        int n = 10;
        int expected = 30;
        assertEquals(expected, loopSum(a, n));
    }
}
