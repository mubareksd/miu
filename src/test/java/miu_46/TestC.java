package miu_46;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class TestC {
    
    @Test
    void TestOne() {
        int[] a = {9, -9};
        int n = 0;
        int[] expected = {};
        assertEquals(Arrays.toString(expected), Arrays.toString(QuestionC.filterArray(a, n)));
    }

    @Test
    void TestTwo() {
        int[] a = {9, -9};
        int n = 1;
        int[] expected = {9};
        assertEquals(Arrays.toString(expected), Arrays.toString(QuestionC.filterArray(a, n)));
    }

    @Test
    void TestThree() {
        int[] a = {9, -9};
        int n = 2;
        int[] expected = {-9};
        assertEquals(Arrays.toString(expected), Arrays.toString(QuestionC.filterArray(a, n)));
    }

    @Test
    void TestFour() {
        int[] a = {9, -9};
        int n = 3;
        int[] expected = {9, -9};
        assertEquals(Arrays.toString(expected), Arrays.toString(QuestionC.filterArray(a, n)));
    }

    @Test
    void TestFive() {
        int[] a = {9, -9};
        int n = 4;
        int[] expected = null;
        assertEquals(Arrays.toString(expected), Arrays.toString(QuestionC.filterArray(a, n)));
    }

    @Test
    void TestSix() {
        int[] a = {9, -9, 5};
        int n = 3;
        int[] expected = {9, -9};
        assertEquals(Arrays.toString(expected), Arrays.toString(QuestionC.filterArray(a, n)));
    }

    @Test
    void TestSeven() {
        int[] a = {0, 9, 12, 18, -6};
        int n = 11;
        int[] expected = {0, 9, 18};
        assertEquals(Arrays.toString(expected), Arrays.toString(QuestionC.filterArray(a, n)));
    }

}
