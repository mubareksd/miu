package miu_38;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import miu_38.SolutionOne;

public class SolutionOneTest {
    
    @Test
    void TestOne() {
        int[] a = {2, 3, 3, 99, 99, 99, 99, 99};
        int expected = 1;
        assertEquals(expected, SolutionOne.isSequentiallyBounded(a));
    }

    @Test
    void TestTwo() {
        int[] a = {1, 2, 3};
        int expected = 0;
        assertEquals(expected, SolutionOne.isSequentiallyBounded(a));
    }

    @Test
    void TestThree() {
        int[] a = {2, 3, 3, 3, 3};
        int expected = 0;
        assertEquals(expected, SolutionOne.isSequentiallyBounded(a));
    }

    @Test
    void TestFour() {
        int[] a = {12, 12, 9};
        int expected = 0;
        assertEquals(expected, SolutionOne.isSequentiallyBounded(a));
    }

    @Test
    void TestFive() {
        int[] a = {0, 1};
        int expected = 0;
        assertEquals(expected, SolutionOne.isSequentiallyBounded(a));
    }

    @Test
    void TestSix() {
        int[] a = {-1, 2};
        int expected = 0;
        assertEquals(expected, SolutionOne.isSequentiallyBounded(a));
    }

    @Test
    void TestSeven() {
        int[] a = {5, 5, 5, 5};
        int expected = 1;
        assertEquals(expected, SolutionOne.isSequentiallyBounded(a));
    }

    @Test
    void TestEight() {
        int[] a = {5, 5, 5, 2, 5};
        int expected = 0;
        assertEquals(expected, SolutionOne.isSequentiallyBounded(a));
    }

    @Test
    void TestNine() {
        int[] a = {};
        int expected = 1;
        assertEquals(expected, SolutionOne.isSequentiallyBounded(a));
    }



}
