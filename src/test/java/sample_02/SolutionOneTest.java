package sample_02;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static sample_02.SolutionOne.f;

public class SolutionOneTest {

    @Test
    public void testOne() {
        int[] a = { 1 };
        int expected = 1;
        assertEquals(expected, f(a));
    }

    @Test
    public void testTwo() {
        int[] a = { 1, 2 };
        int expected = -1;
        assertEquals(expected, f(a));
    }

    @Test
    public void testThree() {
        int[] a = { 1, 2, 3 };
        int expected = 2;
        assertEquals(expected, f(a));
    }

    @Test
    public void testFour() {
        int[] a = { 1, 2, 3, 4 };
        int expected = -2;
        assertEquals(expected, f(a));
    }

    @Test
    public void testFive() {
        int[] a = { 3, 3, 4, 4 };
        int expected = -2;
        assertEquals(expected, f(a));
    }

    @Test
    public void testSix() {
        int[] a = { 3, 2, 3, 4 };
        int expected = 0;
        assertEquals(expected, f(a));
    }

    @Test
    public void testSeven() {
        int[] a = { 4, 1, 2, 3 };
        int expected = -2;
        assertEquals(expected, f(a));
    }

    @Test
    public void testEight() {
        int[] a = { 1, 1 };
        int expected = 2;
        assertEquals(expected, f(a));
    }

    @Test
    public void testNine() {
        int[] a = {};
        int expected = 0;
        assertEquals(expected, f(a));
    }
}
