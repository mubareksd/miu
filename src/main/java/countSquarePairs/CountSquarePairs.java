package countSquarePairs;

import static perfectSquare.PerfectSquare.isPerfectSquare;

public class CountSquarePairs {
    public static int countSquarePairs(int[] a) {

        if (a.length < 2)
            return 0;

        int count = 0;

        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a.length; j++)
                if (i != j && a[i] > 0 && a[j] > 0)
                    if (a[i] < a[j] && isPerfectSquare(a[i] + a[j]))
                        count++;

        return count;
    }
}
