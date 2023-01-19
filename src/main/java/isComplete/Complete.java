package isComplete;

import static perfectSquare.PerfectSquare.isPerfectSquare;

public class Complete {
    public static int isComplete(int[] a) {
        boolean isThereEven = false;
        boolean isTherePerfectSquare = false;

        for (int i = 0; i < a.length; i++)
            if (a[i] % 2 == 0) {
                isThereEven = true;
                break;
            }

        for (int i = 0; i < a.length; i++)
            if (isPerfectSquare(a[i])) {
                isTherePerfectSquare = true;
                break;
            }

        if (a.length > 1 && isThereEven && isTherePerfectSquare)
            for (int i = 0; i < a.length; i++)
                for (int j = i + 1; j < a.length; j++)
                    if (a[i] + a[j] == 8)
                        return 1;
        return 0;
    }
}
