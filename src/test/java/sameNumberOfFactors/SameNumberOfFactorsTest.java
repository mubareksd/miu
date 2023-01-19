package sameNumberOfFactors;

import static sameNumberOfFactors.SameNumberOfFactors.sameNumberOfFactors;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SameNumberOfFactorsTest {
    @Test
    void testOne() {
        int n1 = -6;
        int n2 = 21;
        int expected = -1;
        assertEquals(expected, sameNumberOfFactors(n1, n2));
    }

    @Test
    void testTwo() {
        int n1 = 6;
        int n2 = 21;
        int expected = 1;
        assertEquals(expected, sameNumberOfFactors(n1, n2));
    }

    @Test
    void testThree() {
        int n1 = 8;
        int n2 = 12;
        int expected = 0;
        assertEquals(expected, sameNumberOfFactors(n1, n2));
    }

    @Test
    void testFour() {
        int n1 = 23;
        int n2 = 97;
        int expected = 1;
        assertEquals(expected, sameNumberOfFactors(n1, n2));
    }

    @Test
    void testFive() {
        int n1 = 0;
        int n2 = 1;
        int expected = 0;
        assertEquals(expected, sameNumberOfFactors(n1, n2));
    }

    @Test
    void testSix() {
        int n1 = 0;
        int n2 = 0;
        int expected = 1;
        assertEquals(expected, sameNumberOfFactors(n1, n2));
    }
}
