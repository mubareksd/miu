package miu_16;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionOneTest {

    @Test
    void TestOne() {
        int[] a = {9, 0, 2, -5, 7};
        int expected = 2;
        assertEquals(expected, SolutionOne.countSquarePairs(a));
    }

    @Test
    void TestTwo() {
        int[] a = {9};
        int expected = 0;
        assertEquals(expected, SolutionOne.countSquarePairs(a));
    }
    
}
