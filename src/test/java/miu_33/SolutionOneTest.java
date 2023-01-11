package miu_33;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionOneTest {
    
    @Test
    void TestOne() {
        int[] a = {5, -5, 0};
        int expected = 0;
        assertEquals(expected, SolutionOne.isSumSafe(a));
    }

    @Test
    void TestTwo() {
        int[] a = {5, -2, 1};
        int expected = 1;
        assertEquals(expected, SolutionOne.isSumSafe(a));
    }

}
