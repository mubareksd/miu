package is121Array;

import static is121Array.Array121.is121Array;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Array121Test {
    @Test
    void testOne() {
        int[] a = { 1, 2, 1 };
        int expected = 1;
        assertEquals(expected, is121Array(a));
    }

    @Test
    void testTwo() {
        int[] a = { 1, 1, 2, 2, 2, 1, 1 };
        int expected = 1;
        assertEquals(expected, is121Array(a));
    }

    @Test
    void testThree() {
        int[] a = { 1, 1, 2, 2, 2, 1, 1, 1 };
        int expected = 0;
        assertEquals(expected, is121Array(a));
    }

    @Test
    void testFour() {
        int[] a = { 1, 1, 1, 2, 2, 2, 1, 1 };
        int expected = 0;
        assertEquals(expected, is121Array(a));
    }

    @Test
    void testFive() {
        int[] a = { 1, 1, 1, 2, 2, 2, 1, 1, 1, 3 };
        int expected = 0;
        assertEquals(expected, is121Array(a));
    }

    @Test
    void testSix() {
        int[] a = { 1, 1, 1, 1, 1, 1 };
        int expected = 0;
        assertEquals(expected, is121Array(a));
    }

    @Test
    void testSeven() {
        int[] a = { 2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1, 1 };
        int expected = 0;
        assertEquals(expected, is121Array(a));
    }

    @Test
    void testEight() {
        int[] a = { 1, 1, 1, 2, 2, 2, 1, 1, 1, 2, 2 };
        int expected = 0;
        assertEquals(expected, is121Array(a));
    }

    @Test
    void testNine() {
        int[] a = { 2, 2, 2 };
        int expected = 0;
        assertEquals(expected, is121Array(a));
    }
}