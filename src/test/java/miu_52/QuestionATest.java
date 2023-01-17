package miu_52;

import static miu_52.QuestionA.isSystematicallyIncreasing;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class QuestionATest {
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
