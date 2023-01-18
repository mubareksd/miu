package perfectSquare;

public class PerfectSquare {
    public static boolean isPerfectSquare(int n) {
        boolean perfect = false;
        if (n >= 0)
            for (int i = 0; i <= n; i++)
                if (i * i == n)
                    perfect = true;
        return perfect;
    }

    public static int nextPerfectSquare(int n) {
        for (int i = n + 1;; i++) {
            if (isPerfectSquare(i))
                return i;
        }
    }
}
