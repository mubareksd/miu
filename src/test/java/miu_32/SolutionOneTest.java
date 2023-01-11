package miu_32;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionOneTest {
    
    @Test
    void TestOne() {
        int n = 1;
        int expected = 1;
        assertEquals(expected, SolutionOne.isStacked(n));
    }

    @Test
    void TestTwo() {
        int n = 3;
        int expected = 1;
        assertEquals(expected, SolutionOne.isStacked(n));
    }

    @Test
    void TestThree() {
        int n = 6;
        int expected = 1;
        assertEquals(expected, SolutionOne.isStacked(n));
    }

    @Test
    void TestFour() {
        int n = 10;
        int expected = 1;
        assertEquals(expected, SolutionOne.isStacked(n));
    }

    @Test
    void TestFive() {
        int n = 15;
        int expected = 1;
        assertEquals(expected, SolutionOne.isStacked(n));
    }

    @Test
    void TestSix() {
        int n = 7;
        int expected = 0;
        assertEquals(expected, SolutionOne.isStacked(n));
    }

    @Test
    void TestSeven() {
        int n = 8;
        int expected = 0;
        assertEquals(expected, SolutionOne.isStacked(n));
    }

    @Test
    void TestNine() {
        int n = 9;
        int expected = 0;
        assertEquals(expected, SolutionOne.isStacked(n));
    }

    @Test
    void TestTen() {
        int n = 21;
        int expected = 1;
        assertEquals(expected, SolutionOne.isStacked(n));
    }

}
