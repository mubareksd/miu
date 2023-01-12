package miu_22;

import static miu_22.SolutionOne.getFactorial;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionOneTest {

    @Test
    void TestOne() {
        int n = 5;
        int expected = 120;
        assertEquals(expected, getFactorial(n));
    }

}
