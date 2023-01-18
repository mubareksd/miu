package perfectSquare;

public class PerfectSquare {
    static int isPerfectSquare(int n) {
        int perfect = 0;

        if (n >= 0)
            for (int i = 0; i <= n; i++)
                if (i * i == n)
                    perfect = 1;

        return perfect;
    }

    static int nextPerfectSquare(int n) {
        for (int i = n + 1;; i++) {
            if (isPerfectSquare(i) == 1)
                return i;
        }
    }
}
