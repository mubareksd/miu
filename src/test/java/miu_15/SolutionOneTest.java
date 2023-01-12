package miu_15;

import static miu_15.SolutionOne.isInertial;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionOneTest {

    @Test
    public void testOne() {
        int[] a = { 1 };
        int expected = 0;
        assertEquals(expected, isInertial(a));
    }

    @Test
    public void testTwo() {
        int[] a = { 2 };
        int expected = 0;
        assertEquals(expected, isInertial(a));
    }

    @Test
    public void testThree() {
        int[] a = { 1, 2, 3, 4 };
        int expected = 0;
        assertEquals(expected, isInertial(a));
    }

    @Test
    public void testFour() {
        int[] a = { 1, 1, 1, 1, 1, 1, 2 };
        int expected = 1;
        assertEquals(expected, isInertial(a));
    }

    @Test
    public void testFive() {
        int[] a = { 2, 12, 4, 6, 8, 11 };
        int expected = 1;
        assertEquals(expected, isInertial(a));
    }

    @Test
    public void testSix() {
        int[] a = { 2, 12, 12, 4, 6, 8, 11 };
        int expected = 1;
        assertEquals(expected, isInertial(a));
    }

    @Test
    public void testSeven() {
        int[] a = { -2, -4, -6, -8, -11 };
        int expected = 0;
        assertEquals(expected, isInertial(a));
    }

    @Test
    public void testEight() {
        int[] a = { 2, 3, 5, 7 };
        int expected = 0;
        assertEquals(expected, isInertial(a));
    }

    @Test
    public void testNine() {
        int[] a = { 2, 4, 6, 8, 10 };
        int expected = 0;
        assertEquals(expected, isInertial(a));
    }
}
