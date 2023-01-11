package miu_28;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionOneTest {

    @Test
    void TestOne() {
        int n = 4;
        int expected = 1;
        assertEquals(expected, SolutionOne.isSquare(n));
    }

    @Test
    void TestTwo() {
        int n = 25;
        int expected = 1;
        assertEquals(expected, SolutionOne.isSquare(n));
    }

    @Test
    void TestThree() {
        int n = -4;
        int expected = 0;
        assertEquals(expected, SolutionOne.isSquare(n));
    }

    @Test
    void TestFour() {
        int n = 8;
        int expected = 0;
        assertEquals(expected, SolutionOne.isSquare(n));
    }

    @Test
    void TestFive() {
        int n = 0;
        int expected = 1;
        assertEquals(expected, SolutionOne.isSquare(n));
    }

}
