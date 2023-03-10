package sample_06;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static sample_06.SolutionOne.f;

public class SolutionOneTest {

    @Test
    public void testOne() {
        int[] a = { 1, 8, 3, 7, 10, 2 };
        int expected = 3;
        assertEquals(expected, f(a));
    }

    @Test
    public void testTwo() {
        int[] a = { 1, 5, 3, 1, 1, 1, 1, 1, 1 };
        int expected = 2;
        assertEquals(expected, f(a));
    }

    @Test
    public void testThree() {
        int[] a = { 2, 1, 1, 1, 2, 1, 7 };
        int expected = 5;
        assertEquals(expected, f(a));
    }

    @Test
    public void testFour() {
        int[] a = { 1, 2, 3 };
        int expected = -1;
        assertEquals(expected, f(a));
    }

    @Test
    public void testFive() {
        int[] a = { 3, 4, 5, 10 };
        int expected = -1;
        assertEquals(expected, f(a));
    }

    @Test
    public void testSix() {
        int[] a = { 1, 2, 10, 3, 4 };
        int expected = -1;
        assertEquals(expected, f(a));
    }
}
