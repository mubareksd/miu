package miu_29;

import static miu_29.SolutionOne.isLegalNumber;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionOneTest {

    @Test
    void TestOne() {
        int[] a = { 3, 2, 1 };
        int n = 4;
        int expected = 1;
        assertEquals(expected, isLegalNumber(a, n));
    }

    @Test
    void TestTwo() {
        int[] a = { 3, 7, 1 };
        int n = 6;
        int expected = 0;
        assertEquals(expected, isLegalNumber(a, n));
    }
}
