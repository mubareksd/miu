package isDigitComplete;

import static isDigitComplete.DigitComplete.isDigitComplete;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DigitCompleteTest {
    @Test
    void testOne() {
        int[] a = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int expected = 1;
        assertEquals(expected, isDigitComplete(a));
    }

    @Test
    void testTwo() {
        int[] a = { 3, 2, 1, 0, 4, 5, 6, 9, 7, 8 };
        int expected = 1;
        assertEquals(expected, isDigitComplete(a));
    }

    @Test
    void testThree() {
        int[] a = { 3, 2, 1, 0, 4, 5, 9, 7, 8 };
        int expected = 0;
        assertEquals(expected, isDigitComplete(a));
    }

    @Test
    void testFour() {
        int[] a = { 3, 2, 1, 0, 4, 5, 6, 9, 7, 8, 4 };
        int expected = 0;
        assertEquals(expected, isDigitComplete(a));
    }
}
