package miu_50;

import static miu_50.QuestionC.decodeArray;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class QuestionCTest {
    @Test
    void testOne() {
        int[] a = { 1 };
        int expected = 0;
        assertEquals(expected, decodeArray(a));
    }

    @Test
    void testTwo() {
        int[] a = { 0, 1 };
        int expected = 1;
        assertEquals(expected, decodeArray(a));
    }

    @Test
    void testThree() {
        int[] a = { -1, 0, 1 };
        int expected = -1;
        assertEquals(expected, decodeArray(a));
    }

    @Test
    void testFour() {
        int[] a = { 0, 1, 1, 1, 1, 1, 0, 1 };
        int expected = 100001;
        assertEquals(expected, decodeArray(a));
    }

    @Test
    void testFive() {
        int[] a = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 };
        int expected = 999;
        assertEquals(expected, decodeArray(a));
    }
}
