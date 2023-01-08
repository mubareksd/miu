/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package miu_07;

import static miu_07.SolutionOne.primeCount;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mubareksd
 */
public class SolutionOneTest {
    
    @Test
    public void testOne() {
        int star = 10;
        int end = 30;
        int expected = 6;
        assertEquals(expected, primeCount(star, end));
    }
    
    @Test
    public void testTwo() {
        int star = 11;
        int end = 29;
        int expected = 6;
        assertEquals(expected, primeCount(star, end));
    }
    
    @Test
    public void testThree() {
        int star = 20;
        int end = 22;
        int expected = 0;
        assertEquals(expected, primeCount(star, end));
    }
    
    @Test
    public void testFour() {
        int star = 1;
        int end = 1;
        int expected = 0;
        assertEquals(expected, primeCount(star, end));
    }
    
    @Test
    public void testFive() {
        int star = 5;
        int end = 5;
        int expected = 1;
        assertEquals(expected, primeCount(star, end));
    }
    
    @Test
    public void testSix() {
        int star = 6;
        int end = 2;
        int expected = 0;
        assertEquals(expected, primeCount(star, end));
    }
    
    @Test
    public void testSeven() {
        int star = -10;
        int end = 6;
        int expected = 3;
        assertEquals(expected, primeCount(star, end));
    }
}
