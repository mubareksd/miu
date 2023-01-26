package countOnes;

import static countOnes.CountOnes.countOnes;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CountOnesTest {
    @Test
    void testOne() {
        int n = 5;
        int expected = 2;
        assertEquals(expected, countOnes(n));
    }

    @Test
    void testTwo() {
        int n = 15;
        int expected = 4;
        assertEquals(expected, countOnes(n));
    }
}
