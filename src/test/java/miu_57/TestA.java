package miu_57;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestA {

    @Test
    void TestOne() {
        int n = 16;
        int expected = 1;
        assertEquals(expected, QuestionA.isAbernathy(n));
    }

    @Test
    void Test2() {
        int n = 24;
        int expected = 1;
        assertEquals(expected, QuestionA.isAbernathy(n));
    }

    @Test
    void Test3() {
        int n = 8;
        int expected = 0;
        assertEquals(expected, QuestionA.isAbernathy(n));
    }

}
