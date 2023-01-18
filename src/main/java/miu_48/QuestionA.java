package miu_48;

import static prime.Prime.isPrime;

public class QuestionA {

    public static int largestPrimeFactor(int n) {
        int large = 0;

        if (n <= 1)
            return 0;

        for (int i = 2; i < n; i++) {
            if (isPrime(i) && n % i == 0)
                large = i;
        }

        return large;
    }
}