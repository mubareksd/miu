package isHollow;

import static isHollow.Hollow.isHollow;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class HollowTest {
    @Test
    void testOne() {
        int[] a = { 1, 2, 0, 0, 0, 3, 4 };
        int expected = 1;
        assertEquals(expected, isHollow(a));
    }

    @Test
    void testTwo() {
        int[] a = { 1, 1, 1, 1, 0, 0, 0, 0, 0, 2, 1, 2, 18 };
        int expected = 1;
        assertEquals(expected, isHollow(a));
    }

    @Test
    void testThree() {
        int[] a = { 1, 2, 0, 0, 3, 4 };
        int expected = 0;
        assertEquals(expected, isHollow(a));
    }

    @Test
    void testFour() {
        int[] a = { 1, 2, 0, 0, 0, 3, 4, 5 };
        int expected = 0;
        assertEquals(expected, isHollow(a));
    }

    @Test
    void testFive() {
        int[] a = { 3, 8, 3, 0, 0, 0, 3, 3 };
        int expected = 0;
        assertEquals(expected, isHollow(a));
    }

    @Test
    void testSix() {
        int[] a = { 1, 2, 0, 0, 0, 3, 4, 0 };
        int expected = 0;
        assertEquals(expected, isHollow(a));
    }

    @Test
    void testSeven() {
        int[] a = { 0, 1, 2, 0, 0, 0, 3, 4 };
        int expected = 0;
        assertEquals(expected, isHollow(a));
    }

    @Test
    void testEight() {
        int[] a = { 0, 0, 0 };
        int expected = 1;
        assertEquals(expected, isHollow(a));
    }
}
