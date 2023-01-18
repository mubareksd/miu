package countSquarePairs;

import static countSquarePairs.CountSquarePairs.countSquarePairs;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CountSquarePairsTest {

    @Test
    void TestOne() {
        int[] a = { 9, 0, 2, -5, 7 };
        int expected = 2;
        assertEquals(expected, countSquarePairs(a));
    }

    @Test
    void TestTwo() {
        int[] a = { 9 };
        int expected = 0;
        assertEquals(expected, countSquarePairs(a));
    }

}
