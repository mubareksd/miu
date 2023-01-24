package isZeroBalanced;

import static isZeroBalanced.ZeroBalanced.isZeroBalanced;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ZeroBalancedTest {
    @Test
    void testOne() {
        int[] a = { 1, 2, -2, -1 };
        int expected = 1;
        assertEquals(expected, isZeroBalanced(a));
    }

    @Test
    void testTwo() {
        int[] a = { -3, 1, 2, -2, -1, 3 };
        int expected = 1;
        assertEquals(expected, isZeroBalanced(a));
    }

    @Test
    void testThree() {
        int[] a = { 3, 4, -2, -3, -2 };
        int expected = 0;
        assertEquals(expected, isZeroBalanced(a));
    }

    @Test
    void testFour() {
        int[] a = { 0, 0, 0, 0, 0, 0 };
        int expected = 1;
        assertEquals(expected, isZeroBalanced(a));
    }

    @Test
    void testFive() {
        int[] a = { 3, -3, -3 };
        int expected = 0;
        assertEquals(expected, isZeroBalanced(a));
    }

    @Test
    void testSix() {
        int[] a = { 3 };
        int expected = 0;
        assertEquals(expected, isZeroBalanced(a));
    }

    @Test
    void testSeven() {
        int[] a = {};
        int expected = 0;
        assertEquals(expected, isZeroBalanced(a));
    }
}
