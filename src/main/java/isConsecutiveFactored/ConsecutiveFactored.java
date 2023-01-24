package isConsecutiveFactored;

public class ConsecutiveFactored {
    public static int isConsecutiveFactored(int n) {
        for (int i = 2; i < n; i++)
            if (n % i == 0 && n % (i + 1) == 0)
                return 1;
        return 0;
    }
}
