package isTwinPrime;

import static prime.Prime.isPrime;

public class TwinPrime {
    public static int isTwinPrime(int n) {
        if (isPrime(n))
            if (isPrime(n + 2) || isPrime(n - 2))
                return 1;
        return 0;
    }
}
