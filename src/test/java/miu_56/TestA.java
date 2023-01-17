package miu_56;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class TestA {
    
    @Test
    void Test1() {
        int n = 3735;
        int[] expected = {1, 2, 15};
        assertEquals(Arrays.toString(expected), Arrays.toString(QuestionA.computeHMS(n)));
    }

    @Test
    void Test2() {
        int n = 380;
        int[] expected = {0, 6, 20};
        assertEquals(Arrays.toString(expected), Arrays.toString(QuestionA.computeHMS(n)));
    }

    @Test
    void Test3() {
        int n = 3650;
        int[] expected = {1, 0, 50};
        assertEquals(Arrays.toString(expected), Arrays.toString(QuestionA.computeHMS(n)));
    }

    @Test
    void Test4() {
        int n = 55;
        int[] expected = {0, 0, 55};
        assertEquals(Arrays.toString(expected), Arrays.toString(QuestionA.computeHMS(n)));
    }

    @Test
    void Test5() {
        int n = 0;
        int[] expected = {0, 0, 0};
        assertEquals(Arrays.toString(expected), Arrays.toString(QuestionA.computeHMS(n)));
    }

}
