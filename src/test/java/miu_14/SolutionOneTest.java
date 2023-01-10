/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package miu_14;

import static miu_14.SolutionOne.isMadhavArray;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mubareksd
 */
public class SolutionOneTest {

    @Test
    public void testOne() {
        int[] a = { 2, 1, 1 };
        int expected = 1;
        assertEquals(expected, isMadhavArray(a));
    }

    @Test
    public void testTwo() {
        int[] a = { 2, 1, 1, 4, -1, -1 };
        int expected = 1;
        assertEquals(expected, isMadhavArray(a));
    }

    @Test
    public void testThree() {
        int[] a = { 6, 2, 4, 2, 2, 2, 1, 5, 0, 0 };
        int expected = 1;
        assertEquals(expected, isMadhavArray(a));
    }

    @Test
    public void testFour() {
        int[] a = { 18, 9, 10, 6, 6, 6 };
        int expected = 0;
        assertEquals(expected, isMadhavArray(a));
    }

    @Test
    public void testFive() {
        int[] a = { -6, -3, -3, 8, -5, -4 };
        int expected = 0;
        assertEquals(expected, isMadhavArray(a));
    }

    @Test
    public void testSix() {
        int[] a = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1 };
        int expected = 1;
        assertEquals(expected, isMadhavArray(a));
    }

    @Test
    public void testSeven() {
        int[] a = { 3, 1, 2, 3, 0 };
        int expected = 0;
        assertEquals(expected, isMadhavArray(a));
    }
}
