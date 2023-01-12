package miu_03;

import static miu_03.SolutionOne.f;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionOneTest {

    @Test
    public void testOne() {
        char[] a = { 'a', 'b', 'c' };
        int start = 0;
        int len = 4;
        char[] expected = null;
        assertArrayEquals(expected, f(a, start, len));

    }

    @Test
    public void testTwo() {
        char[] a = { 'a', 'b', 'c' };
        int start = 0;
        int len = 3;
        char[] expected = { 'a', 'b', 'c' };
        assertArrayEquals(expected, f(a, start, len));

    }

    @Test
    public void testThree() {
        char[] a = { 'a', 'b', 'c' };
        int start = 0;
        int len = 2;
        char[] expected = { 'a', 'b' };
        assertArrayEquals(expected, f(a, start, len));

    }

    @Test
    public void testFour() {
        char[] a = { 'a', 'b', 'c' };
        int start = 0;
        int len = 1;
        char[] expected = { 'a' };
        assertArrayEquals(expected, f(a, start, len));

    }

    @Test
    public void testFive() {
        char[] a = { 'a', 'b', 'c' };
        int start = 1;
        int len = 3;
        char[] expected = null;
        assertArrayEquals(expected, f(a, start, len));

    }

    @Test
    public void testSix() {
        char[] a = { 'a', 'b', 'c' };
        int start = 1;
        int len = 2;
        char[] expected = { 'b', 'c' };
        assertArrayEquals(expected, f(a, start, len));

    }

    @Test
    public void testSeven() {
        char[] a = { 'a', 'b', 'c' };
        int start = 1;
        int len = 1;
        char[] expected = { 'b' };
        assertArrayEquals(expected, f(a, start, len));

    }

    @Test
    public void testEight() {
        char[] a = { 'a', 'b', 'c' };
        int start = 2;
        int len = 2;
        char[] expected = null;
        assertArrayEquals(expected, f(a, start, len));
    }

    @Test
    public void testNine() {
        char[] a = { 'a', 'b', 'c' };
        int start = 2;
        int len = 1;
        char[] expected = { 'c' };
        assertArrayEquals(expected, f(a, start, len));
    }

    @Test
    public void testTen() {
        char[] a = { 'a', 'b', 'c' };
        int start = 3;
        int len = 1;
        char[] expected = null;
        assertArrayEquals(expected, f(a, start, len));
    }

    @Test
    public void testEleven() {
        char[] a = { 'a', 'b', 'c' };
        int start = 1;
        int len = 0;
        char[] expected = {};
        assertArrayEquals(expected, f(a, start, len));
    }

    @Test
    public void testTwelve() {
        char[] a = { 'a', 'b', 'c' };
        int start = -1;
        int len = 0;
        char[] expected = null;
        assertArrayEquals(expected, f(a, start, len));
    }

    @Test
    public void testThirteen() {
        char[] a = { 'a', 'b', 'c' };
        int start = -1;
        int len = -2;
        char[] expected = null;
        assertArrayEquals(expected, f(a, start, len));
    }

    @Test
    public void testFourteen() {
        char[] a = {};
        int start = 0;
        int len = 1;
        char[] expected = null;
        assertArrayEquals(expected, f(a, start, len));
    }
}
