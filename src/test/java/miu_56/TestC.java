package miu_56;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestC {
    
    @Test
    void Test1() {
        int[] a = {1, 4, 1, 4, 5, 6};
        int n = 5;
        int expected = 1;
        assertEquals(expected, QuestionC.isPairedN(a, n));
    }

    @Test
    void Test2() {
        int[] a = {1, 4, 1, 4, 5, 6};
        int n = 6;
        int expected = 1;
        assertEquals(expected, QuestionC.isPairedN(a, n));
    }

    @Test
    void Test3() {
        int[] a = {0, 1, 2, 3, 4, 5, 6, 7,
            8};
        int n = 6;
        int expected = 1;
        assertEquals(expected, QuestionC.isPairedN(a, n));
    }

    @Test
    void Test4() {
        int[] a = {1, 4, 1};
        int n = 5;
        int expected = 0;
        assertEquals(expected, QuestionC.isPairedN(a, n));
    }

    @Test
    void Test5() {
        int[] a = {8, 8, 8, 8, 7, 7, 7};
        int n = 15;
        int expected = 0;
        assertEquals(expected, QuestionC.isPairedN(a, n));
    }

    @Test
    void Test6() {
        int[] a = {8, -8, 8, 8, 7, 7, -7};
        int n = -15;
        int expected = 0;
        assertEquals(expected, QuestionC.isPairedN(a, n));
    }

    @Test
    void Test7() {
        int[] a = {3};
        int n = 3;
        int expected = 0;
        assertEquals(expected, QuestionC.isPairedN(a, n));
    }

    @Test
    void Test8() {
        int[] a = {};
        int n = 0;
        int expected = 0;
        assertEquals(expected, QuestionC.isPairedN(a, n));
    }

}
