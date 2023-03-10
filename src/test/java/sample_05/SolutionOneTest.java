package sample_05;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static sample_05.SolutionOne.f;

public class SolutionOneTest {

    @Test
    public void testOne() {
        int[] first = { 1, 8, 3, 2 }, second = { 4, 2, 6, 1 };
        int[] expected = { 1, 2 };
        assertArrayEquals(expected, f(first, second));

    }

    @Test
    public void testTwo() {
        int[] first = { 1, 8, 3, 2, 6 }, second = { 2, 6, 1 };
        int[] expected = { 2, 6, 1 };
        assertArrayEquals(expected, f(first, second));

    }

    @Test
    public void testThree() {
        int[] first = { 1, 3, 7, 9 }, second = { 7, 1, 9, 3 };
        int[] expected = { 1, 3, 7, 9 };
        assertArrayEquals(expected, f(first, second));

    }

    @Test
    public void testFour() {
        int[] first = { 1, 2 }, second = { 3, 4 };
        int[] expected = {};
        assertArrayEquals(expected, f(first, second));

    }

    @Test
    public void testFive() {
        int[] first = {}, second = { 1, 2, 3 };
        int[] expected = {};
        assertArrayEquals(expected, f(first, second));

    }

    @Test
    public void testSix() {
        int[] first = { 1, 2 }, second = {};
        int[] expected = {};
        assertArrayEquals(expected, f(first, second));

    }

    @Test
    public void testSeven() {
        int[] first = { 1, 2 }, second = null;
        int[] expected = null;
        assertArrayEquals(expected, f(first, second));

    }

    @Test
    public void testEight() {
        int[] first = null, second = {};
        int[] expected = null;
        assertArrayEquals(expected, f(first, second));

    }

    @Test
    public void testNine() {
        int[] first = null, second = null;
        int[] expected = null;
        assertArrayEquals(expected, f(first, second));

    }
}
