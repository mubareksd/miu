package miu_16;

import static miu_16.SolutionOne.countSquarePairs;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionOneTest {

    @Test
    void TestOne() {
        int[] a = { 9, 0, 2, -5, 7 };
        int expected = 2;
        assertEquals(expected, countSquarePairs(a));
    }

    @Test
    void TestTwo() {
        int[] a = { 9 };
        int expected = 0;
        assertEquals(expected, countSquarePairs(a));
    }

}
