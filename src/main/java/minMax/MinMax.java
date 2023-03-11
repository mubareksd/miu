package minMax;

public class MinMax {
    public static int[] minMax(int[] a) {
        int[] minMax = { Integer.MAX_VALUE, Integer.MIN_VALUE };
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= minMax[0])
                minMax[0] = a[i];
            else if (a[i] >= minMax[1])
                minMax[1] = a[i];
        }

        return minMax;
    }
}
