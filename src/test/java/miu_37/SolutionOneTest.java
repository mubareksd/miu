package miu_37;

import static miu_37.SolutionOne.countRepresentations;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionOneTest {

    @Test
    void TestOne() {
        int numRupees = 12;
        int expected = 15;
        assertEquals(expected, countRepresentations(numRupees));
    }
}
