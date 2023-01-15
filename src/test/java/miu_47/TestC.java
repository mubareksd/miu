package miu_47;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestC {
    
    @Test
    void TestOne() {
        int[] a = {1, 2, 3, 4, 5};
        int m = 1;
        int n = 5;
        int expected = 1;
        assertEquals(expected, QuestionC.isSequencedArray(a, m, n));
    }

    @Test
    void TestTwo() {
        int[] a = {1, 3, 4, 2, 5};
        int m = 1;
        int n = 5;
        int expected = 0;
        assertEquals(expected, QuestionC.isSequencedArray(a, m, n));
    }

    @Test
    void TestThree() {
        int[] a = {-5, -5, -4, -4, -4, -3, -3, -2, -2, -2};
        int m = -5;
        int n = -2;
        int expected = 1;
        assertEquals(expected, QuestionC.isSequencedArray(a, m, n));
    }

    @Test
    void TestFour() {
        int[] a = {0, 1, 2, 3, 4, 5};
        int m = 1;
        int n = 5;
        int expected = 0;
        assertEquals(expected, QuestionC.isSequencedArray(a, m, n));
    }

    @Test
    void TestFive() {
        int[] a = {1, 2, 3, 4};
        int m = 1;
        int n = 5;
        int expected = 0;
        assertEquals(expected, QuestionC.isSequencedArray(a, m, n));
    }

    @Test
    void TestSix() {
        int[] a = {1, 2, 5};
        int m = 1;
        int n = 5;
        int expected = 0;
        assertEquals(expected, QuestionC.isSequencedArray(a, m, n));
    }

    @Test
    void TestSeven() {
        int[] a = {5, 4, 3, 2, 1};
        int m = 1;
        int n = 5;
        int expected = 0;
        assertEquals(expected, QuestionC.isSequencedArray(a, m, n));
    }

}
