package isNPrimeable;

public class NPrimeable {

    static Boolean isPrime(int n) {
        Boolean prime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                prime = false;
            }
        }

        return prime;
    }

    static int isNPrimeable(int[] a, int n) {
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