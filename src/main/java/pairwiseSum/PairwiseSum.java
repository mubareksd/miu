package pairwiseSum;

public class PairwiseSum {
    static int[] pairwiseSum(int[] a) {

        if (a.length % 2 == 0 && a.length != 0) {
            int[] newA = new int[a.length / 2];
            for (int i = 0, j = 0; j < a.length - 1; i++, j += 2)
                newA[i] = a[j] + a[j + 1];
            return newA;
        }

        return null;
    }
}
