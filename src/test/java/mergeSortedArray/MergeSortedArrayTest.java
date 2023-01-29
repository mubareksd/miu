package mergeSortedArray;

import static mergeSortedArray.MergeSortedArray.mergeSortedArray;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MergeSortedArrayTest {
    @Test
    void testOne() {
        int[] a1 = { 1, 3, 5, 7 };
        int[] a2 = { 2, 4, 6, 8 };
        int[] expected = { 1, 2, 3, 4, 5, 6, 7, 8 };
        assertArrayEquals(expected, mergeSortedArray(a1, a2));
    }
}
