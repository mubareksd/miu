package miu_54;

import static miu_54.QuestionC.isFibonacci;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class QuestionCTest {
    @Test
    void testOne() {
        int n = 1;
        int expected = 1;
        assertEquals(expected, isFibonacci(n));
    }

    @Test
    void testTwo() {
        int n = 2;
        int expected = 1;
        assertEquals(expected, isFibonacci(n));
    }

    @Test
    void testThree() {
        int n = 3;
        int expected = 1;
        assertEquals(expected, isFibonacci(n));
    }

    @Test
    void testFour() {
        int n = 4;
        int expected = 0;
        assertEquals(expected, isFibonacci(n));
    }

    @Test
    void testFive() {
        int n = 5;
        int expected = 1;
        assertEquals(expected, isFibonacci(n));
    }
}
