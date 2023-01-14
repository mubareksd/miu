package miu_12;

import static miu_12.SolutionOne.isSystematicallyIncreasing;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionOneTest {

    @Test
    public void testOne() {
        int[] a = { 1 };
        int expected = 1;
        assertEquals(expected, isSystematicallyIncreasing(a));
    }

    @Test
    public void testTwo() {
        int[] a = { 1, 2, 1, 2, 3 };
        int expected = 0;
        assertEquals(expected, isSystematicallyIncreasing(a));
    }

    @Test
    public void testThree() {
        int[] a = { 1, 1, 3 };
        int expected = 0;
        assertEquals(expected, isSystematicallyIncreasing(a));
    }

    @Test
    public void testFour() {
        int[] a = { 1, 2, 1, 2, 1, 2 };
        int expected = 0;
        assertEquals(expected, isSystematicallyIncreasing(a));
    }

    @Test
    public void testFive() {
        int[] a = { 1, 2, 3, 1, 2, 1 };
        int expected = 0;
        assertEquals(expected, isSystematicallyIncreasing(a));
    }

    @Test
    public void testSix() {
        int[] a = { 1, 1, 2, 3 };
        int expected = 0;
        assertEquals(expected, isSystematicallyIncreasing(a));
    }
}
