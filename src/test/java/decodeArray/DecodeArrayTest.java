package decodeArray;

import static decodeArray.DecodeArray.decodeArray;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DecodeArrayTest {

    @Test
    public void testOne() {
        int[] a = { 1 };
        int expected = 0;
        assertEquals(expected, decodeArray(a));
    }

    @Test
    public void testTwo() {
        int[] a = { 0, 1 };
        int expected = 1;
        assertEquals(expected, decodeArray(a));
    }

    @Test
    public void testThree() {
        int[] a = { -1, 0, 1 };
        int expected = -1;
        assertEquals(expected, decodeArray(a));
    }

    @Test
    public void testFour() {
        int[] a = { 0, 1, 1, 1, 1, 1, 0, 1 };
        int expected = 100001;
        assertEquals(expected, decodeArray(a));
    }

    @Test
    public void testFive() {
        int[] a = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 };
        int expected = 999;
        assertEquals(expected, decodeArray(a));
    }
}
