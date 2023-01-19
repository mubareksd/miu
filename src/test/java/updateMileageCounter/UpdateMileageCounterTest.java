package updateMileageCounter;

import static org.junit.jupiter.api.Assertions.*;
import static updateMileageCounter.UpdateMileageCounter.updateMileageCounter;
import org.junit.jupiter.api.Test;

public class UpdateMileageCounterTest {
    @Test
    void testOne() {
        int[] a = { 8, 9, 9, 5, 0 };
        int miles = 1;
        int[] expected = { 9, 9, 9, 5, 0 };
        updateMileageCounter(a, miles);
        assertArrayEquals(expected, a);
    }

    @Test
    void testTwo() {
        int[] a = { 8, 9, 9, 5, 0 };
        int miles = 2;
        int[] expected = { 0, 0, 0, 6, 0 };
        updateMileageCounter(a, miles);
        assertArrayEquals(expected, a);
    }

    @Test
    void testThree() {
        int[] a = { 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 };
        int miles = 1;
        int[] expected = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        updateMileageCounter(a, miles);
        assertArrayEquals(expected, a);
    }

    @Test
    void testFour() {
        int[] a = { 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 };
        int miles = 13;
        int[] expected = { 2, 1, 0, 0, 0, 0, 0, 0, 0, 0 };
        updateMileageCounter(a, miles);
        assertArrayEquals(expected, a);
    }
}