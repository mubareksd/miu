package miu_34;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionOneTest {
    
    @Test
    void TestOne() {
        int n = 2;
        int expected = 1;
        assertEquals(expected, SolutionOne.isIsolated(n));
    }

    @Test
    void TestTwo() {
        int n = 3;
        int expected = 1;
        assertEquals(expected, SolutionOne.isIsolated(n));
    }

    @Test
    void TestThree() {
        int n = 8;
        int expected = 1;
        assertEquals(expected, SolutionOne.isIsolated(n));
    }

    @Test
    void TestFour() {
        int n = 9;
        int expected = 1;
        assertEquals(expected, SolutionOne.isIsolated(n));
    }

    @Test
    void TestFive() {
        int n = 14;
        int expected = 1;
        assertEquals(expected, SolutionOne.isIsolated(n));
    }

    @Test
    void TestSix() {
        int n = 24;
        int expected = 1;
        assertEquals(expected, SolutionOne.isIsolated(n));
    }

    @Test
    void TestSeven() {
        int n = 28;
        int expected = 1;
        assertEquals(expected, SolutionOne.isIsolated(n));
    }

    @Test
    void TestEight() {
        int n = 34;
        int expected = 1;
        assertEquals(expected, SolutionOne.isIsolated(n));
    }

    @Test
    void TestNine() {
        int n = 58;
        int expected = 1;
        assertEquals(expected, SolutionOne.isIsolated(n));
    }

    @Test
    void TestTen() {
        int n = 63;
        int expected = 1;
        assertEquals(expected, SolutionOne.isIsolated(n));
    }

}
