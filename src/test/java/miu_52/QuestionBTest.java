package miu_52;

import static miu_52.QuestionB.isFactorialPrime;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class QuestionBTest {
    @Test
    public void testOne() {
        int n = 2;
        int expected = 1;
        assertEquals(expected, isFactorialPrime(n));
    }

    @Test
    public void testTwo() {
        int n = 3;
        int expected = 1;
        assertEquals(expected, isFactorialPrime(n));
    }

    @Test
    public void testThree() {
        int n = 7;
        int expected = 1;
        assertEquals(expected, isFactorialPrime(n));
    }

    @Test
    public void testFour() {
        int n = 8;
        int expected = 0;
        assertEquals(expected, isFactorialPrime(n));
    }

    @Test
    public void testFive() {
        int n = 11;
        int expected = 0;
        assertEquals(expected, isFactorialPrime(n));
    }

    @Test
    public void testSix() {
        int n = 721;
        int expected = 0;
        assertEquals(expected, isFactorialPrime(n));
    }
}
