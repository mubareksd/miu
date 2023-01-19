package isGoalPost;

public class GoalPost {
    public static int isGoalPost(int n) {
        if (n > 0) {
            int lastDigit = n % 10;
            int count = 0;
            int firstDigit = 0;
            while (n != 0) {
                firstDigit = n % 10;
                count++;
                n = n / 10;
            }

            if (firstDigit == lastDigit && count == 5)
                return 1;
        }
        return 0;
    }
}
