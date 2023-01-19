package isDaphneArray;

public class DaphneArray {
    public static int isDaphneArray(int[] a) {

        if (a == null || a.length == 0 || a[a.length - 1] == 1)
            return 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == 1 && a[i + 1] % 2 == 0)
                return 0;
        }
        return 1;
    }
}
