package miu_24;

import static miu_24.SolutionOne.isCentered15;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionOneTest {

    @Test
    void TestOne() {
        int[] a = { 3, 2, 10, 4, 1, 6, 9 };
        int expected = 1;
        assertEquals(expected, isCentered15(a));
    }

    @Test
    void TestTwo() {
        int[] a = { 2, 10, 4, 1, 6, 9 };
        int expected = 0;
        assertEquals(expected, isCentered15(a));
    }

    @Test
    void TestThree() {
        int[] a = { 3, 2, 10, 4, 1, 6 };
        int expected = 0;
        assertEquals(expected, isCentered15(a));
    }

    @Test
    void TestFour() {
        int[] a = { 1, 1, 8, 3, 1, 1 };
        int expected = 1;
        assertEquals(expected, isCentered15(a));
    }

    @Test
    void TestFive() {
        int[] a = { 9, 15, 6 };
        int expected = 1;
        assertEquals(expected, isCentered15(a));
    }

    @Test
    void TestSix() {
        int[] a = { 1, 1, 2, 2, 1, 1 };
        int expected = 0;
        assertEquals(expected, isCentered15(a));
    }

    @Test
    void TestSeven() {
        int[] a = { 1, 1, 15 - 1, -1 };
        int expected = 1;
        assertEquals(expected, isCentered15(a));
    }

}
