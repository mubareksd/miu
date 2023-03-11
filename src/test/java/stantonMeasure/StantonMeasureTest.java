package stantonMeasure;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static stantonMeasure.StantonMeasure.stantonMeasure;

public class StantonMeasureTest {

    @Test
    void TestOne() {
        int[] a = { 1 };
        int expected = 1;
        assertEquals(expected, stantonMeasure(a));
    }

    @Test
    void TestTwo() {
        int[] a = { 0 };
        int expected = 1;
        assertEquals(expected, stantonMeasure(a));
    }

    @Test
    void TestThree() {
        int[] a = { 3, 1, 1, 4 };
        int expected = 0;
        assertEquals(expected, stantonMeasure(a));
    }

    @Test
    void TestFour() {
        int[] a = { 1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4 };
        int expected = 6;
        assertEquals(expected, stantonMeasure(a));
    }

    @Test
    void TestFive() {
        int[] a = {};
        int expected = 0;
        assertEquals(expected, stantonMeasure(a));
    }

}
