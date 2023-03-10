package miu_26;

import static miu_26.SolutionOne.isDivisible;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionOneTest {

    @Test
    void TestOne() {
        int[] a = { 3, 3, 6, 36 };
        int divisor = 3;
        int expected = 1;
        assertEquals(expected, isDivisible(a, divisor));
    }

    @Test
    void TestTwo() {
        int[] a = { 4 };
        int divisor = 2;
        int expected = 1;
        assertEquals(expected, isDivisible(a, divisor));
    }

    @Test
    void TestThree() {
        int[] a = { 3, 4, 3, 6, 36 };
        int divisor = 3;
        int expected = 0;
        assertEquals(expected, isDivisible(a, divisor));
    }

    @Test
    void TestFour() {
        int[] a = { 6, 12, 24, 36 };
        int divisor = 12;
        int expected = 0;
        assertEquals(expected, isDivisible(a, divisor));
    }

    @Test
    void TestFive() {
        int[] a = {};
        int divisor = 4;
        int expected = 1;
        assertEquals(expected, isDivisible(a, divisor));
    }

}
