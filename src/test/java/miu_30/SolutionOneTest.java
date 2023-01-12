package miu_30;

import static miu_30.SolutionOne.convertToBase10;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionOneTest {

    @Test
    void TestOne() {
        int[] a = { 1, 0, 1, 1 };
        int base = 2;
        int expected = 11;
        assertEquals(expected, convertToBase10(a, base));
    }

    @Test
    void TestTwo() {
        int[] a = { 1, 1, 2 };
        int base = 3;
        int expected = 14;
        assertEquals(expected, convertToBase10(a, base));
    }

    @Test
    void TestThree() {
        int[] a = { 3, 2, 5 };
        int base = 8;
        int expected = 213;
        assertEquals(expected, convertToBase10(a, base));
    }

    @Test
    void TestFour() {
        int[] a = { 3, 7, 1 };
        int base = 6;
        int expected = 0;
        assertEquals(expected, convertToBase10(a, base));
    }

}
