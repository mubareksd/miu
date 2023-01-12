package miu_35;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionOneTest {
    
    @Test
    void TestOne() {
        int[] a = {1};
        int expected = 1;
        assertEquals(expected, SolutionOne.isVanaila(a));
    }

    @Test
    void TestTwo() {
        int[] a = {11, 22, 13, 34, 125};
        int expected = 0;
        assertEquals(expected, SolutionOne.isVanaila(a));
    }

    @Test
    void TestThree() {
        int[] a = {9, 999, 99999, -9999};
        int expected = 1;
        assertEquals(expected, SolutionOne.isVanaila(a));
    }

    @Test
    void TestFour() {
        int[] a = {};
        int expected = 1;
        assertEquals(expected, SolutionOne.isVanaila(a));
    }

    @Test
    void TestFive() {
        int[] a = {0,0,0,0,0};
        int expected = 1;
        assertEquals(expected, SolutionOne.isVanaila(a));
    }

}
