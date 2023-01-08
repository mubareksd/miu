/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package miu_04;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mubareksd
 */
public class SolutionOneTest {
    
    SolutionOne solution = new SolutionOne();
    
    @Test
    public void testOne() {
        int n = 1234;
        int expected = 4321;
        assertEquals(expected, solution.f(n));
    }
    
    @Test
    public void testTwo() {
        int n = 12005;
        int expected = 50021;
        assertEquals(expected, solution.f(n));
    }
    
    @Test
    public void testThree() {
        int n = 1;
        int expected = 1;
        assertEquals(expected, solution.f(n));
    }
    
    @Test
    public void testFour() {
        int n = 1000;
        int expected = 1;
        assertEquals(expected, solution.f(n));
    }
    
    @Test
    public void testFive() {
        int n = 0;
        int expected = 0;
        assertEquals(expected, solution.f(n));
    }
    
    @Test
    public void testSix() {
        int n = -12345;
        int expected = -54321;
        assertEquals(expected, solution.f(n));
    }
}
