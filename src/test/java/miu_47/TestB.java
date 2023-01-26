package miu_47;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestB {

    @Test
    void TestOne() {
        int n = 198;
        int catlen = 2;
        int expected = 1;
        assertEquals(expected, QuestionB.checkConcatenatedSum(n, catlen));
    }

    @Test
    void TestTwo() {
        int n = 198;
        int catlen = 3;
        int expected = 0;
        assertEquals(expected, QuestionB.checkConcatenatedSum(n, catlen));
    }

    @Test
    void TestThree() {
        int n = 9;
        int catlen = 1;
        int expected = 1;
        assertEquals(expected, QuestionB.checkConcatenatedSum(n, catlen));
    }

    @Test
    void TestFour() {
        int n = 2997;
        int catlen = 3;
        int expected = 1;
        assertEquals(expected, QuestionB.checkConcatenatedSum(n, catlen));
    }

    @Test
    void TestFive() {
        int n = 2997;
        int catlen = 2;
        int expected = 0;
        assertEquals(expected, QuestionB.checkConcatenatedSum(n, catlen));
    }

    @Test
    void TestSix() {
        int n = 13332;
        int catlen = 4;
        int expected = 1;
        assertEquals(expected, QuestionB.checkConcatenatedSum(n, catlen));
    }

}
