package miu_46;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestB {

    @Test
    void TestOne() {
        int[] a = { 1, 2, 1 };
        int expected = 1;
        assertEquals(expected, QuestionB.is121Array(a));
    }

    @Test
    void TestTwo() {
        int[] a = { 1, 1, 2, 2, 2, 1, 1 };
        int expected = 1;
        assertEquals(expected, QuestionB.is121Array(a));
    }

    @Test
    void TestThree() {
        int[] a = { 1, 1, 2, 2, 2, 1, 1, 1 };
        int expected = 0;
        assertEquals(expected, QuestionB.is121Array(a));
    }

    @Test
    void TestFour() {
        int[] a = { 1, 1, 2, 1, 2, 1, 1 };
        int expected = 0;
        assertEquals(expected, QuestionB.is121Array(a));
    }

    @Test
    void TestFive() {
        int[] a = { 1, 1, 1, 2, 2, 2, 1, 1, 1, 3 };
        int expected = 0;
        assertEquals(expected, QuestionB.is121Array(a));
    }

    @Test
    void TestSix() {
        int[] a = { 1, 1, 1, 1, 1, 1 };
        int expected = 0;
        assertEquals(expected, QuestionB.is121Array(a));
    }

    @Test
    void TestSeven() {
        int[] a = { 2, 2, 2, 1, 1, 1, 2, 2, 2,
                1, 1 };
        int expected = 0;
        assertEquals(expected, QuestionB.is121Array(a));
    }

}
