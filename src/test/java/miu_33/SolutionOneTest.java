package miu_33;

import static miu_33.SolutionOne.isSumSafe;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionOneTest {

    @Test
    void TestOne() {
        int[] a = { 5, -5, 0 };
        int expected = 0;
        assertEquals(expected, isSumSafe(a));
    }

    @Test
    void TestTwo() {
        int[] a = { 5, -2, 1 };
        int expected = 1;
        assertEquals(expected, isSumSafe(a));
    }

}
