package miu_51;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestB {

    @Test
    void TestOne() {
        int n = 5;
        int expected = 1;
        assertEquals(expected, QuestionB.isPrimeHappy(n));
    }

    @Test
    void TestTwo() {
        int n = 25;
        int expected = 1;
        assertEquals(expected, QuestionB.isPrimeHappy(n));
    }

    @Test
    void TestThree() {
        int n = 32;
        int expected = 1;
        assertEquals(expected, QuestionB.isPrimeHappy(n));
    }

    @Test
    void TestFour() {
        int n = 8;
        int expected = 0;
        assertEquals(expected, QuestionB.isPrimeHappy(n));
    }

    @Test
    void TestFive() {
        int n = 2;
        int expected = 0;
        assertEquals(expected, QuestionB.isPrimeHappy(n));
    }

}
