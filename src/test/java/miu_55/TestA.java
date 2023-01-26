package miu_55;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestA {

    @Test
    void TestOne() {
        int n = 1;
        int expected = 1;
        assertEquals(expected, QuestionA.isTriangular(n));
    }

    @Test
    void TestTwo() {
        int n = 3;
        int expected = 1;
        assertEquals(expected, QuestionA.isTriangular(n));
    }

    @Test
    void TestThree() {
        int n = 6;
        int expected = 1;
        assertEquals(expected, QuestionA.isTriangular(n));
    }

    @Test
    void TestFour() {
        int n = 10;
        int expected = 1;
        assertEquals(expected, QuestionA.isTriangular(n));
    }

    @Test
    void TestFive() {
        int n = 8;
        int expected = 0;
        assertEquals(expected, QuestionA.isTriangular(n));
    }

}
