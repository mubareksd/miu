package miu_55;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestC {
    
    @Test
    void TestOne() {
        int[] a = {2, 3, 5, 7, 11};
        int expected = 1;
        assertEquals(expected, QuestionC.is235Array(a));
    }

    @Test
    void Test2() {
        int[] a = {2, 3, 6, 7, 11};
        int expected = 0;
        assertEquals(expected, QuestionC.is235Array(a));
    }

    @Test
    void Test3() {
        int[] a = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        int expected = 0;
        assertEquals(expected, QuestionC.is235Array(a));
    }

    @Test
    void Test4() {
        int[] a = {2, 4, 8, 16, 32};
        int expected = 1;
        assertEquals(expected, QuestionC.is235Array(a));
    }

    @Test
    void Test5() {
        int[] a = {3, 9, 27, 7, 1, 1, 1, 1, 1};
        int expected = 1;
        assertEquals(expected, QuestionC.is235Array(a));
    }

    @Test
    void Test6() {
        int[] a = {7, 11, 77, 49};
        int expected = 1;
        assertEquals(expected, QuestionC.is235Array(a));
    }

    @Test
    void Test7() {
        int[] a = {2};
        int expected = 1;
        assertEquals(expected, QuestionC.is235Array(a));
    }

    @Test
    void Test8() {
        int[] a = {};
        int expected = 1;
        assertEquals(expected, QuestionC.is235Array(a));
    }

    @Test
    void Test9() {
        int[] a = {7, 2, 7, 2, 7, 2, 7, 2, 3, 7, 7};
        int expected = 1;
        assertEquals(expected, QuestionC.is235Array(a));
    }

}
