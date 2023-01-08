/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package miu_02;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mubareksd
 */
public class MainTest {

    SolutionOne solution = new SolutionOne();

    @Test
    public void testOne() {
        int[] array = {1};
        assertEquals(1, solution.sumOddEven(array));
    }
    
    @Test
    public void testTwo() {
        int[] array = {1, 2};
        assertEquals(-1, solution.sumOddEven(array));
    }
    
    @Test
    public void testThree() {
        int[] array = {1, 2, 3};
        assertEquals(2, solution.sumOddEven(array));
    }
    
    @Test
    public void testFour() {
        int[] array = {1, 2, 3, 4};
        assertEquals(-2, solution.sumOddEven(array));
    }
    
    @Test
    public void testFive() {
        int[] array = {3, 3, 4, 4};
        assertEquals(-2, solution.sumOddEven(array));
    }
    
    @Test
    public void testSix() {
        int[] array = {3, 2, 3, 4};
        assertEquals(0, solution.sumOddEven(array));
    }
    
    @Test
    public void testSeven() {
        int[] array = {4, 1, 2, 3};
        assertEquals(-2, solution.sumOddEven(array));
    }
    
    @Test
    public void testEight() {
        int[] array = {1, 1};
        assertEquals(2, solution.sumOddEven(array));
    }
    
    @Test
    public void testNine() {
        int[] array = {};
        assertEquals(0, solution.sumOddEven(array));
    }
}
