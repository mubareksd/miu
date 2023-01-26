package miu_57;

public class QuestionA {

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int isAbernathy(int n) {

        int pair = 0;

        for (int i = 2; i < n / 2; i++) {
            if (isPrime(i) && isPrime(n - i))
                pair++;
        }

        return pair > 1 ? 1 : 0;

    }

}
