package hasNValues;

public class HasNValues {
    public static int hasNValues(int[] a, int n) {
        int count = 0;
        if (a.length == 0 && n > a.length)
            return 0;

        for (int i = 0; i < a.length; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (a[i] == a[j])
                    break;
            }
            if (i == j) {
                count++;

            }
        }
        return count == n ? 1 : 0;
    }
}
