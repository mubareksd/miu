package miu_36;

import static miu_36.SolutionOne.isTrivalent;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionOneTest {

    @Test
    void TestOne() {
        int[] a = { -1, 0, 1, 0, 0, 0 };
        int expected = 1;
        assertEquals(expected, isTrivalent(a));
    }

    @Test
    void TestTwo() {
        int[] a = {};
        int expected = 0;
        assertEquals(expected, isTrivalent(a));
    }

    @Test
    void TestThree() {
        int[] a = { 2147483647, -1, -1, -2147483648 };
        int expected = 1;
        assertEquals(expected, isTrivalent(a));
    }

}
