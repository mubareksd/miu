package isComplete;

import static isComplete.Complete.isComplete;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CompleteTest {
    @Test
    void testOne() {
        int[] a = { 36, -28 };
        int expected = 1;
        assertEquals(expected, isComplete(a));
    }

    @Test
    void testTwo() {
        int[] a = { 36, 28 };
        int expected = 0;
        assertEquals(expected, isComplete(a));
    }

    @Test
    void testThree() {
        int[] a = { 4 };
        int expected = 0;
        assertEquals(expected, isComplete(a));
    }

    @Test
    void testFour() {
        int[] a = { 3, 2, 1, 1, 5, 6 };
        int expected = 0;
        assertEquals(expected, isComplete(a));
    }

    @Test
    void testSix() {
        int[] a = { 3, 7, 23, 13, 107, -99, 97, 81 };
        int expected = 0;
        assertEquals(expected, isComplete(a));
    }
}
