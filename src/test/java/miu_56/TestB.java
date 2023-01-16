package miu_56;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestB {

    @Test
    void TestO() {
        int[] a = {1,3};
        int expected = 1;
        assertEquals(expected, QuestionB.isMartian(a));
    }

    @Test
    void TestOne() {
        int[] a = {1, 2, 1, 2, 1, 2, 1,
            2, 1};
        int expected = 1;
        assertEquals(expected, QuestionB.isMartian(a));
    }

    @Test
    void Test2() {
        int[] a = {1, 3, 2};
        int expected = 0;
        assertEquals(expected, QuestionB.isMartian(a));
    }

    @Test
    void Test3() {
        int[] a = {1, 3, 2, 2, 1, 5, 1,
            5};
        int expected = 0;
        assertEquals(expected, QuestionB.isMartian(a));
    }

    @Test
    void Test4() {
        int[] a = {1, 2, -18, -18, 1,
            2};
        int expected = 0;
        assertEquals(expected, QuestionB.isMartian(a));
    }

    @Test
    void Test5() {
        int[] a = {};
        int expected = 0;
        assertEquals(expected, QuestionB.isMartian(a));
    }

    @Test
    void Test6() {
        int[] a = {};
        int expected = 0;
        assertEquals(expected, QuestionB.isMartian(a));
    }

    @Test
    void Test7() {
        int[] a = {1};
        int expected = 1;
        assertEquals(expected, QuestionB.isMartian(a));
    }

    @Test
    void Test8() {
        int[] a = {2};
        int expected = 0;
        assertEquals(expected, QuestionB.isMartian(a));
    }

}
