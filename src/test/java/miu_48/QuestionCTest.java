package miu_48;

import static miu_48.QuestionC.matchPattern;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class QuestionCTest {
    @Test
    void testOne() {
        int[] a = { 1, 1, 1, 1, 1 };
        int[] pattern = { 1 };
        int expected = 1;
        assertEquals(expected, matchPattern(a, pattern));
    }

    @Test
    void testTwo() {
        int[] a = { 1 };
        int[] pattern = { 1 };
        int expected = 1;
        assertEquals(expected, matchPattern(a, pattern));
    }

    @Test
    void testThree() {
        int[] a = { 1, 1, 2, 2, 2, 2 };
        int[] pattern = { 1, 2 };
        int expected = 1;
        assertEquals(expected, matchPattern(a, pattern));
    }

    @Test
    void testFour() {
        int[] a = { 1, 2, 3 };
        int[] pattern = { 1, 2 };
        int expected = 0;
        assertEquals(expected, matchPattern(a, pattern));
    }

    @Test
    void testFive() {
        int[] a = { 1, 2 };
        int[] pattern = { 1, 2, 3 };
        int expected = 0;
        assertEquals(expected, matchPattern(a, pattern));
    }

    @Test
    void testSix() {
        int[] a = { 1, 1, 2, 2, 2, 2, 3 };
        int[] pattern = { 1, 3 };
        int expected = 0;
        assertEquals(expected, matchPattern(a, pattern));
    }

    @Test
    void testSeven() {
        int[] a = { 1, 1, 1, 1 };
        int[] pattern = { 1, 2 };
        int expected = 0;
        assertEquals(expected, matchPattern(a, pattern));
    }

    @Test
    void testEight() {
        int[] a = { 1, 1, 1, 1, 2, 2, 3, 3 };
        int[] pattern = { 1, 2 };
        int expected = 0;
        assertEquals(expected, matchPattern(a, pattern));
    }

    @Test
    void testNine() {
        int[] a = { 1, 1, 10, 4, 4, 3 };
        int[] pattern = { 1, 4, 3 };
        int expected = 0;
        assertEquals(expected, matchPattern(a, pattern));
    }
}
