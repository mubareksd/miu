package miu_55;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestB {

    @Test
    void TestOne() {
        int[] a = { 1, 2, 10, 3, 15, 1, 2, 2 };
        int expected = 0;
        assertEquals(expected, QuestionB.isMercurial(a));
    }

    @Test
    void Test2() {
        int[] a = { 5, 2, 10, 3, 15, 1, 2, 2 };
        int expected = 1;
        assertEquals(expected, QuestionB.isMercurial(a));
    }

    @Test
    void Test3() {
        int[] a = { 1, 2, 10, 3, 15, 16, 2, 2 };
        int expected = 1;
        assertEquals(expected, QuestionB.isMercurial(a));
    }

    @Test
    void Test4() {
        int[] a = { 3, 2, 18, 1, 0, 3, -11, 1, 3 };
        int expected = 0;
        assertEquals(expected, QuestionB.isMercurial(a));
    }

    @Test
    void Test5() {
        int[] a = { 2, 3, 1, 1, 18 };
        int expected = 1;
        assertEquals(expected, QuestionB.isMercurial(a));
    }

    @Test
    void Test6() {
        int[] a = { 8, 2, 1, 1, 18, 3, 5 };
        int expected = 1;
        assertEquals(expected, QuestionB.isMercurial(a));
    }

    @Test
    void Test7() {
        int[] a = { 3, 3, 3, 3, 3, 3 };
        int expected = 1;
        assertEquals(expected, QuestionB.isMercurial(a));
    }

    @Test
    void Test8() {
        int[] a = { 1 };
        int expected = 1;
        assertEquals(expected, QuestionB.isMercurial(a));
    }

    @Test
    void Test9() {
        int[] a = {};
        int expected = 1;
        assertEquals(expected, QuestionB.isMercurial(a));
    }

}
