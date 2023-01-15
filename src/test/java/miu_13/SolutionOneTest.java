package miu_13;

import static miu_13.SolutionOne.zeroPlentiful;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionOneTest {

    @Test
    public void testOne() {
        int[] a = { 0, 0, 0, 0, 0 };
        int expected = 1;
        assertEquals(expected, zeroPlentiful(a));
    }

    @Test
    public void testTwo() {
        int[] a = { 1, 2, 0, 0, 0, 0, 2, -18, 0, 0, 0, 0, 0, 12 };
        int expected = 1;
        assertEquals(expected, zeroPlentiful(a));
    }

    @Test
    public void testThree() {
        int[] a = { 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0 };
        int expected = 1;
        assertEquals(expected, zeroPlentiful(a));
    }

    @Test
    public void testFour() {
        int[] a = { 1, 2, 3, 4 };
        int expected = 0;
        assertEquals(expected, zeroPlentiful(a));
    }

    @Test
    public void testFive() {
        int[] a = { 1, 0, 0, 0, 2, 0, 0, 0, 0 };
        int expected = 1;
        assertEquals(expected, zeroPlentiful(a));
    }

    @Test
    public void testSix() {
        int[] a = { 0 };
        int expected = 0;
        assertEquals(expected, zeroPlentiful(a));
    }

    @Test
    public void testSeven() {
        int[] a = {};
        int expected = 0;
        assertEquals(expected, zeroPlentiful(a));
    }
}
