package miu_40;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionOneTest {

    @Test
    void TestOne() {
        int n = 4;
        int expected = 624;
        assertEquals(expected, SolutionOne.smallest(n));
    }

    @Test
    void TestTwo() {
        int n = 5;
        int expected = 624;
        assertEquals(expected, SolutionOne.smallest(n));
    }

    @Test
    void TestThree() {
        int n = 6;
        int expected = 642;
        assertEquals(expected, SolutionOne.smallest(n));
    }

    @Test
    void TestFour() {
        int n = 7;
        int expected = 4062;
        assertEquals(expected, SolutionOne.smallest(n));
    }

}
