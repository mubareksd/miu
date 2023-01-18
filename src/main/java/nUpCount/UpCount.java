package nUpCount;

public class UpCount {
    public static int nUpCount(int[] a, int n) {
        int count = 0;
        int partialSum = 0;
        int previousPartialSum = 0;

        for (int i = 0; i < a.length; i++) {
            previousPartialSum = partialSum;
            partialSum += a[i];

            if (previousPartialSum <= n && partialSum > n)
                count++;
        }

        return count;
    }
}
