package miu_54;

import static miu_54.QuestionB.isOneBalanced;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class QuestionBTest {
    @Test
    public void testOne() {
        int[] a = { 1, 1, 1, 2, 3, -18, 45, 1 };
        int expected = 1;
        assertEquals(expected, isOneBalanced(a));
    }

    @Test
    public void testTwo() {
        int[] a = { 1, 1, 1, 2, 3, -18, 45, 1, 0 };
        int expected = 0;
        assertEquals(expected, isOneBalanced(a));
    }

    @Test
    public void testThree() {
        int[] a = { 1, 1, 2, 3, 1, -18, 26, 1 };
        int expected = 0;
        assertEquals(expected, isOneBalanced(a));
    }

    @Test
    public void testFour() {
        int[] a = {};
        int expected = 1;
        assertEquals(expected, isOneBalanced(a));
    }

    @Test
    public void testFive() {
        int[] a = { 3, 4, 1, 1 };
        int expected = 1;
        assertEquals(expected, isOneBalanced(a));
    }

    @Test
    public void testSix() {
        int[] a = { 1, 1, 3, 4 };
        int expected = 1;
        assertEquals(expected, isOneBalanced(a));
    }

    @Test
    public void testSeven() {
        int[] a = { 3, 3, 3, 3, 3, 3 };
        int expected = 0;
        assertEquals(expected, isOneBalanced(a));
    }

    @Test
    public void testEight() {
        int[] a = { 1, 1, 1, 1, 1, 1 };
        int expected = 0;
        assertEquals(expected, isOneBalanced(a));
    }
}
