package isAllPossibilities;

import static isAllPossibilities.AllPossibilities.isAllPossibilities;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AllPossibilitiesTest {
    @Test
    void testOne() {
        int[] a = { 0, 1, 2, 3, 4 };
        int expected = 1;
        assertEquals(expected, isAllPossibilities(a));
    }

    @Test
    void testTwo() {
        int[] a = { 3, 2, 1, 0 };
        int expected = 1;
        assertEquals(expected, isAllPossibilities(a));
    }

    @Test
    void testThree() {
        int[] a = { 1, 2, 4, 3 };
        int expected = 0;
        assertEquals(expected, isAllPossibilities(a));
    }

    @Test
    void testFour() {
        int[] a = { 0, 2, 3 };
        int expected = 0;
        assertEquals(expected, isAllPossibilities(a));
    }

    @Test
    void testFive() {
        int[] a = { 0 };
        int expected = 1;
        assertEquals(expected, isAllPossibilities(a));
    }

    @Test
    void testSix() {
        int[] a = {};
        int expected = 0;
        assertEquals(expected, isAllPossibilities(a));
    }
}
