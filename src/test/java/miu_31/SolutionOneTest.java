package miu_31;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionOneTest {
 
    @Test
    void TestOne() {
        int[] a = {1, 2, 3, -5, -5, 2, 3, 18};
        int[] p = {3, -2, 3};
        int expected = 1;
        assertEquals(expected, SolutionOne.matches(a, p));
    }

    @Test
    void TestTwo() {
        int[] a = {1, 2, 3, -5, -5, 2, 3, 18};
        int[] p = {4, -1, 3};
        int expected = 0;
        assertEquals(expected, SolutionOne.matches(a, p));
    }

}
