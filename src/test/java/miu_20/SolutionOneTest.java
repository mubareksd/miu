package miu_20;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionOneTest {

    @Test
    void TestOne() {
        int[] a = {3, 0, 2, -5, 0};
        int expected = 2;
        assertEquals(expected, SolutionOne.sumFactor(a));
    }

    @Test
    void TestTwo() {
        int[] a = {9, -3, -3, -1, -1};
        int expected = 0;
        assertEquals(expected, SolutionOne.sumFactor(a));
    }

    @Test
    void TestThree() {
        int[] a = {1};
        int expected = 1;
        assertEquals(expected, SolutionOne.sumFactor(a));
    }

    @Test
    void TestFour() {
        int[] a = {0,0,0};
        int expected = 3;
        assertEquals(expected, SolutionOne.sumFactor(a));
    }
    
}
