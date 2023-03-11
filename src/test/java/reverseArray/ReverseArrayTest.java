package reverseArray;

import static reverseArray.ReverseArray.reverseArray;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ReverseArrayTest {
    @Test
    void testOne() {
        int[] a = { 1, 2, 3, 4, 5 };
        int[] expected = { 5, 4, 3, 2, 1 };
        assertArrayEquals(expected, reverseArray(a));
    }

    @Test
    void testTwo() {
        int[] a = { 5, 1, 0, 4, 3 };
        int[] expected = { 3, 4, 0, 1, 5 };
        assertArrayEquals(expected, reverseArray(a));
    }
}
