/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package miu_01;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author mubareksd
 */
class MainTest {
    
    SolutionOne solution = new SolutionOne();
    
    @Test
    void testOne() {
        
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(0, solution.isCentered(array));
    }
    
    @Test
    void testTwo() {
        
        int[] array = {3, 2, 1, 4, 5};
        assertEquals(1, solution.isCentered(array));
    }
    
    @Test
    void testThree() {
        
        int[] array = {3, 2, 1, 4, 1};
        assertEquals(0, solution.isCentered(array));
    }
    
    @Test
    void testFour() {
        
        int[] array = {1, 2, 3, 4};
        assertEquals(0, solution.isCentered(array));
    }
    
    @Test
    void testFive() {
        
        int[] array = {};
        assertEquals(0, solution.isCentered(array));
    }
    
    @Test
    void testSix() {
        
        int[] array = {10};
        assertEquals(1, solution.isCentered(array));
    }
}
