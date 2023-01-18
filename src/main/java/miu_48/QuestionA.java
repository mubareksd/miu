package miu_48;

public class QuestionA {
    static Boolean isPrime(int n) {
        Boolean primeNumber = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                primeNumber = false;
            }
        }

        return primeNumber;
    }

    static int largestPrimeFactor(int n) {
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