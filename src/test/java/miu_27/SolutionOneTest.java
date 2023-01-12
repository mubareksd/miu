package miu_27;

import static miu_27.SolutionOne.isNUnique;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionOneTest {

    @Test
    void TestOne() {
        int[] a = { 7, 3, 3, 2, 4 };
        int n = 6;
        int expected = 0;
        assertEquals(expected, isNUnique(a, n));
    }

    @Test
    void TestTwo() {
        int[] a = { 7, 3, 3, 2, 4 };
        int n = 10;
        int expected = 0;
        assertEquals(expected, isNUnique(a, n));
    }

    @Test
    void TestThree() {
        int[] a = { 7, 3, 3, 2, 4 };
        int n = 11;
        int expected = 1;
        assertEquals(expected, isNUnique(a, n));
    }

    @Test
    void TestFour() {
        int[] a = { 7, 3, 3, 2, 4 };
        int n = 8;
        int expected = 0;
        assertEquals(expected, isNUnique(a, n));
    }

    @Test
    void TestFive() {
        int[] a = { 7, 3, 3, 2, 4 };
        int n = 4;
        int expected = 0;
        assertEquals(expected, isNUnique(a, n));
    }

    @Test
    void TestSix() {
        int[] a = { 1 };
        int n = 1;
        int expected = 0;
        assertEquals(expected, isNUnique(a, n));
    }

}
