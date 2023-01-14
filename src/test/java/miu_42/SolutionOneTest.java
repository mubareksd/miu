package miu_42;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionOneTest {
    
    @Test
    void TestOne() {
        int[] a = {1,2};
        int expected = 1;
        assertEquals(expected, SolutionOne.isRailroadTie(a));
    }

    @Test
    void TestTwo() {
        int[] a = {1, 2, 0, 1, 2, 0, 1, 2};
        int expected = 1;
        assertEquals(expected, SolutionOne.isRailroadTie(a));
    }

    @Test
    void TestThree() {
        int[] a = {3, 3, 0, 3, 3, 0, 3, 3, 0, 3, 3};
        int expected = 1;
        assertEquals(expected, SolutionOne.isRailroadTie(a));
    }

    @Test
    void TestFour() {
        int[] a = {0, 0, 0, 0};
        int expected = 0;
        assertEquals(expected, SolutionOne.isRailroadTie(a));
    }

    @Test
    void TestFive() {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int expected = 0;
        assertEquals(expected, SolutionOne.isRailroadTie(a));
    }


    @Test
    void TestSix() {
        int[] a = {1, 3, 0, 3, 5, 0};
        int expected = 0;
        assertEquals(expected, SolutionOne.isRailroadTie(a));
    }

}
