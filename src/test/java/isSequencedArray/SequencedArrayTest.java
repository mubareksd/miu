package isSequencedArray;

import org.junit.jupiter.api.Test;

import static isSequencedArray.SequencedArray.isSequencedArray;
import static org.junit.jupiter.api.Assertions.*;

public class SequencedArrayTest {

    @Test
    public void testOne() {
        int[] a = { 1, 2, 3, 4, 5 };
        int m = 1;
        int n = 5;
        int expected = 1;
        assertEquals(expected, isSequencedArray(a, m, n));
    }

    @Test
    public void testTwo() {
        int[] a = { 1, 3, 4, 2, 5 };
        int m = 1;
        int n = 5;
        int expected = 0;
        assertEquals(expected, isSequencedArray(a, m, n));
    }

    @Test
    public void testThree() {
        int[] a = { -5, -5, -4, -4, -4, -3, -3, -2, -2, -2 };
        int m = -5;
        int n = -2;
        int expected = 1;
        assertEquals(expected, isSequencedArray(a, m, n));
    }

    @Test
    public void testFour() {
        int[] a = { 0, 1, 2, 3, 4, 5 };
        int m = 1;
        int n = 5;
        int expected = 0;
        assertEquals(expected, isSequencedArray(a, m, n));
    }

    @Test
    public void testFive() {
        int[] a = { 1, 2, 3, 4 };
        int m = 1;
        int n = 5;
        int expected = 0;
        assertEquals(expected, isSequencedArray(a, m, n));
    }

    @Test
    public void testSix() {
        int[] a = { 1, 2, 5 };
        int m = 1;
        int n = 5;
        int expected = 0;
        assertEquals(expected, isSequencedArray(a, m, n));
    }

    @Test
    public void testSeven() {
        int[] a = { 5, 4, 3, 2, 1 };
        int m = 1;
        int n = 5;
        int expected = 0;
        assertEquals(expected, isSequencedArray(a, m, n));
    }
}
