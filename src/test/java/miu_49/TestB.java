package miu_49;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestB {
    
    @Test
    public void testOne() {
        int n = 153;
        int expected = 1;
        assertEquals(expected, QuestionB.isCubePowerful(n));
    }

    @Test
    public void testTwo() {
        int n = 370;
        int expected = 1;
        assertEquals(expected, QuestionB.isCubePowerful(n));
    }

    @Test
    public void testThree() {
        int n = 371;
        int expected = 1;
        assertEquals(expected, QuestionB.isCubePowerful(n));
    }

    @Test
    public void testFour() {
        int n = 407;
        int expected = 1;
        assertEquals(expected, QuestionB.isCubePowerful(n));
    }

    @Test
    public void testFive() {
        int n = 87;
        int expected = 0;
        assertEquals(expected, QuestionB.isCubePowerful(n));
    }

    @Test
    public void testSix() {
        int n = 0;
        int expected = 0;
        assertEquals(expected, QuestionB.isCubePowerful(n));
    }

    @Test
    public void testSeven() {
        int n = -81;
        int expected = 0;
        assertEquals(expected, QuestionB.isCubePowerful(n));
    }

}
