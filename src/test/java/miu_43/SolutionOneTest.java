package miu_43;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionOneTest {
    
    @Test
    void TestOne() {
        int n = 1;
        int expected = 8;
        assertEquals(expected, SolutionOne.fullnessQuotient(n));
    }

    @Test
    void TestTwo() {
        int n = 9;
        int expected = 5;
        assertEquals(expected, SolutionOne.fullnessQuotient(n));
    }

    @Test
    void TestThree() {
        int n = 360;
        int expected = 0;
        assertEquals(expected, SolutionOne.fullnessQuotient(n));
    }

    @Test
    void TestFour() {
        int n = -4;
        int expected = -1;
        assertEquals(expected, SolutionOne.fullnessQuotient(n));
    }

}
