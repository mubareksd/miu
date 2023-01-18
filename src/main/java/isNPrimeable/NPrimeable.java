package isNPrimeable;

import static prime.Prime.isPrime;

public class NPrimeable {
    public static int isNPrimeable(int[] a, int n) {
        int ret = 1;
        for (int i = 0; i < a.length; i++) {
            if (!isPrime(a[i] + n)) {
                ret = 0;
                break;
            }
        }

        return ret;
    }
}