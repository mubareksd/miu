package isZeroLimited;

import static isZeroLimited.ZeroLimited.isZeroLimited;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ZeroLimitedTest {
    @Test
    void testOne() {
        int[] a = { 0, 0, 0, 0, 0 };
        int expected = 0;
        assertEquals(expected, isZeroLimited(a));
    }

    @Test
    void testTwo() {
        int[] a = { 1, 0 };
        int expected = 1;
        assertEquals(expected, isZeroLimited(a));
    }

    @Test
    void testThree() {
        int[] a = { 0, 1 };
        int expected = 0;
        assertEquals(expected, isZeroLimited(a));
    }

    @Test
    void testFour() {
        int[] a = { 5 };
        int expected = 1;
        assertEquals(expected, isZeroLimited(a));
    }

    @Test
    void testFive() {
        int[] a = { 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0 };
        int expected = 1;
        assertEquals(expected, isZeroLimited(a));
    }

    @Test
    void testSix() {
        int[] a = {};
        int expected = 1;
        assertEquals(expected, isZeroLimited(a));
    }
}
