package miu_23;

import static miu_23.SolutionOne.repsEqual;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionOneTest {

    @Test
    void TestOne() {
        int[] a = { 3, 2, 0, 5, 3 };
        int n = 32053;
        int expected = 1;
        assertEquals(expected, SolutionOne.repsEqual(a, n));
    }

    @Test
    void TestTwo() {
        int[] a = { 3, 2, 0, 5 };
        int n = 32053;
        int expected = 0;
        assertEquals(expected, SolutionOne.repsEqual(a, n));
    }

    @Test
    void TestThree() {
        int[] a = { 3, 2, 0, 5, 3, 4 };
        int n = 32053;
        int expected = 0;
        assertEquals(expected, SolutionOne.repsEqual(a, n));
    }

    @Test
    void TestFour() {
        int[] a = { 2, 3, 0, 5, 3 };
        int n = 32053;
        int expected = 0;
        assertEquals(expected, SolutionOne.repsEqual(a, n));
    }

    @Test
    void TestFive() {
        int[] a = { 9, 3, 1, 1, 2 };
        int n = 32053;
        int expected = 0;
        assertEquals(expected, SolutionOne.repsEqual(a, n));
    }

    @Test
    void TestSix() {
        int[] a = { 0, 3, 2, 0, 5, 3 };
        int n = 32053;
        int expected = 1;
        assertEquals(expected, SolutionOne.repsEqual(a, n));
    }
}
