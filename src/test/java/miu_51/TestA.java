package miu_51;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestA {

    @Test
    void TestOne() {

        int[] a = { 1, 2, 19, 4, 5 };
        int expected = 1;
        assertEquals(expected, QuestionA.isOnionArray(a));

    }

    @Test
    void TestTwo() {

        int[] a = { 1, 2, 3, 4, 15 };
        int expected = 0;
        assertEquals(expected, QuestionA.isOnionArray(a));

    }

    @Test
    void TestThree() {

        int[] a = { 1, 3, 9, 8 };
        int expected = 0;
        assertEquals(expected, QuestionA.isOnionArray(a));

    }

    @Test
    void TestFour() {

        int[] a = { 2 };
        int expected = 1;
        assertEquals(expected, QuestionA.isOnionArray(a));

    }

    @Test
    void TestFive() {

        int[] a = {};
        int expected = 1;
        assertEquals(expected, QuestionA.isOnionArray(a));

    }

    @Test
    void TestSix() {

        int[] a = { -2, 5, 0, 5, 12 };
        int expected = 1;
        assertEquals(expected, QuestionA.isOnionArray(a));

    }

}
