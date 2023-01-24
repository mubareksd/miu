package isZeroBalanced;

public class ZeroBalanced {
    public static int isZeroBalanced(int[] a) {
        if (a.length == 0)
            return 0;
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            boolean found = false;
            for (int j = 0; j < a.length; j++)
                if (a[i] == -a[j]) {
                    found = true;
                    break;
                }
            if (!found)
                return 0;
            sum += a[i];
        }

        if (sum == 0)
            return 1;
        return 0;
    }
}
