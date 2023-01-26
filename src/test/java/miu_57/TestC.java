package miu_57;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestC {

    @Test
    void TestOne() {
        int[] a = { 3, 8, 12 };
        int expected = 1;
        assertEquals(expected, QuestionC.isCucumber(a));
    }

    @Test
    void Test2() {
        int[] a = { 1, 3, 15 };
        int expected = 0;
        assertEquals(expected, QuestionC.isCucumber(a));
    }

    @Test
    void Test3() {
        int[] a = { 3, 4, 12, 11 };
        int expected = 0;
        assertEquals(expected, QuestionC.isCucumber(a));
    }
}
