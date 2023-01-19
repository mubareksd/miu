package eval;

import static eval.Eval.eval;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EvalTest {
    @Test
    void testOne() {
        double x = 1.0;
        int[] a = { 0, 1, 2, 3, 4 };
        double expected = 10.0;
        assertEquals(expected, eval(x, a));
    }

    @Test
    void testTwo() {
        double x = 3.0;
        int[] a = { 3, 2, 1 };
        double expected = 18.0;
        assertEquals(expected, eval(x, a));
    }

    @Test
    void testThree() {
        double x = 2.0;
        int[] a = { 3, -2, -1 };
        double expected = -5.0;
        assertEquals(expected, eval(x, a));
    }

    @Test
    void testFour() {
        double x = -3.0;
        int[] a = { 3, 2, 1 };
        double expected = 6.0;
        assertEquals(expected, eval(x, a));
    }

    @Test
    void testFive() {
        double x = 2.0;
        int[] a = { 3, 2 };
        double expected = 7.0;
        assertEquals(expected, eval(x, a));
    }

    @Test
    void testSix() {
        double x = 2.0;
        int[] a = { 4, 0, 9 };
        double expected = 40.0;
        assertEquals(expected, eval(x, a));
    }

    @Test
    void testSeven() {
        double x = 2.0;
        int[] a = { 10 };
        double expected = 10.0;
        assertEquals(expected, eval(x, a));
    }

    @Test
    void testEight() {
        double x = 10.0;
        int[] a = { 0, 1 };
        double expected = 10.0;
        assertEquals(expected, eval(x, a));
    }
}
