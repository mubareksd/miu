package isNPrimeable;

import static isNPrimeable.NPrimeable.isNPrimeable;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class NPrimeableTest {
    @Test
    void testOne() {
        int[] a = { 5, 15, 27 };
        int n = 2;
        int expected = 1;
        assertEquals(expected, isNPrimeable(a, n));
    }

    @Test
    void testTwo() {
        int[] a = { 5, 15, 27 };
        int n = 3;
        int expected = 0;
        assertEquals(expected, isNPrimeable(a, n));
    }

    @Test
    void testThree() {
        int[] a = { 5, 15, 26 };
        int n = 2;
        int expected = 0;
        assertEquals(expected, isNPrimeable(a, n));
    }

    @Test
    void testFour() {
        int[] a = { 1, 1, 1, 1, 1, 1, 1 };
        int n = 4;
        int expected = 1;
        assertEquals(expected, isNPrimeable(a, n));
    }

    @Test
    void testFive() {
        int[] a = {};
        int n = 2;
        int expected = 1;
        assertEquals(expected, isNPrimeable(a, n));
    }
}
