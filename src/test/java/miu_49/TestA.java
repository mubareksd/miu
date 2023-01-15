package miu_49;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;
import static miu_49.QuestionA.doIntegerBasedRounding;

public class TestA {
    @Test
    public void testOne() {
        int[] a = { 1, 2, 3, 4, 5 };
        int n = 2;
        int[] expected = { 2, 2, 4, 4, 6 };
        doIntegerBasedRounding(a, n);
        assertArrayEquals(expected, a);
    }

    @Test
    public void testTwo() {
        int[] a = { 1, 2, 3, 4, 5 };
        int n = 3;
        int[] expected = { 0, 3, 3, 3, 6 };
        doIntegerBasedRounding(a, n);
        assertArrayEquals(expected, a);
    }

    @Test
    public void testThree() {
        int[] a = { 1, 2, 3, 4, 5 };
        int n = -3;
        int[] expected = { 1, 2, 3, 4, 5 };
        doIntegerBasedRounding(a, n);
        assertArrayEquals(expected, a);
    }

    @Test
    public void testFour() {
        int[] a = { -1, -2, -3, -4, -5 };
        int n = 3;
        int[] expected = { -1, -2, -3, -4, -5 };
        doIntegerBasedRounding(a, n);
        assertArrayEquals(expected, a);
    }

    @Test
    public void testFive() {
        int[] a = { -18, 1, 2, 3, 4, 5 };
        int n = 4;
        int[] expected = { -18, 0, 4, 4, 4, 4 };
        doIntegerBasedRounding(a, n);
        assertArrayEquals(expected, a);
    }

    @Test
    public void testSix() {
        int[] a = { 1, 2, 3, 4, 5 };
        int n = 5;
        int[] expected = { 0, 0, 5, 5, 5 };
        doIntegerBasedRounding(a, n);
        assertArrayEquals(expected, a);
    }

    @Test
    public void testSeven() {
        int[] a = { 1, 2, 3, 4, 5 };
        int n = 100;
        int[] expected = { 0, 0, 0, 0, 0 };
        doIntegerBasedRounding(a, n);
        assertArrayEquals(expected, a);
    }
}
