package miu_52;

import static miu_52.QuestionC.largestDifferenceOfEvens;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class QuestionCTest {
    @Test
    void testOne() {
        int[] a = { 1, 3, 5, 9 };
        int expected = -1;
        assertEquals(expected, largestDifferenceOfEvens(a));
    }

    @Test
    void testTwo() {
        int[] a = { 1, 18, 5, 7, 33 };
        int expected = -1;
        assertEquals(expected, largestDifferenceOfEvens(a));
    }

    @Test
    void testThree() {
        int[] a = {2, 2, 2, 2};
        int expected = 0;
        assertEquals(expected, largestDifferenceOfEvens(a));
    }

    @Test
    void testFour() {
        int[] a = { 1, 2, 1, 2, 1, 4, 1, 6, 4 };
        int expected = 4;
        assertEquals(expected, largestDifferenceOfEvens(a));
    }
}
