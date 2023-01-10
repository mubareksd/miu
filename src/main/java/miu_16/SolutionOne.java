package miu_16;

public class SolutionOne {

    static int isPerfectSquare(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (i * i == n) {
                return 1;
            }
        }

        return 0;
    }

    public static int countSquarePairs(int[] a) {

        if (a.length < 2) {
            return 0;
        }

        int count = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i != j && a[i] > 0 && a[j] > 0) {
                    if (a[i] < a[j] && isPerfectSquare(a[i] + a[j]) == 1) {
                        count++;
                    }
                }
            }
        }

        return count;

    }

}
