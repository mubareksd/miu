package isNPrimeable.loopSum;

public class LoopSum {
    public static int loopSum(int[] a, int n) {
        int sum = 0;
        for (int i = 0, j = 0; i < a.length && j < n; i++, j++) {
            sum += a[i];
            if (i == a.length - 1 && j != n - 1)
                i = -1;
        }

        return sum;
    }
}
