package miu_46;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestA {

    @Test
    void TestOne() {
        int n = 27;
        int p = 3;
        int expected = 3;
        assertEquals(expected, miu_46.QuestionA.getExponent(n, p));
    }

    @Test
    void TestTwo() {
        int n = 28;
        int p = 3;
        int expected = 0;
        assertEquals(expected, miu_46.QuestionA.getExponent(n, p));
    }

    @Test
    void TestThree() {
        int n = 280;
        int p = 7;
        int expected = 1;
        assertEquals(expected, miu_46.QuestionA.getExponent(n, p));
    }

    @Test
    void TestFour() {
        int n = -250;
        int p = 5;
        int expected = 3;
        assertEquals(expected, miu_46.QuestionA.getExponent(n, p));
    }

    @Test
    void TestFive() {
        int n = 18;
        int p = 1;
        int expected = -1;
        assertEquals(expected, miu_46.QuestionA.getExponent(n, p));
    }

    @Test
    void TestSix() {
        int n = 128;
        int p = 4;
        int expected = 3;
        assertEquals(expected, miu_46.QuestionA.getExponent(n, p));
    }

}
