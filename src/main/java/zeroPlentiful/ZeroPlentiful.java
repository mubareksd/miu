package zeroPlentiful;

public class ZeroPlentiful {
    public static int zeroPlentiful(int[] a) {

        if (a.length < 4) {
            return 0;
        }

        int countZero = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0 && i + 3 < a.length) {
                for (int j = i; j <= i + 3; j++) {
                    if (countZero == 4) {
                        break;
                    } else if (a[j] == 0) {
                        countZero++;
                    } else {
                        countZero = 0;
                    }
                }
            }
        }

        return countZero >= 4 ? 1 : 0;
    }
}
