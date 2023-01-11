package miu_22;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionOneTest {
    
    @Test
    void TestOne() {
        int n = 5;
        int expected = 120;
        assertEquals(expected, SolutionOne.getFactorial(n));
    }


}
