package miu_48;

import static miu_48.QuestionB.encodeNumber;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class QuestionBTest {
    @Test
    public void testOne() {
        int n = 2;
        int[] expected = { 2 };
        assertArrayEquals(expected, encodeNumber(n));
    }

    @Test
    public void testTwo() {
        int n = 6;
        int[] expected = { 2, 3 };
        assertArrayEquals(expected, encodeNumber(n));
    }

    @Test
    public void testThree() {
        int n = 14;
        int[] expected = { 2, 7 };
        assertArrayEquals(expected, encodeNumber(n));
    }

    @Test
    public void testFour() {
        int n = 24;
        int[] expected = { 2, 2, 2, 3 };
        assertArrayEquals(expected, encodeNumber(n));
    }

    @Test
    public void testFive() {
        int n = 1200;
        int[] expected = { 2, 2, 2, 2, 3, 5, 5 };
        assertArrayEquals(expected, encodeNumber(n));
    }

    @Test
    public void testSix() {
        int n = 1;
        int[] expected = null;
        assertArrayEquals(expected, encodeNumber(n));
    }

    @Test
    public void testSeven() {
        int n = -18;
        int[] expected = null;
        assertArrayEquals(expected, encodeNumber(n));
    }
}
