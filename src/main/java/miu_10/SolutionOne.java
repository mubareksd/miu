package miu_10;

public class SolutionOne {
    // TODO: Fix
    public static int[] doIntegerBasedRounding(int[] a, int n) {
        n = Math.abs(n);
        for (int i = 0; i < a.length; i++) {
            int mod = a[i] % n;
            if (a[i] > 0) {
                if (mod < n / 2f) {
                    a[i] -= mod;
                } else {
                    a[i] += (n - mod);
                }
            }
        }
        return a;
    }
}
