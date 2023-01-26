package miu_57;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestB {

    @Test
    void TestOne() {
        int[] a = { 1, -3, 5, -6 };
        int expected = 1;
        assertEquals(expected, QuestionB.isDaphneArray(a));
    }

    @Test
    void Test2() {
        int[] a = { -3, 5, -6 };
        int expected = 1;
        assertEquals(expected, QuestionB.isDaphneArray(a));
    }

    @Test
    void Test3() {
        int[] a = { 1, -3, 5 };
        int expected = 1;
        assertEquals(expected, QuestionB.isDaphneArray(a));
    }

    @Test
    void Test4() {
        int[] a = { -3, 5 };
        int expected = 1;
        assertEquals(expected, QuestionB.isDaphneArray(a));
    }

    @Test
    void Test5() {
        int[] a = { -3 };
        int expected = 1;
        assertEquals(expected, QuestionB.isDaphneArray(a));
    }

    @Test
    void Test6() {
        int[] a = { 5 };
        int expected = 1;
        assertEquals(expected, QuestionB.isDaphneArray(a));
    }

    @Test
    void Test7() {
        int[] a = { 1, 1, -3, 5 };
        int expected = 0;
        assertEquals(expected, QuestionB.isDaphneArray(a));
    }

    @Test
    void Test8() {
        int[] a = { -2, -2, -2 };
        int expected = 0;
        assertEquals(expected, QuestionB.isDaphneArray(a));
    }

    @Test
    void Test9() {
        int[] a = { 1, -1, 2, 2 };
        int expected = 0;
        assertEquals(expected, QuestionB.isDaphneArray(a));
    }

}
