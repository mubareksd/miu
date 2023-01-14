package miu_41;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class SolutionOneTest {
    
    @Test
    void TestOne() {

        int[] a = {0, 0, 0, 2, 0, 2, 0, 2, 0, 0};
        int[] expected = {0, 2, 0, 2, 0, 2, 0};
        assertEquals(Arrays.toString(expected), Arrays.toString(SolutionOne.clusterCompression(a)));

    }

    @Test
    void TestTwo() {

        int[] a = {18};
        int[] expected = {18};
        assertEquals(Arrays.toString(expected), Arrays.toString(SolutionOne.clusterCompression(a)));

    }

    @Test
    void TestThree() {

        int[] a = {};
        int[] expected = {};
        assertEquals(Arrays.toString(expected), Arrays.toString(SolutionOne.clusterCompression(a)));

    }

    @Test
    void TestFour() {

        int[] a = {-5, -5, -5, -5, -5};
        int[] expected = {-5};
        assertEquals(Arrays.toString(expected), Arrays.toString(SolutionOne.clusterCompression(a)));

    }

    @Test
    void TestFive() {

        int[] a = {1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1};
        int[] expected = {1, 2, 1};
        assertEquals(Arrays.toString(expected), Arrays.toString(SolutionOne.clusterCompression(a)));

    }

    @Test
    void TestSix() {

        int[] a = {8, 8, 6, 6, -2, -2, -2};
        int[] expected = {8, 6, -2};
        assertEquals(Arrays.toString(expected), Arrays.toString(SolutionOne.clusterCompression(a)));

    }

}
