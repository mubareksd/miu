package miu_47;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestA {

    @Test
    void TestOne() {
        int[] a = { 1, 2, 3, 4 };
        int expected = 7;
        assertEquals(expected, QuestionA.largestAdjacentSum(a));
    }

    @Test
    void TestTwo() {
        int[] a = { 18, -12, 9, -10 };
        int expected = 6;
        assertEquals(expected, QuestionA.largestAdjacentSum(a));
    }

    @Test
    void TestThree() {
        int[] a = { 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int expected = 2;
        assertEquals(expected, QuestionA.largestAdjacentSum(a));
    }

    @Test
    void TestFour() {
        int[] a = { 1, 1, 1, 1, 1, 2, 1, 1, 1 };
        int expected = 3;
        assertEquals(expected, QuestionA.largestAdjacentSum(a));
    }

}
