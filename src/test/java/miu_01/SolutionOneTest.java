/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package miu_01;

import static miu_01.SolutionOne.f;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author mubareksd
 */
public class SolutionOneTest {

    @Test
    public void testOne() {

        int[] a = {1, 2, 3, 4, 5};
        int expected = 0;
        assertEquals(expected, f(a));
    }

    @Test
    public void testTwo() {

        int[] a = {3, 2, 1, 4, 5};
        int expected = 1;
        assertEquals(expected, f(a));
    }

    @Test
    public void testThree() {

        int[] a = {3, 2, 1, 4, 1};
        int expected = 0;
        assertEquals(expected, f(a));
    }

    @Test
    public void testFour() {

        int[] a = {1, 2, 3, 4};
        int expected = 0;
        assertEquals(expected, f(a));
    }

    @Test
    public void testFive() {

        int[] a = {};
        int expected = 0;
        assertEquals(expected, f(a));
    }

    @Test
    public void testSix() {

        int[] a = {10};
        int expected = 1;
        assertEquals(expected, f(a));
    }
}
