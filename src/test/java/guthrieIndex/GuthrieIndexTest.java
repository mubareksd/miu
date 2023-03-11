package guthrieIndex;

import org.junit.jupiter.api.Test;

import static guthrieIndex.GuthrieIndex.guthrieIndex;
import static org.junit.jupiter.api.Assertions.*;

public class GuthrieIndexTest {

    @Test
    void TestOne() {
        int n = 1;
        int expected = 0;
        assertEquals(expected, guthrieIndex(n));
    }

    @Test
    void TestTwo() {
        int n = 2;
        int expected = 1;
        assertEquals(expected, guthrieIndex(n));
    }

    @Test
    void TestThree() {
        int n = 3;
        int expected = 7;
        assertEquals(expected, guthrieIndex(n));
    }

    @Test
    void TestFour() {
        int n = 4;
        int expected = 2;
        assertEquals(expected, guthrieIndex(n));
    }

    @Test
    void TestFive() {
        int n = 42;
        int expected = 8;
        assertEquals(expected, guthrieIndex(n));
    }
}
