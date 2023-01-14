package miu_39;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import miu_39.SolutionOne;

public class SolutionOneTest {
    
    @Test
    void TestOne() {
        int[] a = {18, -1, 3, 4, 0};
        int expected = 0;
        assertEquals(expected, SolutionOne.isMinMaxDisjoint(a));
    }

    @Test
    void TestTwo() {
        int[] a = {9, 0, 5, 9};
        int expected = 0;
        assertEquals(expected, SolutionOne.isMinMaxDisjoint(a));
    }

    @Test
    void TestThree() {
        int[] a = {0, 5, 18, 0, 9};
        int expected = 0;
        assertEquals(expected, SolutionOne.isMinMaxDisjoint(a));
    }

    @Test
    void TestFour() {
        int[] a = {7, 7, 7, 7};
        int expected = 0;
        assertEquals(expected, SolutionOne.isMinMaxDisjoint(a));
    }

    @Test
    void TestFive() {
        int[] a = {};
        int expected = 0;
        assertEquals(expected, SolutionOne.isMinMaxDisjoint(a));
    }

    @Test
    void TestSix() {
        int[] a = {1, 2};
        int expected = 0;
        assertEquals(expected, SolutionOne.isMinMaxDisjoint(a));
    }

    @Test
    void TestSeven() {
        int[] a = {1};
        int expected = 0;
        assertEquals(expected, SolutionOne.isMinMaxDisjoint(a));
    }

    @Test
    void TestEight() {
        int[] a = {5, 4, 1, 3, 2};
        int expected = 1;
        assertEquals(expected, SolutionOne.isMinMaxDisjoint(a));
    }

}
