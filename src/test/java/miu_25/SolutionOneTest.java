package miu_25;

import static miu_25.SolutionOne.henry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionOneTest {

    @Test
    void TestOne() {
        int i = 1;
        int j = 3;
        int expected = 502;
        assertEquals(expected, henry(i, j));
    }

    @Test
    void TestTwo() {
        int i = 1;
        int j = 2;
        int expected = 34;
        assertEquals(expected, henry(i, j));
    }

    @Test
    void TestThree() {
        int i = 2;
        int j = 3;
        int expected = 524;
        assertEquals(expected, henry(i, j));
    }

}
