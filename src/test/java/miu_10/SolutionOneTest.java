/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package miu_10;

import static miu_10.SolutionOne.doIntegerBasedRounding;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mubareksd
 */
public class SolutionOneTest {
    
    @Test
    public void testOne() {
        int[] a = {1, 2, 3, 4, 5};
        int n = 2;
        int[] expected = {2, 2, 4, 4, 6};
        assertArrayEquals(expected, doIntegerBasedRounding(a, n));
    }
    
    @Test
    public void testTwo() {
        int[] a = {1, 2, 3, 4, 5};
        int n = 3;
        int[] expected = {0, 3, 3, 3, 6};
        assertArrayEquals(expected, doIntegerBasedRounding(a, n));
    }
    
    @Test
    public void testThree() {
        int[] a = {1, 2, 3, 4, 5};
        int n = -3;
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, doIntegerBasedRounding(a, n));
    }
    
    @Test
    public void testFour() {
        int[] a = {-1, -2, -3, -4, -5};
        int n = 3;
        int[] expected = {-1, -2, -3, -4, -5};
        assertArrayEquals(expected, doIntegerBasedRounding(a, n));
    }
    
    @Test
    public void testFive() {
        int[] a = {-18, 1, 2, 3, 4, 5};
        int n = 4;
        int[] expected = {-18, 0, 4, 4, 4, 4};
        assertArrayEquals(expected, doIntegerBasedRounding(a, n));
    }
    
    @Test
    public void testSix() {
        int[] a = {-18, 0, 4, 4, 4, 4};
        int n = 5;
        int[] expected = {0, 0, 5, 5, 5};
        assertArrayEquals(expected, doIntegerBasedRounding(a, n));
    }
    
    @Test
    public void testSeven() {
        int[] a = {1, 2, 3, 4, 5};
        int n = 100;
        int[] expected = {0, 0, 0, 0, 0};
        assertArrayEquals(expected, doIntegerBasedRounding(a, n));
    }
}
