package solve10;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static solve10.Solve10.getFactorial;

public class Solve10Test {

    @Test
    void TestOne() {
        int n = 5;
        int expected = 120;
        assertEquals(expected, getFactorial(n));
    }

}
