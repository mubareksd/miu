package isGoalPost;

import static isGoalPost.GoalPost.isGoalPost;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GoalPostTest {
    @Test
    void testOne() {
        int n = 11111;
        int expected = 1;
        assertEquals(expected, isGoalPost(n));
    }

    @Test
    void testTwo() {
        int n = 93229;
        int expected = 1;
        assertEquals(expected, isGoalPost(n));
    }

    @Test
    void testThree() {
        int n = 15432;
        int expected = 0;
        assertEquals(expected, isGoalPost(n));
    }

    @Test
    void testFour() {
        int n = 121;
        int expected = 0;
        assertEquals(expected, isGoalPost(n));
    }

    @Test
    void testFive() {
        int n = 132323231;
        int expected = 0;
        assertEquals(expected, isGoalPost(n));
    }

    @Test
    void testSix() {
        int n = -23452;
        int expected = 0;
        assertEquals(expected, isGoalPost(n));
    }
}
