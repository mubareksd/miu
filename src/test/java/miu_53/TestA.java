package miu_53;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestA {

    @Test
    void TestOne() {
        int n = 31;
        int expected = 1;
        assertEquals(expected, QuestionA.isHodder(n));
    }

    @Test
    void TestTwo() {
        int n = 3;
        int expected = 1;
        assertEquals(expected, QuestionA.isHodder(n));
    }

    @Test
    void TestThree() {
        int n = 7;
        int expected = 1;
        assertEquals(expected, QuestionA.isHodder(n));
    }

    @Test
    void TestFour() {
        int n = 127;
        int expected = 1;
        assertEquals(expected, QuestionA.isHodder(n));
    }

    @Test
    void TestFive() {
        int n = 126;
        int expected = 0;
        assertEquals(expected, QuestionA.isHodder(n));
    }

}
