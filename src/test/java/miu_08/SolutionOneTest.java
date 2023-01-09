/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package miu_08;

import static miu_08.SolutionOne.decodeArray;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mubareksd
 */
public class SolutionOneTest {
    
    @Test
    public void testOne() {
        int[] a = {1};
        int expected = 0;
        assertEquals(expected, decodeArray(a));
    }
    
    @Test
    public void testTwo() {
        int[] a = {0, 1};
        int expected = 1;
        assertEquals(expected, decodeArray(a));
    }
    
    @Test
    public void testThree() {
        int[] a = {-1, 0, 1};
        int expected = -1;
        assertEquals(expected, decodeArray(a));
    }
    
    @Test
    public void testFour() {
        int[] a = {0, 1, 1, 1, 1, 1, 0, 1};
        int expected = 100001;
        assertEquals(expected, decodeArray(a));
    }
    
    @Test
    public void testFive() {
        int[] a = {0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1};
        int expected = 999;
        assertEquals(expected, decodeArray(a));
    }
}
