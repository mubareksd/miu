package hasNValues;

import static hasNValues.HasNValues.hasNValues;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class HasNValuesTest {
    @Test
    void testOne() {
        int[] a = { 1, 2, 2, 1 };
        int n = 2;
        int expected = 1;
        assertEquals(expected, hasNValues(a, n));
    }

    @Test
    void testTwo() {
        int[] a = { 1, 1, 1, 8, 1, 1, 1, 3, 3 };
        int n = 3;
        int expected = 1;
        assertEquals(expected, hasNValues(a, n));
    }

    @Test
    void testThree() {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int n = 10;
        int expected = 1;
        assertEquals(expected, hasNValues(a, n));
    }

    @Test
    void testFour() {
        int[] a = { 1, 2, 2, 1 };
        int n = 3;
        int expected = 0;
        assertEquals(expected, hasNValues(a, n));
    }

    @Test
    void testFive() {
        int[] a = { 1, 1, 1, 8, 1, 1, 1, 3, 3 };
        int n = 2;
        int expected = 0;
        assertEquals(expected, hasNValues(a, n));
    }

    @Test
    void testSix() {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int n = 20;
        int expected = 0;
        assertEquals(expected, hasNValues(a, n));
    }
}
