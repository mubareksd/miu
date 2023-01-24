package isHollow;

public record Hollow() {
    public static int isHollow(int[] a) {
        if (a.length < 3)
            return 0;

        int zeroCount = 0;

        for (int i = 0, j = a.length - 1; i <= j; i++, j--) {
            if ((a[i] == 0 && a[j] != 0) || (a[i] != 0 && a[j] == 0)) {
                return 0;
            }
            if (i == j && a[i] == 0) {
                zeroCount++;
            } else {
                if (a[i] == 0)
                    zeroCount++;

                if (a[j] == 0)
                    zeroCount++;
            }
        }

        if (zeroCount >= 3)
            return 1;
        return 0;
    }
}
