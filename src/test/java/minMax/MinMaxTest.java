package minMax;

import static minMax.MinMax.minMax;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MinMaxTest {
    @Test
    void testOne() {
        int[] a = { 1, 2, 3, 4, 5 };
        int[] expected = { 1, 5 };
        assertArrayEquals(expected, minMax(a));
    }

    @Test
    void testTwo() {
        int[] a = { 32, 52, 3, 14, 95 };
        int[] expected = { 3, 95 };
        assertArrayEquals(expected, minMax(a));
    }
}
