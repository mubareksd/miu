package miu_17;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionOneTest {
    
    @Test
    void TestOne() {
        int n = 0;
        int expected = 139;
        assertEquals(expected, SolutionOne.findPorcupineNumber(n));
    }

    @Test
    void TestTwo() {
        int n = 138;
        int expected = 139;
        assertEquals(expected, SolutionOne.findPorcupineNumber(n));
    }

    @Test
    void TestThree() {
        int n = 149;
        int expected = 409;
        assertEquals(expected, SolutionOne.findPorcupineNumber(n));
    }

    @Test
    void TestFour() {
        int n = 59;
        int expected = 139;
        assertEquals(expected, SolutionOne.findPorcupineNumber(n));
    }

}
