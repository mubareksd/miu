package sumFactor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static sumFactor.SumFactor.sumFactor;

public class SumFactorTest {

    @Test
    void TestOne() {
        int[] a = { 3, 0, 2, -5, 0 };
        int expected = 2;
        assertEquals(expected, sumFactor(a));
    }

    @Test
    void TestTwo() {
        int[] a = { 9, -3, -3, -1, -1 };
        int expected = 0;
        assertEquals(expected, sumFactor(a));
    }

    @Test
    void TestThree() {
        int[] a = { 1 };
        int expected = 1;
        assertEquals(expected, sumFactor(a));
    }

    @Test
    void TestFour() {
        int[] a = { 0, 0, 0 };
        int expected = 3;
        assertEquals(expected, sumFactor(a));
    }

}
