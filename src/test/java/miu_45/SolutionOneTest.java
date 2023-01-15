package miu_45;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionOneTest {

    @Test
    void TestOne() {
        int[] a = { 1 };
        int expected = 1;
        assertEquals(expected, SolutionOne.isOddHeavy(a));
    }

    @Test
    void TestTwo() {
        int[] a = { 2 };
        int expected = 0;
        assertEquals(expected, SolutionOne.isOddHeavy(a));
    }

    @Test
    void TestThree() {
        int[] a = { 1, 1, 1, 1, 1, 1 };
        int expected = 1;
        assertEquals(expected, SolutionOne.isOddHeavy(a));
    }

    @Test
    void TestFour() {
        int[] a = {2, 4, 6, 8, 11};
        int expected = 1;
        assertEquals(expected, SolutionOne.isOddHeavy(a));
    }

    @Test
    void TestFive() {
        int[] a = {2, -4, -6, -8, -11};
        int expected = 0;
        assertEquals(expected, SolutionOne.isOddHeavy(a));
    }

}
