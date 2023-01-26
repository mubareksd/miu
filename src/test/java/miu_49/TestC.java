package miu_49;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestC {

    @Test
    void TestOne() {
        int[] a = { 2, -3, -2, 6, 9, 18 };
        int expected = 51839;
        assertEquals(expected, QuestionC.decodeArray(a));
    }

    @Test
    void TestTwo() {
        int[] a = { 0, -3, 0, -4, 0 };
        int expected = 3344;
        assertEquals(expected, QuestionC.decodeArray(a));
    }

    @Test
    void TestThree() {
        int[] a = { -1, 5, 8, 17, 15 };
        int expected = -6392;
        assertEquals(expected, QuestionC.decodeArray(a));
    }

    @Test
    void TestFour() {
        int[] a = { 1, 5, 8, 17, 15 };
        int expected = 4392;
        assertEquals(expected, QuestionC.decodeArray(a));
    }

}
