package pairwiseSum;

import static pairwiseSum.PairwiseSum.pairwiseSum;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PairwiseSumTest {
    @Test
    void testOne() {
        int[] a = { 2, 1, 18, -5 };
        int[] expected = { 3, 13 };
        assertArrayEquals(expected, pairwiseSum(a));
    }

    @Test
    void testTwo() {
        int[] a = { 2, 1, 18, -5, -5, -15, 0, 0, 1, -1 };
        int[] expected = { 3, 13, -20, 0, 0 };
        assertArrayEquals(expected, pairwiseSum(a));
    }

    @Test
    void testThree() {
        int[] a = { 2, 1, 18 };
        int[] expected = null;
        assertArrayEquals(expected, pairwiseSum(a));
    }

    @Test
    void testFour() {
        int[] a = {};
        int[] expected = null;
        assertArrayEquals(expected, pairwiseSum(a));
    }
}
