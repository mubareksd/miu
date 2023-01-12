package miu_18;

import static miu_18.SolutionOne.isGuthrieSequence;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionOneTest {

    @Test
    void TestOne() {
        int[] a = { 8, 4, 2, 1 };
        int expected = 1;
        assertEquals(expected, isGuthrieSequence(a));
    }

    @Test
    void TestTwo() {
        int[] a = { 8, 17, 4, 1 };
        int expected = 0;
        assertEquals(expected, isGuthrieSequence(a));
    }

    @Test
    void TestThree() {
        int[] a = { 8, 4, 1 };
        int expected = 0;
        assertEquals(expected, isGuthrieSequence(a));
    }

    @Test
    void TestFour() {
        int[] a = { 8, 4, 2 };
        int expected = 0;
        assertEquals(expected, isGuthrieSequence(a));
    }

}
