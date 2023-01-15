package miu_51;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class TestC {
    
    @Test
    void TestOne() {
        int n = 0;
        int[] expected = {1};
        assertEquals(Arrays.toString(expected), Arrays.toString(QuestionC.encodeArray(n)));
    }

    @Test
    void TestTwo() {
        int n = 1;
        int[] expected = {0, 1};
        assertEquals(Arrays.toString(expected), Arrays.toString(QuestionC.encodeArray(n)));
    }

    @Test
    void TestThree() {
        int n = -1;
        int[] expected = {-1, 0, 1};
        assertEquals(Arrays.toString(expected), Arrays.toString(QuestionC.encodeArray(n)));
    }

    @Test
    void TestFour() {
        int n = 100001;
        int[] expected = {0, 1, 1, 1, 1, 1, 0, 1};
        assertEquals(Arrays.toString(expected), Arrays.toString(QuestionC.encodeArray(n)));
    }

    @Test
    void TestFive() {
        int n = 999;
        int[] expected = {0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1};
        assertEquals(Arrays.toString(expected), Arrays.toString(QuestionC.encodeArray(n)));
    }

}
