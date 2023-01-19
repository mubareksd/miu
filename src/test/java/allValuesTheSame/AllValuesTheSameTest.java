package allValuesTheSame;

import static allValuesTheSame.AllValuesTheSame.allValuesTheSame;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AllValuesTheSameTest {
    @Test
    void testOne() {
        int[] a = { 1, 1, 1, 1 };
        int expected = 1;
        assertEquals(expected, allValuesTheSame(a));
    }

    @Test
    void testTwo() {
        int[] a = { 83, 83, 83 };
        int expected = 1;
        assertEquals(expected, allValuesTheSame(a));
    }

    @Test
    void testThree() {
        int[] a = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int expected = 1;
        assertEquals(expected, allValuesTheSame(a));
    }

    @Test
    void testFour() {
        int[] a = { 1, -2343456, 1, -2343456 };
        int expected = 0;
        assertEquals(expected, allValuesTheSame(a));
    }

    @Test
    void testFive() {
        int[] a = { 0, 0, 0, 0, -1 };
        int expected = 0;
        assertEquals(expected, allValuesTheSame(a));
    }

    @Test
    void testSix() {
        int[] a = { 432123456 };
        int expected = 1;
        assertEquals(expected, allValuesTheSame(a));
    }

    @Test
    void testSeven() {
        int[] a = { -432123456 };
        int expected = 1;
        assertEquals(expected, allValuesTheSame(a));
    }

    @Test
    void testEight() {
        int[] a = {};
        int expected = 0;
        assertEquals(expected, allValuesTheSame(a));
    }
}
