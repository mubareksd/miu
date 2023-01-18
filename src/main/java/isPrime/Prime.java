package isPrime;

public class Prime {
    public static boolean isPrime(int n) {
        boolean prime = true;
        for (int i = 2; i < n; i++)
            if (n % i == 0) {
                prime = false;
                break;
            }
        return prime;
    }

    public static int nextPrime(int n) {
        int m = n + 1;
        while (!isPrime(m)) {
            m++;
        }

        return m;
    }
}