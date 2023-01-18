package miu_53;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestC {

    @Test
    void TestOne() {
        int num = 12;
        int expected = 8;
        assertEquals(expected, QuestionC.closestFibonacci(num));
    }

    @Test
    void TestTwo() {
        int num = 33;
        int expected = 21;
        assertEquals(expected, QuestionC.closestFibonacci(num));
    }

    @Test
    void TestThree() {
        int num = 34;
        int expected = 34;
        assertEquals(expected, QuestionC.closestFibonacci(num));
    }

}
