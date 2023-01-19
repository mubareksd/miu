package isLayered;

import static isLayered.Layered.isLayered;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LayeredTest {
    @Test
    void testOne() {
        int[] a = { 1, 1, 2, 2, 2, 3, 3 };
        int expected = 1;
        assertEquals(expected, isLayered(a));
    }

    @Test
    void testTwo() {
        int[] a = { 3, 3, 3, 3, 3, 3, 3 };
        int expected = 1;
        assertEquals(expected, isLayered(a));
    }

    @Test
    void testThree() {
        int[] a = { 1, 2, 2, 2, 3, 3 };
        int expected = 0;
        assertEquals(expected, isLayered(a));
    }

    @Test
    void testFour() {
        int[] a = { 2, 2, 2, 3, 3, 1, 1 };
        int expected = 0;
        assertEquals(expected, isLayered(a));
    }

    @Test
    void testFive() {
        int[] a = { 2 };
        int expected = 0;
        assertEquals(expected, isLayered(a));
    }

    @Test
    void testSix() {
        int[] a = {};
        int expected = 0;
        assertEquals(expected, isLayered(a));
    }
}