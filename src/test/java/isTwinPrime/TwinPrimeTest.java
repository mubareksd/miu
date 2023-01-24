package isTwinPrime;

import static isTwinPrime.TwinPrime.isTwinPrime;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TwinPrimeTest {
    @Test
    void testOne() {
        int n = 5;
        int expected = 1;
        assertEquals(expected, isTwinPrime(n));
    }

    @Test
    void testTwo() {
        int n = 7;
        int expected = 1;
        assertEquals(expected, isTwinPrime(n));
    }

    @Test
    void testThree() {
        int n = 53;
        int expected = 0;
        assertEquals(expected, isTwinPrime(n));
    }

    @Test
    void testFour() {
        int n = 9;
        int expected = 0;
        assertEquals(expected, isTwinPrime(n));
    }
}
