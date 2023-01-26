package isCubePerfect;

import static isCubePerfect.CubePerfect.isCubePerfect;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CubePerfectTest {
    @Test
    void testOne() {
        int[] a = { 1, 1, 1 };
        int expected = 1;
        assertEquals(expected, isCubePerfect(a));
    }

    @Test
    void testTwo() {
        int[] a = { 64 };
        int expected = 1;
        assertEquals(expected, isCubePerfect(a));
    }

    @Test
    void testThree() {
        int[] a = { 63 };
        int expected = 0;
        assertEquals(expected, isCubePerfect(a));
    }

    @Test
    void testFour() {
        int[] a = { -1, 0, 1 };
        int expected = 1;
        assertEquals(expected, isCubePerfect(a));
    }

    @Test
    void testFive() {
        int[] a = {};
        int expected = 1;
        assertEquals(expected, isCubePerfect(a));
    }

    @Test
    void testSix() {
        int[] a = { 3, 7, 21, 36 };
        int expected = 0;
        assertEquals(expected, isCubePerfect(a));
    }
}
