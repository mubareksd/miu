package isZeroLimited;

public class ZeroLimited {
    public static int isZeroLimited(int[] a) {
        for (int i = 0, j = 0; i < a.length; i++) {
            if (3 * i + 1 < a.length) {
                if (a[3 * i + 1] != 0)
                    return 0;
            }
            if (i == 3 * j + 1) {
                j++;
                continue;
            } else {
                if (a[i] == 0)
                    return 0;
            }
        }
        return 1;
    }
}
