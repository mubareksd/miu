package nUpCount;

import static nUpCount.UpCount.nUpCount;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class UpCountTest {
    @Test
    void testOne() {
        int[] a = { 2, 3, 1, -6, 8, -3, -1, 2 };
        int n = 5;
        int expected = 3;
        assertEquals(expected, nUpCount(a, n));
    }

    @Test
    void testTwo() {
        int[] a = { 6, 3, 1 };
        int n = 6;
        int expected = 1;
        assertEquals(expected, nUpCount(a, n));
    }
}
