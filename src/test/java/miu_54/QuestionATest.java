package miu_54;

import static miu_54.QuestionA.isVesuvian;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class QuestionATest {
    @Test
    public void testOne() {
        int n = 50;
        int expected = 1;
        assertEquals(expected, isVesuvian(n));
    }

    @Test
    public void testTwo() {
        int n = 65;
        int expected = 1;
        assertEquals(expected, isVesuvian(n));
    }

    @Test
    public void testThree() {
        int n = 85;
        int expected = 1;
        assertEquals(expected, isVesuvian(n));
    }
}
