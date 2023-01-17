package miu_52;

public class QuestionB {
    static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return n > 0;
    }

    static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return (n * factorial(n - 1));
    }

    public static int isFactorialPrime(int n) {
        if (isPrime(n)) {
            int sum = 0;
            for (int i = 1; i < n && sum < n; i++) {
                sum = factorial(i) + 1;
            }

            if (sum == n)
                return 1;
            else
                return 0;
        }
        return 0;
    }
}
