package isDaphneArray;

import static isDaphneArray.DaphneArray.isDaphneArray;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DaphneArrayTest {
    @Test
    void testOne() {
        int[] a = { 1, 5, 2, 4, 1, -7, 6 };
        int expected = 1;
        assertEquals(expected, isDaphneArray(a));
    }

    @Test
    void testTwo() {
        int[] a = { 1, 1, 1, 1, 3 };
        int expected = 1;
        assertEquals(expected, isDaphneArray(a));
    }

    @Test
    void testThree() {
        int[] a = { 3, 2, 4, 6 };
        int expected = 1;
        assertEquals(expected, isDaphneArray(a));
    }

    @Test
    void testFour() {
        int[] a = { 1, 5, 2, 1, 4, 7 };
        int expected = 0;
        assertEquals(expected, isDaphneArray(a));
    }

    @Test
    void testFive() {
        int[] a = { 1, 1, 1, 1 };
        int expected = 0;
        assertEquals(expected, isDaphneArray(a));
    }
}
