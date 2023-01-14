package miu_44;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionOneTest {

    @Test
    void TestOne() {

        int[] a = { 2, 2, 1 };
        int expected = 1;
        assertEquals(expected, SolutionOne.isPacked(a));

    }

    @Test
    void TestTwo() {

        int[] a = { 2, 2, 1, 2, 2 };
        int expected = 0;
        assertEquals(expected, SolutionOne.isPacked(a));

    }

    @Test
    void TestThree() {

        int[] a = { 4, 4, 4, 4, 1, 2, 2, 3, 3, 3 };
        int expected = 1;
        assertEquals(expected, SolutionOne.isPacked(a));

    }

    @Test
    void TestFour() {

        int[] a = { 7, 7, 7, 7, 7, 7, 7, 1 };
        int expected = 1;
        assertEquals(expected, SolutionOne.isPacked(a));

    }

    @Test
    void TestFive() {

        int[] a = { 7, 7, 7, 7, 1, 7, 7, 7 };
        int expected = 0;
        assertEquals(expected, SolutionOne.isPacked(a));

    }

    @Test
    void TestSix() {

        int[] a = { 7, 7, 7, 7, 7,
                7, 7 };
        int expected = 1;
        assertEquals(expected, SolutionOne.isPacked(a));

    }

    @Test
    void TestSeven() {

        int[] a = {};
        int expected = 1;
        assertEquals(expected, SolutionOne.isPacked(a));

    }

    @Test
    void TestEight() {

        int[] a = {1, 2, 1};
        int expected = 0;
        assertEquals(expected, SolutionOne.isPacked(a));

    }

    @Test
    void TestNine() {

        int[] a = {2, 1, 1};
        int expected = 0;
        assertEquals(expected, SolutionOne.isPacked(a));

    }

    @Test
    void TestTen() {

        int[] a = {-3, -3, -3};
        int expected = 0;
        assertEquals(expected, SolutionOne.isPacked(a));

    }

    @Test
    void TestEleven() {

        int[] a = {2,1,2};
        int expected = 0;
        assertEquals(expected, SolutionOne.isPacked(a));

    }

    @Test
    void TestTweleve() {

        int[] a = {0, 2, 2};
        int expected = 0;
        assertEquals(expected, SolutionOne.isPacked(a));

    }

}
