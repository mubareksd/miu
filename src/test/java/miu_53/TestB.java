package miu_53;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestB {

    @Test
    void TestOne() {
        char[] a1 = { 's', 'i', 't' };
        char[] a2 = { 'i', 't', 's' };
        int expected = 1;
        assertEquals(expected, QuestionB.areAnagrams(a1, a2));
    }

    @Test
    void TestTwo() {
        char[] a1 = { 's', 'i', 't' };
        char[] a2 = { 'i', 'd', 's' };
        int expected = 0;
        assertEquals(expected, QuestionB.areAnagrams(a1, a2));
    }

    @Test
    void TestThree() {
        char[] a1 = { 'b', 'i', 'g' };
        char[] a2 = { 'b', 'i', 't' };
        int expected = 0;
        assertEquals(expected, QuestionB.areAnagrams(a1, a2));
    }

    @Test
    void TestFour() {
        char[] a1 = { 'b', 'o', 'g' };
        char[] a2 = { 'b', 'o', 'o' };
        int expected = 0;
        assertEquals(expected, QuestionB.areAnagrams(a1, a2));
    }

    @Test
    void TestFive() {
        char[] a1 = {};
        char[] a2 = {};
        int expected = 1;
        assertEquals(expected, QuestionB.areAnagrams(a1, a2));
    }

    @Test
    void TestSix() {
        char[] a1 = { 'b', 'i', 'g' };
        char[] a2 = { 'b', 'i', 'g' };
        int expected = 1;
        assertEquals(expected, QuestionB.areAnagrams(a1, a2));
    }

}
