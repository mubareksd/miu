package isSequencedArray;

public class SequencedArray {
    public static int isSequencedArray(int[] a, int m, int n) {

        int b = 0;

        for (int i = 0; i < a.length - 1; i++) {
            if ((a[i + 1] - a[i] == 0) && a[0] == m && a[a.length - 1] == n) {
                b = 1;
            } else if ((a[i + 1] - a[i] == 1) && a[0] == m && a[a.length - 1] == n) {
                b = 1;
            } else {
                return 0;
            }
        }

        return b;

    }
}
