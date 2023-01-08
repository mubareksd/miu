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
}
